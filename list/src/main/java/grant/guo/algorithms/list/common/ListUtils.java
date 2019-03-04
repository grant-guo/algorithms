package grant.guo.algorithms.list.common;

public class ListUtils {

    public static LinkedElement generateList() {
        LinkedElement list = new LinkedElement(
                0,
                new LinkedElement(
                        1,
                        new LinkedElement(
                                2,
                                new LinkedElement(
                                        3,
                                        new LinkedElement(
                                                4,
                                                new LinkedElement(
                                                        5,
                                                        new LinkedElement(
                                                                6,
                                                                new LinkedElement(
                                                                        7,
                                                                        new LinkedElement(
                                                                                8,
                                                                                new LinkedElement(
                                                                                        9, null
                                                                                )
                                                                        )
                                                                )
                                                        )
                                                )
                                        )
                                )
                        )
                )
        );
        return list;
    }

    public static LinkedElement generateSortedListWithDuplicates() {
        LinkedElement list = new LinkedElement(
                0,
                new LinkedElement(
                        1,
                        new LinkedElement(
                                2,
                                new LinkedElement(
                                        2,
                                        new LinkedElement(
                                                2,
                                                new LinkedElement(
                                                        5,
                                                        new LinkedElement(
                                                                6,
                                                                new LinkedElement(
                                                                        7,
                                                                        new LinkedElement(
                                                                                7,
                                                                                new LinkedElement(
                                                                                        9, null
                                                                                )
                                                                        )
                                                                )
                                                        )
                                                )
                                        )
                                )
                        )
                )
        );
        return list;
    }

    public static LinkedElement generatePalindromicListOddNumber() {
        LinkedElement list = new LinkedElement(
                0,
                new LinkedElement(
                        1,
                        new LinkedElement(
                                2,
                                new LinkedElement(
                                        3,
                                        new LinkedElement(
                                                2,
                                                new LinkedElement(
                                                        1,
                                                        new LinkedElement(
                                                                0,
                                                                null
                                                        )
                                                )
                                        )
                                )
                        )
                )
        );
        return list;
    }

    public static LinkedElement generatePalindromicListEvenNumber() {
        LinkedElement list = new LinkedElement(
                0,
                new LinkedElement(
                        1,
                        new LinkedElement(
                                2,
                                new LinkedElement(
                                        2,
                                        new LinkedElement(
                                                1,
                                                new LinkedElement(
                                                        0,
                                                        null
                                                )
                                        )
                                )
                        )
                )
        );
        return list;
    }



}
