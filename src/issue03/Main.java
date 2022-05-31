package issue03;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("---------1.リスト作成とコンソールへ表示---------");

        List<String> services = List.of(
                "EC2",
                "S3",
                "RDS",
                "Route53",
                "ECS",
                "Fargate",
                "EKS",
                "ECR"
        );

        System.out.println("---------リストをそのまま出力---------");
        System.out.println(services);

        System.out.println("---------要素を一つずつ出力(ラムダ式)---------");
        services.forEach(service -> System.out.println(service));

        System.out.println("---------要素を一つずつ出力(ラムダ式*メソッド参照)---------");
        services.forEach(System.out::println);

        System.out.println("---------要素を一つずつ出力(拡張for文)---------");
        for (String service : services) {
            System.out.println(service);
        }

        System.out.println("---------2.例外処理---------");
        int index = 10;
        try {
            System.out.println(services.get(index));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("配列の範囲を超えています。");
        }

        System.out.println("---------3.stream---------");
        List<String> serviceListHasE = services.stream()
                .filter(name -> name.contains("E"))
                .toList();
        System.out.println(serviceListHasE);

        List<String> serviceListSorted = services.stream()
                .sorted()
                .toList();
        System.out.println(serviceListSorted);
    }
}
