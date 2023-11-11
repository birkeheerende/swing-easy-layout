module swing_easy_layout
{
   requires transitive java.desktop;
   
   uses java.awt.AWTError;
   uses java.awt.Component;
   uses java.awt.Container;
   uses java.awt.Dimension;
   uses java.awt.Insets;
   uses java.awt.LayoutManager;
   uses java.awt.LayoutManager2;
   uses javax.swing.JViewport;
   
   
   exports de.birkeheeren;
}