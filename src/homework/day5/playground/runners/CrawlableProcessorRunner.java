package homework.day5.playground.runners;

import homework.day5.playground.essence.creatures.*;
import homework.day5.playground.processors.CrawlableProcessor;

public class CrawlableProcessorRunner {

    public static void main(String[] args) {

        CrawlableProcessor crawlableProcessor = new CrawlableProcessor();

        Crawlable crawlableCrocodile = new Crocodile(1723, "Neel Crawlable");
        Crawlable crawlableBeetle = new Beetle(43, "Christmas Crawlable");
        Vertebrata vertebrataCrocodile = new Crocodile(1723, "Neel Vertebrata");
        Insect insectBeetle = new Beetle(43, "Christmas Insect");
        Crocodile aCrocodile = new Crocodile(1723, "Neel Crocodile");
        Beetle aBeetle = new Beetle(43, "Christmas Beetle");
        Crawlable anonymousCrawlable = new Crawlable() {
            String name = "Anonymous";

            @Override
            public String getName() {
                return name;
            }

            @Override
            public String getSound() {
                return "";
            }

            @Override
            public void crawl(String direction, int distance) {
                System.out.printf("I am %s, my name is %s and I am crawling to %s for %d units%n",
                        this.getClass().getSimpleName(), name, direction, distance);
            }
        };

        crawlableProcessor.runCrawlable(crawlableBeetle, "никуда");
        crawlableProcessor.runCrawlable(crawlableCrocodile, "налево");
        crawlableProcessor.runCrawlable(anonymousCrawlable, "назад", 37);
        crawlableProcessor.runCrawlable(new Crawlable() {
            @Override
            public String getName() {
                return "anon";
            }

            @Override
            public String getSound() {
                return "";
            }
        }, "вниз", 37);
    }
}
