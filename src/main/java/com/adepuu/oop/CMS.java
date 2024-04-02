package com.adepuu.oop;

// Interface for CMS plugins
interface Plugin {
    void initialize(); // Initialize the plugin
    void execute();    // Execute the plugin's functionality
}

// Concrete implementation of a CMS plugin for handling authentication
class AuthenticationPlugin implements Plugin {
    @Override
    public void initialize() {
        System.out.println("Initializing Authentication Plugin...");
    }

    @Override
    public void execute() {
        System.out.println("Executing Authentication Plugin...");
        // Logic for authentication
    }
}

// Concrete implementation of a CMS plugin for handling user notifications
class NotificationPlugin implements Plugin {
    @Override
    public void initialize() {
        System.out.println("Initializing Notification Plugin...");
    }

    @Override
    public void execute() {
        System.out.println("Executing Notification Plugin...");
        // Logic for sending notifications
    }
}

// CMS class that utilizes plugins
class ContentManagementSystem {
    private Plugin[] plugins;

    public ContentManagementSystem(Plugin... plugins) {
        this.plugins = plugins;
    }

    public void initializePlugins() {
        for (Plugin plugin : plugins) {
            plugin.initialize();
        }
    }

    public void executePlugins() {
        for (Plugin plugin : plugins) {
            plugin.execute();
        }
    }
}

public class CMS {
    public static void main(String[] args) {
        // Initialize CMS with plugins
        Plugin authenticationPlugin = new AuthenticationPlugin();
        Plugin notificationPlugin = new NotificationPlugin();

        ContentManagementSystem cms = new ContentManagementSystem(authenticationPlugin, notificationPlugin);

        // Initialize and execute plugins
        cms.initializePlugins();
        cms.executePlugins();
    }
}