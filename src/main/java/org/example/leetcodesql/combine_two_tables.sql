/*
LeetCode 75. Combine Two Tables

Given two tables:
- Person(personId, lastName, firstName)
- Address(addressId, personId, city, state)

Write a solution to report first name, last name, city, and state of each person in the Person table.
If the address of a personId is not present in the Address table, report null instead.

Return the result table in any order.

Example result:
+-----------+----------+----------+-------+
| firstName | lastName | city     | state |
+-----------+----------+----------+-------+
| Allen     | Wang     | NULL     | NULL  |
| Bob       | Alice    | New York | NY    |
+-----------+----------+----------+-------+
*/

SELECT
    p.firstName,
    p.lastName,
    a.city,
    a.state
FROM
    Person p
LEFT JOIN
    Address a
ON
    p.personId = a.personId;