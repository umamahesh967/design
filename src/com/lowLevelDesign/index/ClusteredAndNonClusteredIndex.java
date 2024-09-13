package com.lowLevelDesign.index;

/**
 * @ClusteredIndex
 * A clustered index determines the physical order of data in a table. For this reason a table can
 *  have only one clustered index.
 *
 * Primary key constraint creates clustered indexes on the table.
 *
 * Since the original table will be sorted based on the clustered index i.e Primary Key, so after every insert/update
 *  original table rows will be sorted on primary key.
 *
 *  You can see in the pictures even though we have inserted data in non sorted manner, when we
 *      get all records from table we get data in sorted manner.
 *
 *   A clustered index can contain single column or multiple columns(Composite Clustered Index).
 *
 *   You can see images for clustered index with multiple columns.
 *
 * If you don't have clustered index on the table, then when we retrieve, data will not be in any specific way.
 *
 *
 *
 * @NonClusteredIndex
 *  For Non Clustered index a separate table is created. This index table will have pointers
 *      to the storage locations of the data/original table.
 *
 *
 *
 *
 * https://www.youtube.com/watch?v=NGslt99VOCw&list=RDCMUCCTVrRB5KpIiK6V2GGVsR1Q&start_radio=1
 *
 * https://www.geeksforgeeks.org/difference-between-clustered-and-non-clustered-index/
 */
public class ClusteredAndNonClusteredIndex
{

}
