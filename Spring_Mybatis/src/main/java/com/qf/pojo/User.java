package com.qf.pojo;


    public class User {
        private Integer id;
        private String name;
        private Float money;

        public User(String name, Float money) {
            this.name = name;
            this.money = money;
        }

        public User() {
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Float getMoney() {
            return money;
        }

        public void setMoney(Float money) {
            this.money = money;
        }
    }

