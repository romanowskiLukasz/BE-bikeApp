INSERT into bike (brand,model,year,weight,size,date_of_purchase,user_id,img) values ('Scott','Scale 935',2018,10.8,'M','2018-01-01',1,'https://dgtzuqphqg23d.cloudfront.net/ZviqP670h7SNJw7XOGmbZddtVq7cRpTiJrzJ7tnmCHw-2048x1151.jpg');
INSERT into bike (brand,model,year,weight,size,date_of_purchase,user_id,img) values ('Specialized','Tarmac SL6',2019,7.5,56,'2019-06-05',1,'https://dgtzuqphqg23d.cloudfront.net/N853wCX2kdIq8dv-SqR1zxQ_J-WVt-EEQZRLv4fwXEQ-2048x1150.jpg');
INSERT into bike (brand,model,year,weight,size,date_of_purchase,user_id,img) values ('Specialized','Tarmac SL7',2022,7.5,56,'2019-06-05',2,'');

INSERT into bike_part (category,distance,date,model,bike_id,purchase_date,bike_type,last_distance_updated) values ('chain',20000,'2022-11-01','Shimano XT',1,'2022-11-01','MTB','2022-08-01');
INSERT into bike_part (category,distance,date,model,bike_id,purchase_date,bike_type,last_distance_updated) values ('brakePads',20000,'2022-01-01','Shimano XT',1,'2022-11-01','MTB','2022-08-01');
INSERT into bike_part (category,distance,date,model,bike_id,purchase_date,bike_type,last_distance_updated) values ('tires',20000,'2019-12-23','vittoria mezcal',1,'2022-11-01','MTB','2022-08-01');
INSERT into bike_part (category,distance,date,model,bike_id,purchase_date,bike_type,last_distance_updated) values ('cassette',20000,'2018-01-01','Shimano XT',1,'2022-11-01','MTB','2022-08-01');
INSERT into bike_part (category,distance,date,model,bike_id,purchase_date,bike_type,last_distance_updated) values ('tirePressure',20000,'2018-01-01','vittoria mezcal',1,'2022-11-01','MTB','2022-08-01');
INSERT into bike_part (category,distance,date,model,bike_id,purchase_date,bike_type,last_distance_updated) values ('chainLube',20000,'2018-01-01','Shimano XT',1,'2022-11-01','MTB','2022-08-01');

INSERT into bike_part (category,distance,date,model,bike_id,purchase_date,bike_type,last_distance_updated) values ('chain',230,'2018-01-01','Shimano 105',2,'2022-11-01','Road',    '2022-11-01');
INSERT into bike_part (category,distance,date,model,bike_id,purchase_date,bike_type,last_distance_updated) values ('brakePads',400,'2020-02-03','Shimano 105',2,'2022-11-01','Road','2022-11-01');
INSERT into bike_part (category,distance,date,model,bike_id,purchase_date,bike_type,last_distance_updated) values ('tires',234,'2021-12-01','Shimano 105',2,'2022-11-01','Road','2022-11-01');
INSERT into bike_part (category,distance,date,model,bike_id,purchase_date,bike_type,last_distance_updated) values ('cassette',122,'2022-03-01','Shimano 105',2,   '2022-11-01','Road','2022-11-01');
INSERT into bike_part (category,distance,date,model,bike_id,purchase_date,bike_type,last_distance_updated) values ('tirePressure',30,'2018-01-01','S-Works Turbo',2,'2022-11-01','Road','2022-12-01');
INSERT into bike_part (category,distance,date,model,bike_id,purchase_date,bike_type,last_distance_updated) values ('chainLube',60,'2018-01-01','Shimano 105',2,'2022-11-01','Road','2022-12-01');

INSERT into bike_part (category,distance,date,model,bike_id,purchase_date,bike_type,last_distance_updated) values ('chain',230,'2018-01-01','Shimano XT',3,'2022-11-01','Road','2022-11-01');
INSERT into bike_part (category,distance,date,model,bike_id,purchase_date,bike_type,last_distance_updated) values ('brakePads',500,'2018-01-01','Shimano XT',3,'2022-11-01','Road',   '2022-11-01');
INSERT into bike_part (category,distance,date,model,bike_id,purchase_date,bike_type,last_distance_updated) values ('tires',700,'2018-01-01','Shimano XT',3,   '2022-11-01','Road','2022-11-01');
INSERT into bike_part (category,distance,date,model,bike_id,purchase_date,bike_type,last_distance_updated) values ('cassette',230,'2018-01-01','Shimano XT',3,'2022-11-01','Road','2022-11-01');
INSERT into bike_part (category,distance,date,model,bike_id,purchase_date,bike_type,last_distance_updated) values ('tirePressure',30,'2018-01-01','',3,'2022-11-01','MTB','2022-12-01');
INSERT into bike_part (category,distance,date,model,bike_id,purchase_date,bike_type,last_distance_updated) values ('chainLube',60,'2018-01-01','',3,'2022-11-01','MTB','2022-12-01');

INSERT into bike_part (category,distance,date,model,bike_id,purchase_date,bike_type,last_distance_updated) values ('chain',0,'2018-01-01','Shimano XT',-1,'2022-11-01','Road','2022-11-01');
INSERT into bike_part (category,distance,date,model,bike_id,purchase_date,bike_type,last_distance_updated) values ('chain',0,'2018-01-01','Sram Eagle XXX',-1,'2022-10-01','Road','2022-10-01');
INSERT into bike_part (category,distance,date,model,bike_id,purchase_date,bike_type,last_distance_updated) values ('chain',0,'2018-01-01','Shimano XTR',-1,'2022-12-11','MTB',  '2022-12-11');
INSERT into bike_part (category,distance,date,model,bike_id,purchase_date,bike_type,last_distance_updated) values ('brakePads',0,'2018-01-01','Shimano XT',-1,'2022-11-01','Road','2022-11-01');
INSERT into bike_part (category,distance,date,model,bike_id,purchase_date,bike_type,last_distance_updated) values ('tires',0,'2018-01-01','Shimano XT',-1,   '2022-11-01','Road','2022-11-01');
INSERT into bike_part (category,distance,date,model,bike_id,purchase_date,bike_type,last_distance_updated) values ('cassette',0,'2018-01-01','Shimano XT',-1,'2022-11-01','Road','2022-11-01');

INSERT into users (refresh_token,email,name,password,profile_img) values ('02f81ddeef97849fe4d00c72c980259a0c085ac0','lukas.r200@gmail.com','Lukasz Romanowski','$2a$10$d0azZD.xEcl.h9TYCVWs.unvTEB4LFqtfkQ3Jgi.XsTs1VbyL3jya','https://dgalywyr863hv.cloudfront.net/pictures/athletes/14592553/9923464/2/large.jpg');