package com.jwt.starter.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "request.matchers")
public class RequestMatchersProperties {
    private String[] gets;
    private String[] heads;
    private String[] posts;
    private String[] puts;
    private String[] patchs;
    private String[] deletes;
    private String[] optiones;
    private String[] traces;

    public String[] getGets() {
        return gets;
    }

    public void setGets(String[] gets) {
        this.gets = gets;
    }

    public String[] getHeads() {
        return heads;
    }

    public void setHeads(String[] heads) {
        this.heads = heads;
    }

    public String[] getPosts() {
        return posts;
    }

    public void setPosts(String[] posts) {
        this.posts = posts;
    }

    public String[] getPuts() {
        return puts;
    }

    public void setPuts(String[] puts) {
        this.puts = puts;
    }

    public String[] getPatchs() {
        return patchs;
    }

    public void setPatchs(String[] patchs) {
        this.patchs = patchs;
    }

    public String[] getDeletes() {
        return deletes;
    }

    public void setDeletes(String[] deletes) {
        this.deletes = deletes;
    }

    public String[] getOptiones() {
        return optiones;
    }

    public void setOptiones(String[] optiones) {
        this.optiones = optiones;
    }

    public String[] getTraces() {
        return traces;
    }

    public void setTraces(String[] traces) {
        this.traces = traces;
    }
}
