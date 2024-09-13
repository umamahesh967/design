package SystemDesign.basicConcepts;

/**
 * Generally databases builds a clustered index on the table primary key by default.
 * We don't need to explicitly create index on primary key in table.
 *
 * Databases generally return the results in primary key sorting order.
 * But it is generally recommended to include order_by in query if you want results in sorted order for sure.
 * Above sorting is only applicable to MYSQL not sure about other databases.
 *
 * SQL does not support above sorting of tables based on
 *
 * https://stackoverflow.com/questions/1110339/primary-key-sorting#:~:text=In%20SQL%20Server%3A%20no%2C%20by,(physical)%20sorting%20per%20se.
 *
 * https://www.youtube.com/watch?v=aZjYr87r1b8
 *
 * ******Very good video*****
 * https://www.youtube.com/watch?v=NGslt99VOCw
 * 
 * https://www.youtube.com/watch?v=KcApkM5WYGw
 * https://www.youtube.com/watch?v=YUtUNlLNB5c
 * https://www.youtube.com/watch?v=BwUvgG29fPc
 * https://www.youtube.com/watch?v=V-ayKf1CWQE
 *
 * https://www.guru99.com/clustered-vs-non-clustered-index.html#:~:text=A%20clustered%20index%20defines%20the,based%20on%20that%20specific%20column.
 *
 * Very Good PDF explains very well about primary index and secondary index and Btree index.
 * https://www.inf.unibz.it/~artale/DB2/handout2.pdf
 *
 * https://stackoverflow.com/questions/4694574/database-indexes-and-their-big-o-notation#:~:text=Querying%20on%20a%20primary%20key,time%20(full%20table%20scan).
 * https://stackoverflow.com/questions/1110339/primary-key-sorting#:~:text=In%20SQL%20Server%3A%20no%2C%20by,(physical)%20sorting%20per%20se.
 *
 * btree(Balanced Index)
 * https://www.geeksforgeeks.org/difference-between-b-tree-and-b-tree/
 */
public class Indexes {
}
