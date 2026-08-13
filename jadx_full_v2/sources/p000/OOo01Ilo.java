            package p000;

            import android.os.Bundle;
            import android.view.View;
            import java.lang.reflect.Constructor;
            import java.util.ArrayList;
            import java.util.HashMap;
            import java.util.Iterator;
            import java.util.LinkedHashMap;
            
            public final class OOo01Ilo implements O0oiIoI0 {
                public final int I00iOIl;
                public Object I00iiI;

                public OOo01Ilo(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final void I000II(O0oiOi o0oiOi, O0oOOiI0 o0oOOiI0) throws NoSuchMethodException, SecurityException {
                    View view;
                    switch (this.I00iOIl) {
                        case 0:
/* 110 */                   OiIoOoIi01 oiIoOoIi01 = (OiIoOoIi01) this.I00iiI;
/* 114 */                   if (o0oOOiI0 != O0oOOiI0.ON_CREATE) {
/* 339 */                       I000II.I000O01llI0("Next event must be ON_CREATE");
/* 342 */                       return;
                            }
/* 120 */                   o0oiOi.I000iOII().I00ooIo0(this);
/* 129 */                   Bundle bundleI00IO1oi11O = oiIoOoIi01.I000O01llI0().I00IO1oi11O("androidx.savedstate.Restarter");
/* 133 */                   if (bundleI00IO1oi11O == null) {
/* 342 */                       return;
                            }
/* 139 */                   ArrayList<String> stringArrayList = bundleI00IO1oi11O.getStringArrayList("classes_to_restore");
/* 143 */                   if (stringArrayList == null) {
/* 333 */                       I000II.I001IO000("SavedState with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
/* 342 */                       return;
                            }
/* 153 */                   for (String str : stringArrayList) {
                                try {
/* 175 */                           Class<? extends U> clsAsSubclass = Class.forName(str, false, OOo01Ilo.class.getClassLoader()).asSubclass(OiIoOI.class);
                                    try {
/* 179 */                               Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(null);
/* 184 */                               declaredConstructor.setAccessible(true);
                                        try {
/* 195 */                                   if (!(oiIoOoIi01 instanceof Oool1Ii0I)) {
/* 277 */                                       IoOOl0iOl1io.I001lIiIIo1O("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner. Received owner: ", oiIoOoIi01);
/* 342 */                                       return;
                                            }
/* 200 */                                   Oool0l1iOIOl oool0l1iOIOlI000II = ((Oool1Ii0I) oiIoOoIi01).I000II();
/* 204 */                                   I1I0i0Ilo1Oi i1I0i0Ilo1OiI000O01llI0 = oiIoOoIi01.I000O01llI0();
/* 208 */                                   LinkedHashMap linkedHashMap = oool0l1iOIOlI000II.I00000oIO;
/* 210 */                                   LinkedHashMap linkedHashMap2 = oool0l1iOIOlI000II.I00000oIO;
/* 222 */                                   Iterator it = IOOi0Ool1i.I00iio(linkedHashMap.keySet()).iterator();
/* 230 */                                   while (it.hasNext()) {
/* 240 */                                       OooioIIoi0O oooioIIoi0O = (OooioIIoi0O) linkedHashMap2.get(it.next());
/* 242 */                                       if (oooioIIoi0O != null) {
/* 249 */                                           l10IIo0ooIO.I00000oIO(oooioIIoi0O, i1I0i0Ilo1OiI000O01llI0, oiIoOoIi01.I000iOII());
                                                }
                                            }
/* 269 */                                   if (!IOOi0Ool1i.I00iio(linkedHashMap2.keySet()).isEmpty()) {
/* 271 */                                       i1I0i0Ilo1OiI000O01llI0.I00Ol10();
                                            }
                                        } catch (Exception e) {
/* 288 */                                   OIiilo1Ool0o.I000iOII(IIl001iO0Io.I000o00OoI0I("Failed to instantiate ", str), e);
/* 342 */                                   return;
                                        }
                                    } catch (NoSuchMethodException e2) {
/* 319 */                               throw new IllegalStateException("Class " + clsAsSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
                                    }
                                } catch (ClassNotFoundException e3) {
/* 327 */                           OIiilo1Ool0o.I000iOII(IlIi0I0.I000lI("Class ", str, " wasn't found"), e3);
/* 342 */                           return;
                                }
                            }
/* 342 */                   return;
                        case 1:
/* 73 */                    Ill0oOi0 ill0oOi0 = (Ill0oOi0) this.I00iiI;
/* 77 */                    if (ill0oOi0.I00ilI0I1 == null) {
/* 83 */                        IOiO100Oil iOiO100Oil = (IOiO100Oil) ill0oOi0.getLastNonConfigurationInstance();
/* 85 */                        if (iOiO100Oil != null) {
/* 89 */                            ill0oOi0.I00ilI0I1 = iOiO100Oil.I00000oIO;
                                }
/* 93 */                        if (ill0oOi0.I00ilI0I1 == null) {
/* 100 */                           ill0oOi0.I00ilI0I1 = new Oool0l1iOIOl();
                                }
                            }
/* 104 */                   ill0oOi0.I00iOIl.I00ooIo0(this);
/* 107 */                   return;
                        case 2:
/* 51 */                    new HashMap();
/* 56 */                    IlooiIIiI[] ilooiIIiIArr = (IlooiIIiI[]) this.I00iiI;
/* 59 */                    if (ilooiIIiIArr.length > 0) {
/* 68 */                        IlooiIIiI ilooiIIiI = ilooiIIiIArr[0];
/* 70 */                        throw null;
                            }
/* 62 */                    if (ilooiIIiIArr.length <= 0) {
/* 64 */                        return;
                            }
/* 65 */                    IlooiIIiI ilooiIIiI2 = ilooiIIiIArr[0];
/* 67 */                    throw null;
                        case 3:
/* 35 */                    if (o0oOOiI0 != O0oOOiI0.ON_STOP || (view = ((Ill0l1) this.I00iiI).I0100i) == null) {
/* 48 */                        return;
                            }
/* 45 */                    view.cancelPendingInputEvents();
/* 48 */                    return;
                        default:
/* 10 */                    if (o0oOOiI0 != O0oOOiI0.ON_CREATE) {
/* 29 */                        IoOOl0iOl1io.I001lIiIIo1O("Next event must be ON_CREATE, it was ", o0oOOiI0);
/* 32 */                        return;
                            } else {
/* 16 */                        o0oiOi.I000iOII().I00ooIo0(this);
/* 23 */                        ((OiIoIll1i0ii) this.I00iiI).I00000oOI();
/* 32 */                        return;
                            }
                    }
                }
            }
