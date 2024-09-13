package com.lowLevelDesign.zeta;

/**
 * trading application
 * search
 * buy
 * sell
 * statement of account
 * LLD: CI
 * Java:
 *
 * User
 * Company
 *
 * Stock
 *    CompanyID
 *    Cost
 *
 * Transaction
 *      UserId
 *
 * SearchRequest
 *      List<Filter>
 *
 *
 * TradingApplication
 *      List<Company>
 *      Search
 *
 *
 *
 * Class Company
 * {
 * Long id;
 * Stock stock;
 * }
 *
 * Class Transaction
 * {
 *       UserId userid;
 *       Amount amount;
 *       Long companyId;
 *       Stock id;
 * }
 *
 * SearchRequest
 *      List<Filter>
 *
 *
 * TradingApplication
 *      List<Company>
 *      Search
 *
 * Class SearchRequest
 * {
 * List<Filter> filters;
 * }
 *
 * Class filter
 * {
 * 	String attributeId;
 * 	OperatorType operator;
 * 	Constraints contarint;
 * }
 *
 * Class Constraint
 * {
 *      List<Long> ids;
 *      Range range;
 * }
 *
 * Class Range
 * {
 *     Long from;
 *     Long to;
 *     Boolean fromInclusive;
 *     Boolean toInclusive;
 * }
 *
 * Enum OperatorType
 * {
 * EQUALS,
 * RANGE;
 * }
 *
 *
 * Class TradingApplication
 * {
 *          List<Company> companies;
 *
 * }
 *
 *
 * Class SearchService
 * {
 *
 * }
 *
 * #2: design parking lot
 * API
 * DB
 * 2W:10,4W:5
 * /api/v1/……
 *
 *
 * GET
 * Class ParkingLotController
 * {
 *
 * GetMapping(“/parkingLot/availableSlots/{}”)
 * Public List<ParkingLot> getAvailableParkingLots()
 * {
 *
 *        }
 * }
 *
 * ParkingLot
 *   Id int
 *   Name varchar(100)
 *   Floors
 *      -
 * Floor:
 *    Long Id;
 *    SlotID
 *    Int floorNumber;
 *    String name;
 *    Boolean hasEmptySlots;
 *
 *
 *
 *
 * Slot
 *    WheelerType type;
 *    Long slotId;
 *    Boolean isAvailable;
 *
 *
 *
 *
 *
 *
 */
public class lld {
}
