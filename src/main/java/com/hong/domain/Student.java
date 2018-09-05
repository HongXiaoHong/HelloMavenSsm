package com.hong.domain;

public class Student {
	/*
	 *   `id` int(11) NOT NULL AUTO_INCREMENT,
	  `stuName` varchar(32) DEFAULT NULL,
	  `sex` varchar(10) DEFAULT NULL,
	  `squadId` int(11) DEFAULT NULL,
	  PRIMARY KEY (`id`),
	  KEY `squadId` (`squadId`),
	 */
		private int id;
		private String stuName;
		private String sex;
		private Squad sq;
		public Student() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Student(int id, String stuName, String sex, Squad sq) {
			super();
			this.id = id;
			this.stuName = stuName;
			this.sex = sex;
			this.sq = sq;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getStuName() {
			return stuName;
		}
		public void setStuName(String stuName) {
			this.stuName = stuName;
		}
		public String getSex() {
			return sex;
		}
		public void setSex(String sex) {
			this.sex = sex;
		}
		public Squad getSq() {
			return sq;
		}
		public void setSq(Squad sq) {
			this.sq = sq;
		}
		
}
