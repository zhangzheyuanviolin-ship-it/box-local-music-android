            package p000;

            import android.app.Activity;
            import android.content.Context;
            import androidx.window.extensions.WindowExtensionsProvider;
            import androidx.window.extensions.core.util.function.Consumer;
            import androidx.window.extensions.layout.WindowLayoutComponent;
            import java.lang.invoke.VarHandle;
            import java.lang.reflect.Modifier;
            
            public final class OiIiIIOOiO {
                public ClassLoader I00000oIO;
                public IOoI0IIOlolO I00000oOI;
                public OOoOIoio1i I0000Il00O;

                public static final boolean I0000O(OiIiIIOOiO oiIiIIOOiO) throws ClassNotFoundException {
/* 5 */             Class<?> clsLoadClass = oiIiIIOOiO.I00000oIO.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
                    return Modifier.isPublic(clsLoadClass.getMethod("addWindowLayoutInfoListener", Context.class, Consumer.class).getModifiers()) && Modifier.isPublic(clsLoadClass.getMethod("removeWindowLayoutInfoListener", Consumer.class).getModifiers());
                }

                public final WindowLayoutComponent I00000oIO() throws ClassNotFoundException {
                    int iI00000oIO;
/* 1 */             OOoOIoio1i oOoOIoio1i = this.I0000Il00O;
/* 3 */             oOoOIoio1i.getClass();
/* 6 */             boolean zI00000oOI = false;
                    try {
/* 11 */                oOoOIoio1i.I00000oIO.loadClass("androidx.window.extensions.WindowExtensionsProvider");
/* 18 */                OIOo1iiI oIOo1iiI = new OIOo1iiI(17);
/* 21 */                oIOo1iiI.I00iiI = oOoOIoio1i;
/* 23 */                VarHandle.storeStoreFence();
/* 32 */                if (lIo0011lo.I00000oIO("WindowExtensionsProvider#getWindowExtensions is not valid", oIOo1iiI)) {
/* 36 */                    OiIiI1ii oiIiI1ii = new OiIiI1ii(0);
/* 39 */                    oiIiI1ii.I00iiI = this;
/* 41 */                    VarHandle.storeStoreFence();
/* 50 */                    if (lIo0011lo.I00000oIO("WindowExtensions#getWindowLayoutComponent is not valid", oiIiI1ii)) {
/* 55 */                        OiIiI1ii oiIiI1ii2 = new OiIiI1ii(1);
/* 58 */                        oiIiI1ii2.I00iiI = this;
/* 60 */                        VarHandle.storeStoreFence();
/* 69 */                        if (lIo0011lo.I00000oIO("FoldingFeature class is not valid", oiIiI1ii2) && (iI00000oIO = Il1oii1olOoi.I00000oIO()) >= 1) {
/* 78 */                            if (iI00000oIO == 1) {
/* 80 */                                zI00000oOI = I0000Il00O();
                                    } else if (iI00000oIO < 5) {
/* 88 */                                zI00000oOI = I00000oOI();
                                    } else if (I00000oOI()) {
/* 102 */                               OiIiI1ii oiIiI1ii3 = new OiIiI1ii(3);
/* 105 */                               oiIiI1ii3.I00iiI = this;
/* 107 */                               VarHandle.storeStoreFence();
/* 116 */                               if (lIo0011lo.I00000oIO("DisplayFoldFeature is not valid", oiIiI1ii3)) {
/* 121 */                                   OiIiI1ii oiIiI1ii4 = new OiIiI1ii(2);
/* 124 */                                   oiIiI1ii4.I00iiI = this;
/* 126 */                                   VarHandle.storeStoreFence();
/* 135 */                                   if (lIo0011lo.I00000oIO("SupportedWindowFeatures is not valid", oiIiI1ii4)) {
/* 140 */                                       OiIiI1ii oiIiI1ii5 = new OiIiI1ii(4);
/* 143 */                                       oiIiI1ii5.I00iiI = this;
/* 145 */                                       VarHandle.storeStoreFence();
/* 154 */                                       if (lIo0011lo.I00000oIO("WindowLayoutComponent#getSupportedWindowFeatures is not valid", oiIiI1ii5)) {
/* 156 */                                           zI00000oOI = true;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } catch (ClassNotFoundException | NoClassDefFoundError unused) {
                    }
/* 158 */           if (!zI00000oOI) {
/* 157 */               return null;
                    }
                    try {
/* 164 */               return WindowExtensionsProvider.getWindowExtensions().getWindowLayoutComponent();
                    } catch (UnsupportedOperationException unused2) {
/* 157 */               return null;
                    }
                }

                public final boolean I00000oOI() {
/* 5 */             if (!I0000Il00O()) {
/* 51 */                return false;
                    }
/* 28 */            String str = "WindowLayoutComponent#addWindowLayoutInfoListener(" + Context.class.getName() + ", androidx.window.extensions.core.util.function.Consumer) is not valid";
/* 35 */            OiIiI1ii oiIiI1ii = new OiIiI1ii(6);
/* 38 */            oiIiI1ii.I00iiI = this;
/* 40 */            VarHandle.storeStoreFence();
                    return lIo0011lo.I00000oIO(str, oiIiI1ii);
                }

                public final boolean I0000Il00O() {
/* 22 */            String str = "WindowLayoutComponent#addWindowLayoutInfoListener(" + Activity.class.getName() + ", java.util.function.Consumer) is not valid";
/* 29 */            OiIiI1ii oiIiI1ii = new OiIiI1ii(5);
/* 32 */            oiIiI1ii.I00iiI = this;
/* 34 */            VarHandle.storeStoreFence();
/* 37 */            return lIo0011lo.I00000oIO(str, oiIiI1ii);
                }
            }
