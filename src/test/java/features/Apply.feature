Feature: RoofStack Job Apply Feature

  @Test1
  Scenario: Search RoofStack on Google and Apply For a Job
    Given Go to Google home page
    When Search for "Roof Stack Yazılım" on Google
    When Click "https://roofstacks.com" on Google
    When Navigate to "Career" on navbar
    When Select "Product" positions on Career Page
    When Select "Lead Product Tester" position on Career Page
    When Click Send CV Make an Application button
    When Fill email address with "test@automation.com"
    When Select file for upload CV on Career Page
    When Click upload button on Career Page
    Then Check CV has been sent successfully