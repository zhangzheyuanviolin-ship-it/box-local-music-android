            package p000;

            import androidx.window.sidecar.SidecarDeviceState;
            import androidx.window.sidecar.SidecarDisplayFeature;
            import androidx.window.sidecar.SidecarWindowLayoutInfo;
            import java.lang.invoke.VarHandle;
            import java.lang.reflect.InvocationTargetException;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.List;
            
            public final class Ol01ol0 {
                public static final int I00000oOI = 0;
                public OooO0Io1i I00000oIO;

                public static boolean I00000oIO(SidecarDisplayFeature sidecarDisplayFeature, SidecarDisplayFeature sidecarDisplayFeature2) {
/* 5 */             if (O0000Ioio00.I0000O(sidecarDisplayFeature, sidecarDisplayFeature2)) {
/* 7 */                 return true;
                    }
/* 9 */             if (sidecarDisplayFeature == null || sidecarDisplayFeature2 == null || sidecarDisplayFeature.getType() != sidecarDisplayFeature2.getType()) {
/* 25 */                return false;
                    }
/* 35 */            return O0000Ioio00.I0000O(sidecarDisplayFeature.getRect(), sidecarDisplayFeature2.getRect());
                }

                public static boolean I00000oOI(List list, List list2) {
/* 1 */             if (list == list2) {
/* 48 */                return true;
                    }
/* 13 */            if (list.size() == list2.size()) {
/* 19 */                int size = list.size();
/* 24 */                for (int i = 0; i < size; i++) {
/* 42 */                    if (I00000oIO((SidecarDisplayFeature) list.get(i), (SidecarDisplayFeature) list2.get(i))) {
                            }
                        }
/* 48 */                return true;
                    }
/* 12 */            return false;
                }

                public static final boolean I0000oI00(SidecarDisplayFeature sidecarDisplayFeature) {
                    return sidecarDisplayFeature.getType() == 1 || sidecarDisplayFeature.getType() == 2;
                }

                public static final boolean I0001Ioi1lo(SidecarDisplayFeature sidecarDisplayFeature) {
                    return (sidecarDisplayFeature.getRect().width() == 0 && sidecarDisplayFeature.getRect().height() == 0) ? false : true;
                }

                public static final boolean I000II(SidecarDisplayFeature sidecarDisplayFeature) {
                    return sidecarDisplayFeature.getType() != 1 || sidecarDisplayFeature.getRect().width() == 0 || sidecarDisplayFeature.getRect().height() == 0;
                }

                public static final boolean I000O01llI0(SidecarDisplayFeature sidecarDisplayFeature) {
                    return sidecarDisplayFeature.getRect().left == 0 || sidecarDisplayFeature.getRect().top == 0;
                }

                public final i00lliOilOo I0000Il00O(SidecarWindowLayoutInfo sidecarWindowLayoutInfo, SidecarDeviceState sidecarDeviceState) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
/* 1 */             if (sidecarWindowLayoutInfo == null) {
/* 7 */                 return new i00lliOilOo(Il01100l.I00iOIl);
                    }
/* 13 */            SidecarDeviceState sidecarDeviceState2 = new SidecarDeviceState();
/* 16 */            int iI00000oIO = Ol01o1oOI.I00000oIO(sidecarDeviceState);
/* 20 */            if (iI00000oIO < 0 || iI00000oIO > 4) {
/* 25 */                iI00000oIO = 0;
                    }
/* 26 */            Ol01o1oOI.I0000Il00O(sidecarDeviceState2, iI00000oIO);
/* 39 */            return new i00lliOilOo(I0000O(Ol01o1oOI.I00000oOI(sidecarWindowLayoutInfo), sidecarDeviceState2));
                }

                public final ArrayList I0000O(List list, SidecarDeviceState sidecarDeviceState) throws I1o1lOlooI1 {
/* 5 */             ArrayList arrayList = new ArrayList();
/* 8 */             Iterator it = list.iterator();
/* 16 */            while (it.hasNext()) {
/* 24 */                Io1IIIi01 io1IIIi01I000OOo1O = I000OOo1O((SidecarDisplayFeature) it.next(), sidecarDeviceState);
/* 28 */                if (io1IIIi01I000OOo1O != null) {
/* 30 */                    arrayList.add(io1IIIi01I000OOo1O);
                        }
                    }
/* 37 */            return arrayList;
                }

                /* JADX WARN: Code restructure failed: missing block: B:31:0x0088, code lost:
                
                    if (r7 == 4) goto L36;
                 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Io1IIIi01 I000OOo1O(SidecarDisplayFeature sidecarDisplayFeature, SidecarDeviceState sidecarDeviceState) throws I1o1lOlooI1 {
                    Object obj;
                    I0OooiI1I i0OooiI1I;
/* 1 */             IIlIi0lIii iIlIi0lIii = IIlIi0lIii.I00ilO0;
/* 3 */             OooO0Io1i oooO0Io1i = this.I00000oIO;
/* 5 */             i1O10l1io1iO i1o10l1io1io = i1O10l1io1iO.I00iiO;
/* 10 */            IlII00i10OII ilII00i10OII = new IlII00i10OII(1);
/* 13 */            ilII00i10OII.I00000oOI = sidecarDisplayFeature;
/* 15 */            ilII00i10OII.I0000Il00O = oooO0Io1i;
/* 17 */            ilII00i10OII.I0000O = i1o10l1io1io;
/* 19 */            VarHandle.storeStoreFence();
/* 62 */            IlII00i10OII ilII00i10OIII00000oIO = ilII00i10OII.I00000oIO("Type must be either TYPE_FOLD or TYPE_HINGE", new Ol01O0o()).I00000oIO("Feature bounds must not be 0", new Ol01iOl0ol00()).I00000oIO("TYPE_FOLD must have 0 area", new Ol01iOoOII1l()).I00000oIO("Feature be pinned to either left or top", new Ol01lii01Oo());
                    switch (ilII00i10OIII00000oIO.I00000oIO) {
                        case 0:
/* 78 */                    int iOrdinal = ilII00i10OIII00000oIO.I0000Il00O.ordinal();
/* 82 */                    if (iOrdinal == 0) {
/* 162 */                       throw ((I1o1lOlooI1) ilII00i10OIII00000oIO.I0000O);
                            }
/* 84 */                    if (iOrdinal == 1) {
/* 95 */                        ilII00i10OIII00000oIO.I00000oOI.toString();
                            } else if (iOrdinal != 2) {
/* 89 */                        I000II.I00000oIO();
                            }
/* 98 */                    obj = null;
                            break;
                        default:
/* 73 */                    obj = ilII00i10OIII00000oIO.I00000oOI;
                            break;
                    }
/* 99 */            SidecarDisplayFeature sidecarDisplayFeature2 = (SidecarDisplayFeature) obj;
/* 101 */           if (sidecarDisplayFeature2 != null) {
/* 104 */               int type = sidecarDisplayFeature2.getType();
/* 108 */               if (type == 1) {
/* 116 */                   i0OooiI1I = I0OooiI1I.I00ilO0;
                        } else if (type == 2) {
/* 113 */                   i0OooiI1I = I0OooiI1I.I00io1l;
                        }
/* 118 */               int iI00000oIO = Ol01o1oOI.I00000oIO(sidecarDeviceState);
/* 123 */               if (iI00000oIO < 0 || iI00000oIO > 4) {
/* 127 */                   iI00000oIO = 0;
                        }
/* 128 */               if (iI00000oIO != 0 && iI00000oIO != 1) {
/* 132 */                   if (iI00000oIO == 2) {
/* 140 */                       iIlIi0lIii = IIlIi0lIii.I00io1l;
                            } else if (iI00000oIO != 3) {
                            }
/* 153 */                   return new Io1IIIi01(new II1i0o0(sidecarDisplayFeature.getRect()), i0OooiI1I, iIlIi0lIii);
                        }
                    }
/* 69 */            return null;
                }
            }
