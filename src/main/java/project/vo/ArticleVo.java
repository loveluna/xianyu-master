package project.vo;

import project.entity.Article;

import java.util.List;
import java.util.Map;

/**
 * @author Administrator
 */
public class ArticleVo {
    private List<Article> questions;
    private List<Article> technicalSharing ;
    private List<Article> events;

    private Map<String, List<Article>> articleModule;
    private Map<String, Integer> articleModuleCount;
}
