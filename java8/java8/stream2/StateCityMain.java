package com.yash.java8.stream2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

/**
 * 
 * @author om.gadewar
 *
 */
  public class StateCityMain {
	
	
	static Logger logger=Logger.getLogger(StateCityMain.class.getClass());
	private static int sum;
	private static int sum1;
	private static int sum2;
	private static int a;
	private static int b;


	public static void main(String[] args) {
		BasicConfigurator.configure();

		//int sum=0;

		State state=new State(1,"Maharashtra");
		State state1=new State(2,"Gujrat");
		State state2=new State(3,"Punjab");

		ArrayList<City>cityInfo=new ArrayList<>();
		City c1=new City(1, "pune", state, 10f, 320986, 15);
		City c2=new City(2, "surat", state1, 8f, 42986, 18);
		City c3=new City(3, "Baramati", state, 2f, 10986, 11);
		City c4=new City(4, "lahor", state2, 3f, 48986, 9);
		City c5=new City(5, "Mumbai", state, 7f, 420986, 21);
		City c6=new City(6, "Rajkot", state1, 9f, 98986, 14);

		cityInfo.add(c1);
		cityInfo.add(c2);
		cityInfo.add(c3);
		cityInfo.add(c4);
		cityInfo.add(c5);
		cityInfo.add(c6);


		Integer minArea = Stream.of(c1.getArea_of_city(),c2.getArea_of_city(),c3.getArea_of_city(),c4.getArea_of_city(),c5.getArea_of_city(),c6.getArea_of_city())
				.min(Comparator.comparing(Integer::valueOf))
				.get();

		Integer maxArea = Stream.of(c1.getArea_of_city(),c2.getArea_of_city(),c3.getArea_of_city(),c4.getArea_of_city(),c5.getArea_of_city(),c6.getArea_of_city())
				.max(Comparator.comparing(Integer::valueOf))
				.get();

		Integer maxpopulation = Stream.of(c1.getPopulation(),c2.getPopulation(),c3.getPopulation(),c4.getPopulation(),c5.getPopulation(),c6.getPopulation())
				.max(Comparator.comparing(Integer::valueOf))
				.get();

		Float maxpopulationIndex = Stream.of(c1.getPollutionIndex(),c2.getPollutionIndex(),c3.getPollutionIndex(),c4.getPollutionIndex(),c5.getPollutionIndex(),c6.getPollutionIndex())
				.max(Comparator.comparing(Float::valueOf))
				.get();

		Float minpopulationIndex = Stream.of(c1.getPollutionIndex(),c2.getPollutionIndex(),c3.getPollutionIndex(),c4.getPollutionIndex(),c5.getPollutionIndex(),c6.getPollutionIndex())
				.min(Comparator.comparing(Float::valueOf))
				.get();


		List<City>newname=new ArrayList<>();

		/*
		 * for(City c:cityInfo) {
		 * if((c.getArea_of_city()==minArea)||(c.getPopulation()==maxpopulation)) {
		 * newname.add(c); } }
		 * 
		 * for(City c:newname) { logger.info(c.getCityname()); }
		 */
		logger.info("1. city with less area and highest population");
		cityInfo.stream().forEach((c)->{
			if((c.getArea_of_city()==minArea)||(c.getPopulation()==maxpopulation)) 
				newname.add(c); 
		});

		newname.stream().forEach(c->{
			logger.info(c.getCityname());
		});
		logger.info(" 2.city with high pollution_index and high city area. ");
		List<City>highPICA=new ArrayList<>();

		cityInfo.stream().forEach((c)->{
			if((c.getPollutionIndex()==maxpopulationIndex)||(c.getArea_of_city()==maxArea)) 
				highPICA.add(c); 
		});

		highPICA.stream().forEach(c->{
			logger.info(c.getCityname());
		});
		logger.info("3.print detail on lowest population index and so on");
		Collections.sort(cityInfo, new Comparator<City>() {

			@Override
			public int compare(City o1, City o2) {
				return o1.getPollutionIndex().compareTo(o2.getPollutionIndex());
			}
		});
		System.out.println(cityInfo);

		logger.info("4. city with Low pollution_index and Low city area. ");
		List<City>lowPICA=new ArrayList<>();

		cityInfo.stream().forEach((c)->{
			if((c.getPollutionIndex()==minpopulationIndex)||(c.getArea_of_city()==minArea)) 
				lowPICA.add(c); 
		});

		lowPICA.stream().forEach(c->{
			logger.info(c.getCityname());
		});
		logger.info("6.WAP to print total area of each state. ");
		/*
		 * for(City st:cityInfo) if(st.getObjState()==state) {
		 * sum+=st.getArea_of_city(); } logger.info(sum);
		 */
		cityInfo.stream().forEach(st->{

			if(st.getObjState()==state)
				sum+=st.getArea_of_city();

		});
		logger.info("Area Addition for Maharashtra="+sum);
		cityInfo.stream().forEach(st->{

			if(st.getObjState()==state1)
				sum1+=st.getArea_of_city();

		});
		logger.info("Area Addition for Gujrat="+sum1);


		cityInfo.stream().forEach(st->{
			if(st.getObjState()==state2)
				//a = Arrays.asList(st.getObjState()).size();
				sum2+=st.getArea_of_city();
		});
		logger.info("Area Addition for Punjab="+sum2);

	}

}
