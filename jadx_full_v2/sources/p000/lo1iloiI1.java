            package p000;

            import android.app.Application;
            import android.graphics.SurfaceTexture;
            import android.hardware.camera2.params.OutputConfiguration;
            import android.media.MediaCodec;
            import android.media.MediaRecorder;
            import android.os.Build;
            import android.util.Log;
            import android.util.Size;
            import android.view.Surface;
            import android.view.SurfaceHolder;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import com.google.mlkit.vision.pose.PoseLandmark;
            import java.lang.invoke.VarHandle;
            import java.lang.ref.ReferenceQueue;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.HashMap;
            import java.util.HashSet;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Set;
            import java.util.concurrent.Executor;
            
/* 109 */   public final class lo1iloiI1 implements IOiOiIIiii1, II1Oo1IiO, IOllol1io, Ii0OIl1OO, i11lIilOO0II, i1ol10I, ilo1O0Ii, iliIOlooOio, iiIi1oo0Io, OOooilOIIl0I {
                public static lo1iloiI1 I00iiI;
                public static final lo1iloiI1 I00iiO = new lo1iloiI1(1);
                public static final IIIioo I00iio = new IIIioo(null);
                public static final lo1iloiI1 I00ilI0I1 = new lo1iloiI1(2);
                public static final lo1iloiI1 I00ilO0 = new lo1iloiI1(3);
                public static final lo1iloiI1 I00io1l = new lo1iloiI1(4);
                public static final lo1iloiI1 I00ioIO = new lo1iloiI1(5);
                public static final lo1iloiI1 I00l0I0l0lO1 = new lo1iloiI1(6);
                public static final lo1iloiI1 I00l0OO0IO = new lo1iloiI1(7);
                public static final lo1iloiI1 I00li1OI = new lo1iloiI1(21);
                public static final lo1iloiI1 I00ll1 = new lo1iloiI1(22);
                public static final lo1iloiI1 I00lli11 = new lo1iloiI1(24);
                public static final lo1iloiI1 I00lll10 = new lo1iloiI1(25);
                public static final lo1iloiI1 I00o0iI0io1 = new lo1iloiI1(26);
                public final int I00iOIl;

                public lo1iloiI1(int i) {
/* 1 */             this.I00iOIl = i;
                }

                public static I0oiIOi00lo1 I00000oIO(Surface surface, Integer num, l1I0oI l1i0oi, OIlIOlIi oIlIOlIi, OIlII1I1 oIlII1I1, OIlIOo oIlIOo, List list, Size size, boolean z, int i, String str, int i2) {
                    OutputConfiguration outputConfiguration;
                    OutputConfiguration outputConfigurationI000II;
                    Class cls;
/* 1 */             l1I0oI l1i0oi2 = l1I0oI.I00ilO0;
/* 6 */             if ((i2 & 2) != 0) {
/* 8 */                 num = null;
                    }
/* 11 */            if ((i2 & 4) != 0) {
/* 13 */                l1i0oi = l1i0oi2;
                    }
/* 16 */            if ((i2 & Barcode.FORMAT_UPC_A) != 0) {
/* 18 */                z = false;
                    }
/* 22 */            if ((i2 & Barcode.FORMAT_UPC_E) != 0) {
/* 24 */                i = -1;
                    }
/* 29 */            if (l1i0oi != l1I0oI.I00l0I0l0lO1 || Build.VERSION.SDK_INT < 35) {
/* 59 */                if (l1i0oi != l1i0oi2) {
/* 61 */                    if (size == null) {
/* 125 */                       I000II.I001IO000("Size must defined when creating a deferred OutputConfiguration.");
/* 5 */                         return null;
                            }
/* 65 */                    if (l1i0oi == l1I0oI.I00ioIO) {
/* 114 */                       cls = SurfaceTexture.class;
                            } else if (l1i0oi == l1I0oI.I00io1l) {
/* 111 */                       cls = SurfaceHolder.class;
                            } else if (l1i0oi != l1I0oI.I00l0OO0IO) {
/* 77 */                        if (l1i0oi != l1I0oI.I00li1OI) {
/* 94 */                            IoOOl0iOl1io.I000OOo1O("Unsupported OutputType: ", l1i0oi);
/* 5 */                             return null;
                                }
/* 81 */                        if (Build.VERSION.SDK_INT < 35) {
/* 88 */                            I000II.I001IO000("OutputType.MEDIA_RECORDER requires API 35 or higher.");
/* 5 */                             return null;
                                }
/* 83 */                        cls = MediaRecorder.class;
                            } else {
/* 100 */                       if (Build.VERSION.SDK_INT < 35) {
/* 107 */                           I000II.I001IO000("OutputType.MEDIA_CODEC requires API 35 or higher.");
/* 5 */                             return null;
                                }
/* 102 */                       cls = MediaCodec.class;
                            }
/* 118 */                   outputConfiguration = new OutputConfiguration(size, cls);
                        } else {
/* 129 */                   if (surface == null) {
/* 239 */                       I000II.I001IO000("non-null surface!");
/* 5 */                         return null;
                            }
                            try {
/* 143 */                       outputConfiguration = i != -1 ? new OutputConfiguration(i, surface) : new OutputConfiguration(surface);
                            } catch (Throwable th) {
/* 233 */                       Log.w("CXCP", "Failed to create an OutputConfiguration for " + surface + '!', th);
/* 5 */                         return null;
                            }
                        }
/* 121 */               outputConfigurationI000II = outputConfiguration;
                    } else {
/* 38 */                if (num == null) {
/* 55 */                    I000II.I001IO000("Required value was null.");
/* 5 */                     return null;
                        }
/* 40 */                if (size == null) {
/* 51 */                    I000II.I001IO000("Required value was null.");
/* 5 */                     return null;
                        }
/* 46 */                outputConfigurationI000II = I11OiIiiO.I000II(num.intValue(), size);
                    }
/* 147 */           if (z) {
/* 149 */               outputConfigurationI000II.enableSurfaceSharing();
                    }
/* 152 */           if (str != null) {
/* 154 */               outputConfigurationI000II.setPhysicalCameraId(str);
                    }
/* 157 */           if (oIlIOlIi != null) {
/* 161 */               outputConfigurationI000II.setMirrorMode(oIlIOlIi.I00000oIO);
                    }
/* 164 */           if (oIlII1I1 != null) {
/* 168 */               outputConfigurationI000II.setDynamicRangeProfile(oIlII1I1.I00000oIO);
                    }
/* 171 */           if (oIlIOo != null) {
/* 175 */               outputConfigurationI000II.setStreamUseCase(oIlIOo.I00000oIO);
                    }
/* 185 */           if (!list.isEmpty()) {
/* 187 */               Iterator it = list.iterator();
/* 195 */               if (it.hasNext()) {
/* 202 */                   throw IIlIOloOOO.I000lI(it);
                        }
                    }
/* 205 */           outputConfigurationI000II.getMaxSharedSurfaceCount();
/* 208 */           return new I0oiIOi00lo1(outputConfigurationI000II);
                }

                public static IiIiOIi0 I0000O(Ooioo0o1l0 ooioo0o1l0, boolean z) {
                    boolean zI0000oI00;
/* 3 */             if (ooioo0o1l0 instanceof IiIiOIi0) {
/* 5 */                 return (IiIiOIi0) ooioo0o1l0;
                    }
/* 8 */             ooioo0o1l0.I00iOIl();
/* 23 */            if ((ooioo0o1l0.I00iOIl().I00100o1O0lo() instanceof OoOOiO) || (ooioo0o1l0 instanceof OIIOlOIoOO)) {
/* 35 */                IOIiO1lIl0l iOIiO1lIl0lI00100o1O0lo = ooioo0o1l0.I00iOIl().I00100o1O0lo();
/* 46 */                OoOOiOollo ooOOiOollo = iOIiO1lIl0lI00100o1O0lo instanceof OoOOiOollo ? (OoOOiOollo) iOIiO1lIl0lI00100o1O0lo : null;
/* 47 */                zI0000oI00 = true;
/* 48 */                if (ooOOiOollo == null || ooOOiOollo.I00ll1) {
/* 90 */                    zI0000oI00 = (z && (ooioo0o1l0.I00iOIl().I00100o1O0lo() instanceof OoOOiO)) ? OoOilo0Oliii.I0000oI00(ooioo0o1l0) : true ^ iOI0i11I0.I00000oIO(o0llIi.I00io1l.I001lIiIIo1O(), ilOiIOII1.I00000oIO(ooioo0o1l0), OoOIOIOI1Io.I00000oOI);
                        }
                    } else {
/* 29 */                zI0000oI00 = false;
                    }
/* 91 */            if (!zI0000oI00) {
/* 22 */                return null;
                    }
/* 95 */            if (ooioo0o1l0 instanceof IlOIOIi00io) {
/* 98 */                IlOIOIi00io ilOIOIi00io = (IlOIOIi00io) ooioo0o1l0;
/* 112 */               O0000Ioio00.I0000O(ilOIOIi00io.I00iiI.I00iOIl(), ilOIOIi00io.I00iiO.I00iOIl());
                    }
/* 125 */           return new IiIiOIi0(ilOiIOII1.I00000oIO(ooioo0o1l0).I00li1OI(false), z);
                }

                public static synchronized void I000II() {
/* 6 */             if (I00iiI == null) {
/* 14 */                I00iiI = new lo1iloiI1(0);
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:25:0x004c  */
                /* JADX WARN: Removed duplicated region for block: B:37:0x0086  */
                /* JADX WARN: Removed duplicated region for block: B:56:0x00d0  */
                /* JADX WARN: Type inference failed for: r4v0 */
                /* JADX WARN: Type inference failed for: r4v1, types: [boolean, int] */
                /* JADX WARN: Type inference failed for: r4v9 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public I00IOO I00000oOI(Ol0O0iI0l0O ol0O0iI0l0O, I01i01OoI i01i01OoI, int i, OoOIOl ooOIOl, boolean z, boolean z2) {
                    OI000ilOol oI000ilOolI000OiO;
                    Boolean bool;
                    OoOIOoO1I ooOIOoO1II00iOIl;
                    Boolean bool2;
                    O1I1OO o1i1oo;
/* 7 */             OoOIOl ooOIOl2 = OoOIOl.I00iiO;
/* 9 */             ?? r4 = 0;
/* 15 */            Object[] objArr = ooOIOl != ooOIOl2;
/* 23 */            Object[] objArr2 = (z2 && z) ? false : true;
/* 24 */            Object obj = null;
/* 25 */            if (objArr != true && ol0O0iI0l0O.I00OIl().isEmpty()) {
/* 39 */                return new I00IOO(null, 1, false);
                    }
/* 47 */            IOIiO1lIl0l iOIiO1lIl0lI00100o1O0lo = ol0O0iI0l0O.I00iOIl().I00100o1O0lo();
/* 51 */            if (iOIiO1lIl0lI00100o1O0lo == null) {
/* 55 */                return new I00IOO(null, 1, false);
                    }
/* 67 */            O00olOO0 o00olOO0 = (O00olOO0) i01i01OoI.invoke(Integer.valueOf(i));
/* 69 */            I11Io0oil0i0 i11Io0oil0i0 = OoOO00ol0.I00000oIO;
/* 71 */            if (ooOIOl == ooOIOl2 || !(iOIiO1lIl0lI00100o1O0lo instanceof OI000ilOol)) {
/* 77 */                oI000ilOolI000OiO = null;
                    } else if (o00olOO0.I00000oOI == OI0io10lI.I00iOIl && ooOIOl == OoOIOl.I00iOIl) {
/* 92 */                OI000ilOol oI000ilOol = (OI000ilOol) iOIiO1lIl0lI00100o1O0lo;
/* 94 */                String str = O00oO0liO11.I00000oIO;
/* 96 */                Ill0OI0lo ill0OI0loI0001Ioi1lo = IiOiIO0i1Oil.I0001Ioi1lo(oI000ilOol);
/* 100 */               HashMap map = O00oO0liO11.I000OiO;
/* 106 */               if (map.containsKey(ill0OI0loI0001Ioi1lo)) {
/* 116 */                   Ill0IO ill0IO = (Ill0IO) map.get(IiOiIO0i1Oil.I0001Ioi1lo(oI000ilOol));
/* 118 */                   if (ill0IO == null) {
/* 131 */                       OoOil11Ol1o.I000OOo1O(oI000ilOol, "Given class ", " is not a mutable collection");
/* 24 */                        return null;
                            }
/* 124 */                   oI000ilOolI000OiO = IiOiOOIo.I0000oI00(oI000ilOol).I000OiO(ill0IO);
                        }
                    } else if (o00olOO0.I00000oOI == OI0io10lI.I00iiI && ooOIOl == OoOIOl.I00iiI) {
/* 145 */               OI000ilOol oI000ilOol2 = (OI000ilOol) iOIiO1lIl0lI00100o1O0lo;
/* 147 */               String str2 = O00oO0liO11.I00000oIO;
/* 159 */               if (O00oO0liO11.I000iOII.containsKey(IiOiIO0i1Oil.I0001Ioi1lo(oI000ilOol2))) {
/* 161 */                   Ill0OI0lo ill0OI0loI0001Ioi1lo2 = IiOiIO0i1Oil.I0001Ioi1lo(oI000ilOol2);
/* 165 */                   String str3 = O00oO0liO11.I00000oIO;
/* 167 */                   Ill0IO ill0IOI000OOo1O = O00oO0liO11.I000OOo1O(ill0OI0loI0001Ioi1lo2);
/* 171 */                   if (ill0IOI000OOo1O == null) {
/* 184 */                       OoOil11Ol1o.I000OOo1O(oI000ilOol2, "Given class ", " is not a read-only collection");
/* 24 */                        return null;
                            }
/* 177 */                   oI000ilOolI000OiO = IiOiOOIo.I0000oI00(oI000ilOol2).I000OiO(ill0IOI000OOo1O);
                        }
                    }
/* 189 */           if (ooOIOl == ooOIOl2) {
/* 209 */               bool = null;
                    } else {
/* 191 */               OIOOOO oioooo = o00olOO0.I00000oIO;
/* 203 */               int i2 = oioooo == null ? -1 : OoOO000oiO1.I00000oIO[oioooo.ordinal()];
/* 205 */               if (i2 == 1) {
/* 214 */                   bool = Boolean.TRUE;
                        } else if (i2 == 2) {
/* 211 */                   bool = Boolean.FALSE;
                        }
                    }
/* 216 */           if (oI000ilOolI000OiO == null || (ooOIOoO1II00iOIl = oI000ilOolI000OiO.I000OOo1O()) == null) {
/* 224 */               ooOIOoO1II00iOIl = ol0O0iI0l0O.I00iOIl();
                    }
/* 228 */           int i3 = i + 1;
/* 230 */           List listI00OIl = ol0O0iI0l0O.I00OIl();
/* 236 */           List listI000II = ooOIOoO1II00iOIl.I000II();
/* 242 */           Iterator it = listI00OIl.iterator();
/* 246 */           Iterator it2 = listI000II.iterator();
/* 268 */           ArrayList arrayList = new ArrayList(Math.min(IOOi1I.I0000O(listI00OIl, 10), IOOi1I.I0000O(listI000II, 10)));
/* 275 */           while (it.hasNext() && it2.hasNext()) {
/* 283 */               Object next = it.next();
/* 291 */               OoOOiO ooOOiO = (OoOOiO) it2.next();
/* 293 */               OoOi1Ol ooOi1Ol = (OoOi1Ol) next;
/* 295 */               int i4 = 5;
/* 296 */               if (objArr2 == true) {
/* 306 */                   bool2 = bool;
/* 312 */                   if (!ooOi1Ol.I0000Il00O()) {
/* 324 */                       o1i1oo = I0000Il00O(ooOi1Ol.I00000oOI().I00l0OO0IO(), i01i01OoI, i3, z2);
                            } else if (((O00olOO0) i01i01OoI.invoke(Integer.valueOf(i3))).I00000oIO == OIOOOO.I00iOIl) {
/* 349 */                       Ooioo0o1l0 ooioo0o1l0I00l0OO0IO = ooOi1Ol.I00000oOI().I00l0OO0IO();
/* 377 */                       o1i1oo = new O1I1OO(l0loOIIo0iOo.I00000oIO(ilOiIOII1.I00000oIO(ooioo0o1l0I00l0OO0IO).I00li1OI(r4), ilOiIOII1.I00000oOI(ooioo0o1l0I00l0OO0IO).I00li1OI(true)), 1, 5);
                            } else {
/* 386 */                       o1i1oo = new O1I1OO(null, 1, i4);
                            }
                        } else {
/* 298 */                   bool2 = bool;
/* 302 */                   o1i1oo = new O1I1OO(obj, r4, i4);
                        }
/* 391 */               i3 += o1i1oo.I00iiI;
/* 394 */               O0iIl1 o0iIl1 = (O0iIl1) o1i1oo.I00iiO;
/* 436 */               arrayList.add(o0iIl1 != null ? lOoliOIOlIO0.I00000oOI(o0iIl1, ooOi1Ol.I00000oIO(), ooOOiO) : (oI000ilOolI000OiO == null || ooOi1Ol.I0000Il00O()) ? oI000ilOolI000OiO != null ? OoOilo0Oliii.I000iOII(ooOOiO) : null : lOoliOIOlIO0.I00000oOI(ooOi1Ol.I00000oOI(), ooOi1Ol.I00000oIO(), ooOOiO));
/* 439 */               bool = bool2;
/* 441 */               r4 = 0;
/* 444 */               obj = null;
                    }
/* 447 */           Boolean bool3 = bool;
/* 449 */           int i5 = i3 - i;
/* 451 */           if (oI000ilOolI000OiO == null && bool3 == null) {
/* 459 */               if (!arrayList.isEmpty()) {
/* 462 */                   Iterator it3 = arrayList.iterator();
/* 470 */                   while (it3.hasNext()) {
/* 478 */                       if (((OoOi1Ol) it3.next()) == null) {
                                }
                            }
                        }
/* 485 */               return new I00IOO(null, i5, false);
                    }
/* 489 */           I11IlOOO annotations = ol0O0iI0l0O.getAnnotations();
/* 493 */           I11Io0oil0i0 i11Io0oil0i02 = OoOO00ol0.I00000oOI;
/* 495 */           if (oI000ilOolI000OiO == null) {
/* 498 */               i11Io0oil0i02 = null;
                    }
/* 499 */           I11Io0oil0i0 i11Io0oil0i03 = OoOO00ol0.I00000oIO;
/* 501 */           if (bool3 == null) {
/* 504 */               i11Io0oil0i03 = null;
                    }
/* 512 */           char c = 1;
/* 517 */           ArrayList arrayListI001IIilI0O = I1IoiO1l.I001IIilI0O(new I11IlOOO[]{annotations, i11Io0oil0i02, i11Io0oil0i03});
/* 521 */           int size = arrayListI001IIilI0O.size();
/* 525 */           if (size == 0) {
/* 657 */               I000II.I001IO000("At least one Annotations object expected");
/* 660 */               return null;
                    }
/* 546 */           OoOI1i1i ooOI1i1iI00000oOI = lOoOoloI01i0.I00000oOI(size != 1 ? new I11Io0oil0i0(IOOi0Ool1i.I00iIi0i1o(arrayListI001IIilI0O), c == true ? 1 : 0) : (I11IlOOO) IOOi0Ool1i.I00OilO00Il(arrayListI001IIilI0O));
/* 550 */           List listI00OIl2 = ol0O0iI0l0O.I00OIl();
/* 556 */           Iterator it4 = arrayList.iterator();
/* 560 */           Iterator it5 = listI00OIl2.iterator();
/* 580 */           ArrayList arrayList2 = new ArrayList(Math.min(IOOi1I.I0000O(arrayList, 10), IOOi1I.I0000O(listI00OIl2, 10)));
/* 587 */           while (it4.hasNext() && it5.hasNext()) {
/* 595 */               Object next2 = it4.next();
/* 603 */               OoOi1Ol ooOi1Ol2 = (OoOi1Ol) it5.next();
/* 605 */               OoOi1Ol ooOi1Ol3 = (OoOi1Ol) next2;
/* 607 */               if (ooOi1Ol3 != null) {
/* 610 */                   ooOi1Ol2 = ooOi1Ol3;
                        }
/* 611 */               arrayList2.add(ooOi1Ol2);
                    }
/* 626 */           Ol0O0iI0l0O ol0O0iI0l0OI0000Il00O = l0loOIIo0iOo.I0000Il00O(ooOI1i1iI00000oOI, ooOIOoO1II00iOIl, arrayList2, bool3 != null ? bool3.booleanValue() : ol0O0iI0l0O.I00iiI());
/* 632 */           if (o00olOO0.I0000Il00O) {
/* 636 */               ol0O0iI0l0OI0000Il00O = new OIO0IOO(ol0O0iI0l0OI0000Il00O);
                    }
/* 651 */           return new I00IOO(ol0O0iI0l0OI0000Il00O, i5, bool3 != null && o00olOO0.I0000O);
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:31:0x0062  */
                /* JADX WARN: Type inference failed for: r4v5, types: [Ol0O0iI0l0O] */
                /* JADX WARN: Type inference failed for: r4v6, types: [O0iIl1] */
                /* JADX WARN: Type inference failed for: r4v7, types: [Ol0O0iI0l0O] */
                /* JADX WARN: Type inference failed for: r4v8, types: [Ooioo0o1l0] */
                /* JADX WARN: Type inference failed for: r4v9 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public O1I1OO I0000Il00O(Ooioo0o1l0 ooioo0o1l0, I01i01OoI i01i01OoI, int i, boolean z) {
/* 5 */             int i2 = 5;
/* 6 */             Object objI00000oOI = null;
/* 7 */             if (l0loOi1ol11o.I00000oIO(ooioo0o1l0)) {
/* 12 */                return new O1I1OO(objI00000oOI, 1, i2);
                    }
/* 18 */            if (!(ooioo0o1l0 instanceof IlOIOIi00io)) {
/* 126 */               if (!(ooioo0o1l0 instanceof Ol0O0iI0l0O)) {
/* 158 */                   I000II.I00000oIO();
/* 6 */                     return null;
                        }
/* 134 */               I00IOO i00iooI00000oOI = I00000oOI((Ol0O0iI0l0O) ooioo0o1l0, i01i01OoI, i, OoOIOl.I00iiO, false, z);
/* 140 */               boolean z2 = i00iooI00000oOI.I00000oIO;
/* 144 */               O0iIl1 o0iIl1I00000oOI = (Ol0O0iI0l0O) i00iooI00000oOI.I0000Il00O;
/* 146 */               if (z2) {
/* 148 */                   o0iIl1I00000oOI = lOoll01ll0I.I00000oOI(ooioo0o1l0, o0iIl1I00000oOI);
                        }
/* 154 */               return new O1I1OO(o0iIl1I00000oOI, i00iooI00000oOI.I00000oOI, i2);
                    }
/* 20 */            boolean z3 = ooioo0o1l0 instanceof OOlIIOoli;
/* 23 */            IlOIOIi00io ilOIOIi00io = (IlOIOIi00io) ooioo0o1l0;
/* 25 */            Ol0O0iI0l0O ol0O0iI0l0O = ilOIOIi00io.I00iiO;
/* 27 */            Ol0O0iI0l0O ol0O0iI0l0O2 = ilOIOIi00io.I00iiI;
/* 35 */            I00IOO i00iooI00000oOI2 = I00000oOI(ol0O0iI0l0O2, i01i01OoI, i, OoOIOl.I00iOIl, z3, z);
/* 44 */            I00IOO i00iooI00000oOI3 = I00000oOI(ilOIOIi00io.I00iiO, i01i01OoI, i, OoOIOl.I00iiI, z3, z);
/* 50 */            Ol0O0iI0l0O ol0O0iI0l0O3 = (Ol0O0iI0l0O) i00iooI00000oOI3.I0000Il00O;
/* 55 */            ?? I00000oIO = (Ol0O0iI0l0O) i00iooI00000oOI2.I0000Il00O;
/* 57 */            if (I00000oIO != 0 || ol0O0iI0l0O3 != null) {
/* 64 */                if (!i00iooI00000oOI2.I00000oIO) {
                            Ol0O0iI0l0O ol0O0iI0l0O4 = I00000oIO;
/* 68 */                    if (i00iooI00000oOI3.I00000oIO) {
/* 99 */                        if (ol0O0iI0l0O3 != null) {
/* 101 */                           if (I00000oIO == 0) {
/* 103 */                               I00000oIO = ol0O0iI0l0O3;
                                    }
/* 104 */                           I00000oIO = l0loOIIo0iOo.I00000oIO(I00000oIO, ol0O0iI0l0O3);
                                }
/* 108 */                       objI00000oOI = lOoll01ll0I.I00000oOI(ooioo0o1l0, I00000oIO);
                            } else if (z3) {
                                Ol0O0iI0l0O ol0O0iI0l0O5 = I00000oIO;
/* 75 */                        if (I00000oIO == 0) {
/* 77 */                            ol0O0iI0l0O5 = ol0O0iI0l0O2;
                                }
/* 78 */                        if (ol0O0iI0l0O3 != null) {
/* 81 */                            ol0O0iI0l0O = ol0O0iI0l0O3;
                                }
/* 83 */                        objI00000oOI = new OOlIIOoli(ol0O0iI0l0O5, ol0O0iI0l0O, 0);
                            } else {
/* 87 */                        if (I00000oIO == 0) {
/* 89 */                            ol0O0iI0l0O4 = ol0O0iI0l0O2;
                                }
/* 90 */                        if (ol0O0iI0l0O3 != null) {
/* 93 */                            ol0O0iI0l0O = ol0O0iI0l0O3;
                                }
/* 94 */                        objI00000oOI = l0loOIIo0iOo.I00000oIO(ol0O0iI0l0O4, ol0O0iI0l0O);
                            }
                        }
                    }
/* 116 */           return new O1I1OO(objI00000oOI, i00iooI00000oOI2.I00000oOI, i2);
                }

                @Override
                public i11lilllII I0000oI00(Class cls) {
/* 29 */            throw new IllegalStateException("This should never be called.");
                }

                @Override
                public long I0001Ioi1lo(OiiO01I11iI oiiO01I11iI, int i) {
/* 3 */             return oiiO01I11iI.I0001Ioi1lo.I000iOII(i);
                }

                @Override
                public boolean I000l1(Class cls) {
/* 1 */             return false;
                }

                @Override
                public void accept(Object obj, Object obj2) {
/* 5 */             int i = lI1i1OI1O0l.I000iOII;
                }

                @Override
                public void configure(Il0IIIOll il0IIIOll) {
/* 5 */             il0IIIOll.registerEncoder(li1IOoo.class, l0lIiO000loi.I00000oIO);
/* 12 */            il0IIIOll.registerEncoder(lo0II0OI.class, lIliO0o1l.I00000oIO);
/* 19 */            il0IIIOll.registerEncoder(li1OOO.class, l0lOOooiOI.I00000oIO);
/* 26 */            il0IIIOll.registerEncoder(li1lloI1ii0O.class, l0lo1l0o00O.I00000oIO);
/* 33 */            il0IIIOll.registerEncoder(li1iI000lo.class, l0liOO1Ii.I00000oIO);
/* 40 */            il0IIIOll.registerEncoder(li1l0000I0l.class, l0o01000o.I00000oIO);
/* 47 */            il0IIIOll.registerEncoder(lOIo01O01.class, l00l0OO010.I00000oIO);
/* 54 */            il0IIIOll.registerEncoder(lOIlOiiO0o1.class, l00i0O.I00000oIO);
/* 61 */            il0IIIOll.registerEncoder(lOo0lllo.class, l0Oo0oiO0111.I00000oIO);
/* 68 */            il0IIIOll.registerEncoder(lllOOli00.class, lIO0o01.I00000oIO);
/* 75 */            il0IIIOll.registerEncoder(lOIiiO.class, l00OIiOllo.I00000oIO);
/* 82 */            il0IIIOll.registerEncoder(lOIOilI0IllO.class, l00I1l.I00000oIO);
/* 89 */            il0IIIOll.registerEncoder(lioi0lO.class, l1i10iio1ii.I00000oIO);
/* 96 */            il0IIIOll.registerEncoder(loIio1Ii10lO.class, l0Ill11l.I00000oIO);
/* 103 */           il0IIIOll.registerEncoder(lOlO01O.class, l0O1ll01o11l.I00000oIO);
/* 110 */           il0IIIOll.registerEncoder(lOio0o.class, l0IiO0I.I00000oIO);
/* 117 */           il0IIIOll.registerEncoder(lioiiOOIoO.class, l1i1olo01I1.I00000oIO);
/* 124 */           il0IIIOll.registerEncoder(lliollo.class, lIIiiI1l1IO.I00000oIO);
/* 131 */           il0IIIOll.registerEncoder(lll0oI1loOo.class, lIIlIl.I00000oIO);
/* 138 */           il0IIIOll.registerEncoder(llioiIOIoii.class, lIIOi0l01Iol.I00000oIO);
/* 145 */           il0IIIOll.registerEncoder(liIOOi1iIII.class, l101II0i.I00000oIO);
/* 152 */           il0IIIOll.registerEncoder(loIOIoO.class, ioiOii0o11Ol.I00000oIO);
/* 159 */           il0IIIOll.registerEncoder(liIilIiO.class, l10I0oiiiooi.I00000oIO);
/* 166 */           il0IIIOll.registerEncoder(ll0i0l0.class, l1lIil0.I00000oIO);
/* 173 */           il0IIIOll.registerEncoder(ll0ooi101I1I.class, l1llIOlII1l.I00000oIO);
/* 180 */           il0IIIOll.registerEncoder(ll0lOI.class, l1li1O011Ioo.I00000oIO);
/* 187 */           il0IIIOll.registerEncoder(ll0l0O.class, l1lOOiiO.I00000oIO);
/* 194 */           il0IIIOll.registerEncoder(llI0OloOO.class, lI001lo0.I00000oIO);
/* 201 */           il0IIIOll.registerEncoder(llI1Ool0i.class, lI00lOIO0.I00000oIO);
/* 208 */           il0IIIOll.registerEncoder(llIIlo0.class, lI0O0Oo0l1o.I00000oIO);
/* 215 */           il0IIIOll.registerEncoder(llI1l0IlIlO.class, lI0I0IOlOoI.I00000oIO);
/* 222 */           il0IIIOll.registerEncoder(liIIiol0oI10.class, l0ooOI.I00000oIO);
/* 229 */           il0IIIOll.registerEncoder(llIi00Oo.class, lI0i00O0lo1i.I00000oIO);
/* 236 */           il0IIIOll.registerEncoder(llIlI1OOl0.class, lI0l0l.I00000oIO);
/* 243 */           il0IIIOll.registerEncoder(llIll10oOiol.class, lI0oO1O1l.I00000oIO);
/* 250 */           il0IIIOll.registerEncoder(llIoI1iOi.class, lI10I01o.I00000oIO);
/* 257 */           il0IIIOll.registerEncoder(llOI0lO00l.class, lI1iIi0o.I00000oIO);
/* 264 */           il0IIIOll.registerEncoder(llO1Oiloi1l.class, lI1l100IooO.I00000oIO);
/* 271 */           il0IIIOll.registerEncoder(ll1oOIoo.class, l1o1ooI0OIo.I00000oIO);
/* 278 */           il0IIIOll.registerEncoder(lOoii1O1lI1O.class, l0iOliO101.I00000oIO);
/* 285 */           il0IIIOll.registerEncoder(ll1lIIo.class, l1oiio.I00000oIO);
/* 292 */           il0IIIOll.registerEncoder(ll1i1lil01I1.class, l1oO0o.I00000oIO);
/* 299 */           il0IIIOll.registerEncoder(ll1oI0iil.class, l1ooIo1O01o.I00000oIO);
/* 306 */           il0IIIOll.registerEncoder(lll1l1i1o.class, lIIoIOOl.I00000oIO);
/* 313 */           il0IIIOll.registerEncoder(lo10II01i0OO.class, lIoO1oOOI0l.I00000oIO);
/* 320 */           il0IIIOll.registerEncoder(lO0oOIoolo.class, iolilIO.I00000oIO);
/* 327 */           il0IIIOll.registerEncoder(lO0i1o0ii.class, iol11oOi1ol.I00000oIO);
/* 334 */           il0IIIOll.registerEncoder(lO0Ioi0I.class, iol00Io0O.I00000oIO);
/* 341 */           il0IIIOll.registerEncoder(lO0lOoi1liI.class, iol1o00l0IOI.I00000oIO);
/* 348 */           il0IIIOll.registerEncoder(lO11oI0I00l1.class, ioo001I.I00000oIO);
/* 355 */           il0IIIOll.registerEncoder(lO10lI1o.class, iolliOoiO.I00000oIO);
/* 362 */           il0IIIOll.registerEncoder(lO1Io0iOiI01.class, ioo0oI1OiO1.I00000oIO);
/* 369 */           il0IIIOll.registerEncoder(lO1OlOlOlli.class, ioo1oI.I00000oIO);
/* 376 */           il0IIIOll.registerEncoder(lO1iIloO.class, iooO01.I00000oIO);
/* 383 */           il0IIIOll.registerEncoder(lO1lll.class, iooi1lill0oi.I00000oIO);
/* 390 */           il0IIIOll.registerEncoder(lO1oIl1ii.class, ioolOIoO00Il.I00000oIO);
/* 397 */           il0IIIOll.registerEncoder(ililIi.class, ioi000l1i.I00000oIO);
/* 404 */           il0IIIOll.registerEncoder(ill0ii1I.class, ioi1OI0lO.I00000oIO);
/* 411 */           il0IIIOll.registerEncoder(ilioO1o1111.class, ioi11Io.I00000oIO);
/* 418 */           il0IIIOll.registerEncoder(lOoIiIIo0ll.class, l0i1Oi0iloIl.I00000oIO);
/* 425 */           il0IIIOll.registerEncoder(lOO00IiI0li.class, l00llo.I00000oIO);
/* 432 */           il0IIIOll.registerEncoder(iioOO0iI1.class, ill1o0o1.I00000oIO);
/* 439 */           il0IIIOll.registerEncoder(iioIOil.class, illI1ll.I00000oIO);
/* 446 */           il0IIIOll.registerEncoder(lOii0I1II1o.class, l0I11O.I00000oIO);
/* 453 */           il0IIIOll.registerEncoder(iiolOI0I.class, illOOoI001.I00000oIO);
/* 460 */           il0IIIOll.registerEncoder(iioii1oiO01i.class, illiOoil.I00000oIO);
/* 467 */           il0IIIOll.registerEncoder(il1Iil11O.class, io0000oo1.I00000oIO);
/* 474 */           il0IIIOll.registerEncoder(il10o1I1iI1.class, io0010lO.I00000oIO);
/* 481 */           il0IIIOll.registerEncoder(il00O1lo1oOi.class, illlOOOl1i.I00000oIO);
/* 488 */           il0IIIOll.registerEncoder(iioo1llOllO.class, illoi1oOliI.I00000oIO);
/* 495 */           il0IIIOll.registerEncoder(ilI00Ioo.class, io0lliI10i0l.I00000oIO);
/* 502 */           il0IIIOll.registerEncoder(il1llll.class, io10IiI.I00000oIO);
/* 509 */           il0IIIOll.registerEncoder(ilIII1o11.class, io1i1iOI.I00000oIO);
/* 516 */           il0IIIOll.registerEncoder(ilII0oO0.class, io1lIl010i.I00000oIO);
/* 523 */           il0IIIOll.registerEncoder(iliiOo0IllO.class, ioOiOOoo.I00000oIO);
/* 530 */           il0IIIOll.registerEncoder(iliI1i0.class, ioOll10.I00000oIO);
/* 537 */           il0IIIOll.registerEncoder(ilIiIlIII0.class, io1oIO1OOIl.I00000oIO);
/* 544 */           il0IIIOll.registerEncoder(ilIOIo1o1ilI.class, ioI0llili0Io.I00000oIO);
/* 551 */           il0IIIOll.registerEncoder(ilIoI0l0.class, ioIIiioO1.I00000oIO);
/* 558 */           il0IIIOll.registerEncoder(ilIo0oIi1o.class, ioIOOliIoi0l.I00000oIO);
/* 565 */           il0IIIOll.registerEncoder(lo1oOlO.class, lIOOloIioIl.I00000oIO);
/* 572 */           il0IIIOll.registerEncoder(lo11OoIoi.class, l00ool1.I00000oIO);
/* 579 */           il0IIIOll.registerEncoder(lo1i01I.class, l0ol0oo.I00000oIO);
/* 586 */           il0IIIOll.registerEncoder(lo1IiOl11.class, l0oOlI1i11l1.I00000oIO);
/* 593 */           il0IIIOll.registerEncoder(lo11iliilIO.class, l0Iol1i.I00000oIO);
/* 600 */           il0IIIOll.registerEncoder(lo1ll0l1.class, lIOO0IOi0oo.I00000oIO);
/* 607 */           il0IIIOll.registerEncoder(lo1l1OO10I.class, lIOI10l.I00000oIO);
/* 614 */           il0IIIOll.registerEncoder(loI001OlOlOi.class, lIOoOiiIIO1.I00000oIO);
/* 621 */           il0IIIOll.registerEncoder(lo1II1lO.class, l0i0IO.I00000oIO);
/* 628 */           il0IIIOll.registerEncoder(loII1o1000.class, lIoioo01.I00000oIO);
/* 635 */           il0IIIOll.registerEncoder(loI1II00ll.class, lIolo1.I00000oIO);
/* 642 */           il0IIIOll.registerEncoder(loI0llI01.class, lIoi1I1.I00000oIO);
/* 649 */           il0IIIOll.registerEncoder(llli1looIoI1.class, lIi10llo.I00000oIO);
/* 656 */           il0IIIOll.registerEncoder(lOo1ii0o1.class, l0i0o1o1iil1.I00000oIO);
/* 663 */           il0IIIOll.registerEncoder(lOoll01ll0I.class, l0iilOoiOi0.I00000oIO);
/* 670 */           il0IIIOll.registerEncoder(lO0I01oIl1o.class, ioiioioliOl.I00000oIO);
/* 677 */           il0IIIOll.registerEncoder(lOlOlI.class, l0OIol.I00000oIO);
/* 684 */           il0IIIOll.registerEncoder(lOoOol0.class, l0iIi1lOI1.I00000oIO);
/* 691 */           il0IIIOll.registerEncoder(lOiio1iliO.class, l0IOiI.I00000oIO);
/* 698 */           il0IIIOll.registerEncoder(lOO1lI1o.class, l0111liioOl.I00000oIO);
/* 705 */           il0IIIOll.registerEncoder(lOOOIlI.class, l011ooiO.I00000oIO);
/* 712 */           il0IIIOll.registerEncoder(lOO0oi0O1.class, l010iIIioOo.I00000oIO);
/* 719 */           il0IIIOll.registerEncoder(lOOOO1I1o0.class, l01Iooi1.I00000oIO);
/* 726 */           il0IIIOll.registerEncoder(liI10lIO0.class, l0oI1i.I00000oIO);
/* 733 */           il0IIIOll.registerEncoder(li1ooll1i.class, l0o0oI0I1ioO.I00000oIO);
/* 740 */           il0IIIOll.registerEncoder(iio1o0IIl.class, ill100I1oOli.I00000oIO);
/* 747 */           il0IIIOll.registerEncoder(lo0io1o1Olo.class, lIo01i.I00000oIO);
/* 754 */           il0IIIOll.registerEncoder(lo0oIl0l1.class, lIo1ol.I00000oIO);
/* 761 */           il0IIIOll.registerEncoder(lo0lo00oIO.class, lIo11ll.I00000oIO);
/* 768 */           il0IIIOll.registerEncoder(lO00lioO0I.class, ioiIOIlO.I00000oIO);
/* 775 */           il0IIIOll.registerEncoder(lOIIilOlOl0i.class, l001IiI10iIO.I00000oIO);
/* 782 */           il0IIIOll.registerEncoder(lOI1iO.class, l0000iol.I00000oIO);
/* 789 */           il0IIIOll.registerEncoder(lOI01l1O1.class, ioollll.I00000oIO);
/* 796 */           il0IIIOll.registerEncoder(lio0lOll10li.class, l1OlIl.I00000oIO);
/* 803 */           il0IIIOll.registerEncoder(lioOIliIloli.class, l1Ooolo.I00000oIO);
/* 810 */           il0IIIOll.registerEncoder(lio1il0Iil1O.class, l1OoI0ili1O0.I00000oIO);
/* 817 */           il0IIIOll.registerEncoder(il0oill0io.class, ilolOI1I0IIi.I00000oIO);
/* 824 */           il0IIIOll.registerEncoder(il0o1i.class, iloo111O.I00000oIO);
/* 831 */           il0IIIOll.registerEncoder(liolOiO1.class, l1iIllI.I00000oIO);
/* 838 */           il0IIIOll.registerEncoder(ll00lOO1o.class, l1io100o0lO.I00000oIO);
/* 845 */           il0IIIOll.registerEncoder(liool1o110.class, l1iOiiOo.I00000oIO);
/* 852 */           il0IIIOll.registerEncoder(lioolIIo0i.class, l1iilIoo0iO.I00000oIO);
/* 859 */           il0IIIOll.registerEncoder(il1i1IilIol.class, io010oIOII1.I00000oIO);
/* 866 */           il0IIIOll.registerEncoder(il1i0O.class, io0Il00ol1oi.I00000oIO);
/* 873 */           il0IIIOll.registerEncoder(llo100.class, lIio00Io.I00000oIO);
/* 880 */           il0IIIOll.registerEncoder(llo0i000OOO.class, lIil10I.I00000oIO);
/* 887 */           il0IIIOll.registerEncoder(lo0O0i0.class, lIllIi1Iil.I00000oIO);
/* 894 */           il0IIIOll.registerEncoder(lo0OiiII10o.class, lIloOOIoI.I00000oIO);
/* 901 */           il0IIIOll.registerEncoder(ll10OIO0I.class, l1lo0I.I00000oIO);
/* 908 */           il0IIIOll.registerEncoder(ll1OIi.class, l1o1i0Olol1.I00000oIO);
/* 915 */           il0IIIOll.registerEncoder(ll11oO0lo.class, l1loool0.I00000oIO);
/* 922 */           il0IIIOll.registerEncoder(ll1I00iIol.class, l1o0l00o.I00000oIO);
/* 929 */           il0IIIOll.registerEncoder(lOllI0.class, l0Ol0ooIOII1.I00000oIO);
/* 936 */           il0IIIOll.registerEncoder(ilI1Io1io.class, io11o10lo0O.I00000oIO);
/* 943 */           il0IIIOll.registerEncoder(ilI0OOIilo0.class, io1Illl.I00000oIO);
/* 950 */           il0IIIOll.registerEncoder(lOliOi0Oi.class, l0Oi01i0.I00000oIO);
/* 957 */           il0IIIOll.registerEncoder(lOioli00i0ii.class, l0O0liIo0.I00000oIO);
/* 964 */           il0IIIOll.registerEncoder(ll01i01oo11.class, l1l00iiOl1.I00000oIO);
/* 971 */           il0IIIOll.registerEncoder(ll0IoOO1io.class, l1l1OIoi0I.I00000oIO);
/* 978 */           il0IIIOll.registerEncoder(ll0I0olIli.class, l1l0o1l1.I00000oIO);
/* 985 */           il0IIIOll.registerEncoder(il1lO0.class, io0Ooli0i.I00000oIO);
/* 992 */           il0IIIOll.registerEncoder(il1ioIOIolO0.class, io0l0Ill.I00000oIO);
/* 999 */           il0IIIOll.registerEncoder(liio0IiIIil.class, l1I1oOo1l0o.I00000oIO);
/* 1006 */          il0IIIOll.registerEncoder(lil01Olill.class, l1IIill.I00000oIO);
/* 1013 */          il0IIIOll.registerEncoder(lil10110OI.class, l1Ii1llii.I00000oIO);
/* 1020 */          il0IIIOll.registerEncoder(il0OoiI.class, iloI11Iili1l.I00000oIO);
/* 1027 */          il0IIIOll.registerEncoder(il0Io010.class, iloOI1lOOi.I00000oIO);
/* 1034 */          il0IIIOll.registerEncoder(liiI00llO1i0.class, l11loO1I1I.I00000oIO);
/* 1041 */          il0IIIOll.registerEncoder(liiO00.class, l11ol1lOo.I00000oIO);
/* 1048 */          il0IIIOll.registerEncoder(liiilliO.class, l1I0oiOO0.I00000oIO);
/* 1055 */          il0IIIOll.registerEncoder(il01ool0o.class, ilo0I1O1I.I00000oIO);
/* 1062 */          il0IIIOll.registerEncoder(il0101ii.class, ilo10l010.I00000oIO);
/* 1069 */          il0IIIOll.registerEncoder(lil1Ool1oiiI.class, l1Iil111.I00000oIO);
/* 1076 */          il0IIIOll.registerEncoder(lilI1o.class, l1IlOiIoO1i1.I00000oIO);
/* 1083 */          il0IIIOll.registerEncoder(lilOIIIlIO.class, l1Io0OiOIii.I00000oIO);
/* 1090 */          il0IIIOll.registerEncoder(lili0I1oo.class, l1O00OoOiiO0.I00000oIO);
/* 1097 */          il0IIIOll.registerEncoder(il0lOO0l00l.class, iloi110.I00000oIO);
/* 1104 */          il0IIIOll.registerEncoder(il0iol.class, iloilill1I.I00000oIO);
/* 1111 */          il0IIIOll.registerEncoder(lllloI1I0oIO.class, lIiIIol1loII.I00000oIO);
/* 1118 */          il0IIIOll.registerEncoder(llllI0il1o1.class, lIiOO1oO.I00000oIO);
/* 1125 */          il0IIIOll.registerEncoder(lOooIO1I1I.class, l0ilOII.I00000oIO);
/* 1132 */          il0IIIOll.registerEncoder(li010iilO.class, l0l10ol10O1.I00000oIO);
/* 1139 */          il0IIIOll.registerEncoder(li001Oilo00.class, l0ioI1oI01o1.I00000oIO);
/* 1146 */          il0IIIOll.registerEncoder(li0I1lI1li.class, l0l1oOi.I00000oIO);
/* 1153 */          il0IIIOll.registerEncoder(llOO00lI.class, lI1li00.I00000oIO);
/* 1160 */          il0IIIOll.registerEncoder(llOOioo.class, lI1oi1O1i1.I00000oIO);
/* 1167 */          il0IIIOll.registerEncoder(ilOIl0o0.class, ioIo0lil1l.I00000oIO);
/* 1174 */          il0IIIOll.registerEncoder(ilO1ool.class, ioO00oI.I00000oIO);
/* 1181 */          il0IIIOll.registerEncoder(llo1lIOi0ii.class, lIl0OlIlooI0.I00000oIO);
/* 1188 */          il0IIIOll.registerEncoder(llO011o.class, lI111Iii0iO.I00000oIO);
/* 1195 */          il0IIIOll.registerEncoder(llO0lil.class, lI1Io1iI00I.I00000oIO);
/* 1202 */          il0IIIOll.registerEncoder(ilO10l0.class, ioIili1oOilo.I00000oIO);
/* 1209 */          il0IIIOll.registerEncoder(ilO00Ol.class, ioIl1ooO1.I00000oIO);
/* 1216 */          il0IIIOll.registerEncoder(llloii1i000.class, lIiii0I1O.I00000oIO);
/* 1223 */          il0IIIOll.registerEncoder(lii10i1ooo.class, l10Oo1I1.I00000oIO);
/* 1230 */          il0IIIOll.registerEncoder(liOoiol1I0OO.class, l11iiIl.I00000oIO);
/* 1237 */          il0IIIOll.registerEncoder(liOOolIioO0.class, l111Il.I00000oIO);
/* 1244 */          il0IIIOll.registerEncoder(liOO0O01.class, l1101l.I00000oIO);
/* 1251 */          il0IIIOll.registerEncoder(liOiOli.class, l11IO1i.I00000oIO);
/* 1258 */          il0IIIOll.registerEncoder(liOliil.class, l11OOlIII10.I00000oIO);
/* 1265 */          il0IIIOll.registerEncoder(liOI0000I1OI.class, l10oioI.I00000oIO);
/* 1272 */          il0IIIOll.registerEncoder(liIliolI1Oi0.class, l10Il1ioI0i.I00000oIO);
/* 1279 */          il0IIIOll.registerEncoder(liO10OoIlll.class, l10lliii0.I00000oIO);
/* 1286 */          il0IIIOll.registerEncoder(liO0oIOlo0.class, l10iOlioii.I00000oIO);
/* 1293 */          il0IIIOll.registerEncoder(lilol1OolOo.class, l1OOl10ioiOo.I00000oIO);
/* 1300 */          il0IIIOll.registerEncoder(lOi01iio0o.class, l01oill0.I00000oIO);
/* 1307 */          il0IIIOll.registerEncoder(lill1ilil1I.class, l1OIl0IooIOO.I00000oIO);
/* 1314 */          il0IIIOll.registerEncoder(lio00O0OO.class, l1Oiiio0iOO.I00000oIO);
/* 1321 */          il0IIIOll.registerEncoder(lOOllo00lO.class, l01li0o01i.I00000oIO);
/* 1328 */          il0IIIOll.registerEncoder(lOi10Ol.class, l0I0IO1o.I00000oIO);
/* 1335 */          il0IIIOll.registerEncoder(lllOi1oOII.class, lIi0Iol00.I00000oIO);
/* 1342 */          il0IIIOll.registerEncoder(llOoOI00I1o.class, lII0lOl.I00000oIO);
/* 1349 */          il0IIIOll.registerEncoder(lloolOoi.class, lIlOO0iio0.I00000oIO);
/* 1356 */          il0IIIOll.registerEncoder(llilOiOoOo1.class, lIIIOliI.I00000oIO);
/* 1363 */          il0IIIOll.registerEncoder(lliOIl0IO.class, lII1OiOO.I00000oIO);
/* 1370 */          il0IIIOll.registerEncoder(lloOoloi.class, lIl1I0ooO.I00000oIO);
/* 1377 */          il0IIIOll.registerEncoder(ili0Oii10O.class, ioO1iio.I00000oIO);
/* 1384 */          il0IIIOll.registerEncoder(ilOlOIiO0.class, ioOOoiOI.I00000oIO);
/* 1391 */          il0IIIOll.registerEncoder(llolOOOiI0i.class, lIlI0ll1oO.I00000oIO);
/* 1398 */          il0IIIOll.registerEncoder(lOOiill.class, l01i1oIOIol0.I00000oIO);
                }

                @Override
                public Object create(IOiOIoiiO0i iOiOIoiiO0i) {
                    switch (this.I00iOIl) {
                        case 2:
/* 94 */                    return ilIl1O1ii0Oo.I00000oIO((Executor) ((I1ii1o0) iOiOIoiiO0i).I000iOII(new OOiilOlOOI(I1looi0.class, Executor.class)));
                        default:
/* 8 */                     IOIiloOol0 iOIiloOol0 = new IOIiloOol0();
/* 13 */                    ReferenceQueue referenceQueue = new ReferenceQueue();
/* 21 */                    Set setSynchronizedSet = Collections.synchronizedSet(new HashSet());
/* 25 */                    VarHandle.storeStoreFence();
/* 31 */                    Iioo110oI iioo110oI = new Iioo110oI(3);
/* 36 */                    il11olo il11oloVar = new il11olo(iOIiloOol0, referenceQueue);
/* 39 */                    il11oloVar.I00000oIO = setSynchronizedSet;
/* 41 */                    il11oloVar.I00000oOI = iioo110oI;
/* 43 */                    VarHandle.storeStoreFence();
/* 46 */                    setSynchronizedSet.add(il11oloVar);
/* 52 */                    l0iOoII1Il l0iooii1il = new l0iOoII1Il(4);
/* 55 */                    l0iooii1il.I00iiI = referenceQueue;
/* 57 */                    l0iooii1il.I00iiO = setSynchronizedSet;
/* 59 */                    VarHandle.storeStoreFence();
/* 66 */                    Thread thread = new Thread(l0iooii1il, "MlKitCleaner");
/* 70 */                    thread.setDaemon(true);
/* 73 */                    thread.start();
/* 76 */                    return iOIiloOol0;
                    }
                }

                public String toString() {
                    switch (this.I00iOIl) {
                        case 15:
/* 47 */                    return "ReusedSlotId";
                        case 16:
/* 11 */                    int iHashCode = hashCode();
/* 17 */                    iOlI1lIi0.I00000oIO(16);
/* 42 */                    return Oi010OO0.I001IO000("CreationExtras.Key@", Integer.toString(iHashCode, 16), "<", OOoOl0i.I00000oIO.I00000oOI(Application.class).I000oI1ioi(), ">");
                        default:
/* 6 */                     return super.toString();
                    }
                }

                @Override
                public Object zza() {
                    switch (this.I00iOIl) {
                        case PoseLandmark.LEFT_THUMB:
/* 84 */                    List list = iol1II1ii1i.I00000oIO;
/* 88 */                    iI1lO0li.I00iiI.get();
/* 107 */                   return (Long) iI1liIi1li.I00000oIO.I00111O(49, 1000L, "measurement.sgtm.upload.min_delay_after_broadcast").get();
                        case PoseLandmark.RIGHT_THUMB:
/* 49 */                    List list2 = iol1II1ii1i.I00000oIO;
/* 53 */                    iI1lO0li.I00iiI.get();
/* 79 */                    return Integer.valueOf((int) ((Long) iI1liIi1li.I00000oIO.I00111O(22, 200L, "measurement.audience.filter_result_max_count").get()).longValue());
                        case PoseLandmark.LEFT_HIP:
                        default:
/* 6 */                     List list3 = iol1II1ii1i.I00000oIO;
/* 10 */                    iIO0ooOool.I00iiI.get();
/* 27 */                    return (Boolean) iIO1lO.I00000oIO.I0010o(true, "measurement.rb.attribution.service.trigger_uris_high_priority", 2).get();
                        case PoseLandmark.RIGHT_HIP:
/* 30 */                    List list4 = iol1II1ii1i.I00000oIO;
/* 46 */                    return (Boolean) iIIi01I0Ii.I00000oIO.get();
                    }
                }

                @Override
                public iI01O0i0oll zzb(Class cls) {
/* 29 */            throw new IllegalStateException("This should never be called.");
                }

                @Override
                public boolean zzc(Class cls) {
/* 1 */             return false;
                }

                @Override
/* 110 */       public iOIIOoOoii zza() {
/* 111 */           return iOIIOoOoii.I0000Il00O(6, null, "AICore service disconnected");
                }

                @Override
/* 111 */       public iOlI0O0iIiO zza() {
/* 112 */           return iOlI0O0iIiO.I0000Il00O(6, null, "AICore service disconnected");
                }
            }
