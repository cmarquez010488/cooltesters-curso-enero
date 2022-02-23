package com.java;

public class Pintor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double width = 3.4;
		double height = 2.1 ;
		double areaPerBucket = 2.2;
		double area = 6.26;
		int etxraBuckets = 2;
		
		System.out.println("Bob needs " + getBucketCount(width, height, areaPerBucket,etxraBuckets) + " buckets" );
		System.out.println("Bob needs to buy " + getBucketCount(width, height, areaPerBucket) + " buckets before going to work" );
		System.out.println("Bob needs " + getBucketCount(area, areaPerBucket) + " buckets" );
	}
	
	public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
		if (width < 0 || height < 0 || areaPerBucket < 0 || extraBuckets < 0) {
			return -1;
		}else {
			double area = width * height;
			double bucketsNeeded = area/areaPerBucket;
			int totalBuckets = (int)Math.round(bucketsNeeded - extraBuckets);
			return totalBuckets;
		}
	}
	
	
	public static int getBucketCount(double width, double height, double areaPerBucket) {
		if (width < 0 || height < 0 || areaPerBucket < 0) {
			return -1;
		}else {
			double area = width * height;
			return (int) Math.round(area/areaPerBucket);
		}
	}
	
	public static int getBucketCount(double area, double areaPerBucket) {
		if (area < 0 || areaPerBucket < 0 ) {
			return -1;
		}else {
			return (int) Math.round(area/areaPerBucket);
		}
	}
	
	

}
