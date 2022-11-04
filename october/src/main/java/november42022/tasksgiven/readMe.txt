1) NullPointerException will be thrown in second line
    2) In second line, admin already references to user object. There is one object, but 2 references: user and admin
    Thus, Admin will be printed out to console
    3) removeFirst() - linked list has a field - firstNode to refer to the first node, thus no need for iteration till that node, thus 1
       removeLast() - the same as removeFirst() - thus 1
       remove(index) - 1 again - since the underlying structure is array, just basically need to call arr[index]
    4) 1) First off all, ArrayList implements List interface, but HashSet implements Set interface
       2) ArrayList as mentioned above uses array as data structure, bu HashSet uses HashMap
       3) The order of insertion is preserved in ArrayList, but not in Hashset
       4) The duplicates are allowed in ArrayList, but not in HashSet. It will not be added, basically.
    5) Solution is in "singleton" package.
    6) Solution is in "builderpattern" package.
    7) Firstly, == checks whether the variables point to the same object in memory. Just like in the 2nd question.
       If the result of user == admin is true.
       .equals method is inherited for each class from Object class, as each class under the hood extends Object class.
       The method is defined as basically just calling == for the instance on which the method invoked and the parameter type.
       So, if not overridden, the result if the same. But usually .equals is overridden to check for the fields' equality between
       the objects or just ids' equality simply.
    8) Constants are declared using final modifier. By the way, for reference types, it only implies that the variable cannot be changed
    to refer to another instance in memory. But if the object is mutable, it can be modified.
    9) Post - usually used to create a new resource, e.g. the forms usually send post requests.
       Get - to change nothing at all. Just to get an existing resource
       Put - is used to update a resource
       Delete - as the name suggests, used to delete an existing resource.
   10) I have not studied it yet, but when I have studied REST service, it was mentioned that it is one of the 2 services
   together with Rest.
   11) Thymeleaf - https://github.com/alihmzyv/taco-cloud.git
       Spring Security - https://github.com/alihmzyv/taco-cloud.git (scratched the surface actually)
       Hibernate:
       1) https://github.com/alihmzyv/hibernate-tutorial.git
       2) https://github.com/alihmzyv/jpa-in-10-steps.git
       3) https://github.com/alihmzyv/springboot-in-10-steps.git
       JUnit - https://github.com/alihmzyv/step-project-booking.git
       Jetty - https://github.com/hasanzade777/Step-Project-Tinder.git
       (it was a teamwork and from readMe, you can go to the deployed version as well)
       Java Collections - almost everywhere
       Jackson - https://github.com/alihmzyv/learning-spring.git
       Freemarker Template - https://github.com/hasanzade777/Step-Project-Tinder.git
       Apache commons (Lang) - https://github.com/hasanzade777/Step-Project-Tinder/blob/master/src/main/java/entities/User.java
   12) If I understood the question correctly, only Java Web Applications for now
   13) Primary key can consist of one or more columns that uniquely identifies each row in the table. Usually, one column whose type
   is integer exists in tables which is unique for each row or record. Thus, it has unique, not null constraints and usually
   auto-increment is used to generate new primary key for new records.
   14) Foreign key can again consist of one or more columns in a table, which references primary key column of another table, respectively
   called child and parent tables. For example, if we consider that one person can have only one address and the same vice versa.
   In person table, a column named address_id can be found which references the primary key column of address table.
   15) Joins are used to combine columns of different tables based on some common columns (based on the equality of
   values of those columns). Used for view purposes. Types: Inner, Left, Right, Full Outer (naming can change based on dbms)
* e.g. tables are created as below (id autoincrement is a convention, but for simplicity I ignored that.*
DROP TABLE IF EXISTS a;
DROP TABLE IF EXISTS b;
CREATE TABLE a (
                   id INT PRIMARY KEY,
                   common VARCHAR (100) NOT NULL
);

CREATE TABLE b (
                          id INT PRIMARY KEY,
                          common VARCHAR (100) NOT NULL
);

*values are inserted:*
INSERT INTO a (id, common)
VALUES
    (1, 'x'),
    (2, 'y'),
    (3, 'z'),
    (4, 'd');

INSERT INTO b (id, common)
VALUES
    (1, 'y'),
    (2, 'd'),
    (3, 'f'),
    (4, 'e');

*inner join joins the left table (a, in this case) with the right one based on the condition after ON. Thus, rows are created
only when the condition is satisfied*
SELECT
    a.common,
    b.common
FROM
    a
        INNER JOIN b
                   ON a.common = b.common;

*left join also does what inner join does, but also adds rows which contains the rows from a which did meet the condition*
SELECT
    a.common,
    b.common
FROM
    a
        LEFT JOIN b
                   ON a.common = b.common

*the vice versa of left join*
SELECT
    a.common,
    b.common
FROM
    a
        RIGHT JOIN b
                   ON a.common = b.common;


*this is like the sum of left and right join, it includes all the rows from 2 tables, including matches*
SELECT
    a.common,
    b.common
FROM
    a
        FULL OUTER JOIN b
                   ON a.common = b.common

     16) as the name suggests, GROUP BY groups the rows returned from SELECT and
     you can apply aggregate functions such as  SUM(), COUNT(), MIN(), MAX(), AVG() on them.
     A simple example again, e.g., person takes loans and these loans are saved in table loan:
     CREATE TABLE loan (
                   person_id INT NOT NULL,
                   amount INT NOT NULL
     )
     INSERT INTO loan(person_id, amount) VALUES (1, 100);
     INSERT INTO loan(person_id, amount) VALUES (2, 200);
     INSERT INTO loan(person_id, amount) VALUES (3, 300);
     INSERT INTO loan(person_id, amount) VALUES (1, 200);
     INSERT INTO loan(person_id, amount) VALUES (2, 500);
     Actually, would be right if loan had its primary key auto-incrementing, person_id was foreign key referencing person table primary key column,
     and there was date when the loan was taken. But for simplicity, I just ignore them.
     Suppose I want to see person_id and the total loan by him:
     SELECT person_id, SUM(amount)
     FROM loan
     GROUP BY person_id;
     17) The most differentiating point is that function is used to give some input (optional) and get a result calculated.
     On the other hand, procedure is used to perform some tasks
     17) DML and DDL - as what they stand for suggests, are for respectively, manipulating database and the data in the database.
     For example, create, alter, drop table changes the database by adding a table, adding a constraint to a table, drop a table.
     But, insert, update, delete only deals with data, have nothing to do with the structure of database.
     BOTH DML and DDL examples were written above actually. We created table, inserted data to the table.
     18) Basic difference is that delete can have conditions checking using WHERE, so you can delete the rows for which
     the condition is satisfied. But truncate is like delete without where condition (which is possible for delete and deletes all
     the rows).
     19) solution is in "solution19" package.
     20) solution is in "solution20" package.
     21) solution is in "solution21" package.