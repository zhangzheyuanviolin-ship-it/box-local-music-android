            package p000;

            import android.content.Context;
            import android.graphics.Bitmap;
            import android.graphics.Rect;
            import android.hardware.camera2.CameraDevice;
            import android.hardware.camera2.CameraManager;
            import android.os.Trace;
            import android.util.Log;
            import android.util.Pair;
            import android.util.Range;
            import android.util.Size;
            import com.google.mlkit.vision.pose.PoseLandmark;
            import java.io.ByteArrayInputStream;
            import java.io.EOFException;
            import java.io.File;
            import java.io.FileInputStream;
            import java.io.FileNotFoundException;
            import java.io.FileOutputStream;
            import java.io.IOException;
            import java.io.InputStream;
            import java.io.OutputStream;
            import java.io.RandomAccessFile;
            import java.lang.annotation.Annotation;
            import java.lang.invoke.VarHandle;
            import java.nio.channels.FileChannel;
            import java.nio.channels.FileLock;
            import java.nio.channels.OverlappingFileLockException;
            import java.nio.charset.StandardCharsets;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Collection;
            import java.util.Collections;
            import java.util.HashMap;
            import java.util.Iterator;
            import java.util.LinkedHashMap;
            import java.util.List;
            import java.util.Map;
            import java.util.Objects;
            import java.util.Set;
            import java.util.concurrent.CancellationException;
            import java.util.concurrent.Executor;
            import kotlin.jvm.functions.Function1;
            
/* 18 */    public final class OlOO1i11110 implements OIi0011o, OOlol11, Illo1O0O10l, Oli1llO, IIoi0i, Oli00lo1i {
                public static final int[] I00iio = {1, 2, 1};
                public final int I00iOIl;
                public Object I00iiI;
                public Object I00iiO;

                public OlOO1i11110() {
/* 3 */             this.I00iOIl = 18;
/* 8 */             OoIoOiiO1 ooIoOiiO1 = Ooo0ii.I00000oIO;
/* 11 */            Float fValueOf = Float.valueOf(0.0f);
/* 34 */            this.I00iiO = new I110IiI1I1(ooIoOiiO1, fValueOf, (I110ooool) ooIoOiiO1.I00000oIO.invoke(fValueOf), Long.MIN_VALUE, Long.MIN_VALUE, false);
                }

                public static OlOO1i11110 I0000O(Context context) throws IOException {
                    FileChannel channel;
                    FileLock fileLockLock;
                    try {
/* 20 */                channel = new RandomAccessFile(new File(context.getFilesDir(), "generatefid.lock"), "rw").getChannel();
                        try {
/* 24 */                    fileLockLock = channel.lock();
                        } catch (IOException | Error | OverlappingFileLockException e) {
/* 45 */                    e = e;
/* 46 */                    fileLockLock = null;
                        }
                        try {
/* 32 */                    OlOO1i11110 olOO1i11110 = new OlOO1i11110(9);
/* 35 */                    olOO1i11110.I00iiI = channel;
/* 37 */                    olOO1i11110.I00iiO = fileLockLock;
/* 39 */                    VarHandle.storeStoreFence();
/* 42 */                    return olOO1i11110;
                        } catch (IOException | Error | OverlappingFileLockException e2) {
/* 43 */                    e = e2;
/* 55 */                    Log.e("CrossProcessLock", "encountered error while creating and acquiring the lock, ignoring", e);
/* 58 */                    if (fileLockLock != null) {
                                try {
/* 60 */                            fileLockLock.release();
                                } catch (IOException unused) {
                                }
                            }
/* 63 */                    if (channel != null) {
                                try {
/* 65 */                            channel.close();
                                } catch (IOException unused2) {
                                }
                            }
/* 3 */                     return null;
                        }
                    } catch (IOException | Error | OverlappingFileLockException e3) {
/* 48 */                e = e3;
/* 49 */                channel = null;
/* 50 */                fileLockLock = null;
                    }
                }

                public static OlOO1i11110 I000o00OoI0I(OIIl1OIol oIIl1OIol, IIOOoI iIOOoI) {
/* 5 */             OlOO1i11110 olOO1i11110 = new OlOO1i11110(22);
/* 8 */             olOO1i11110.I00iiI = oIIl1OIol;
/* 10 */            olOO1i11110.I00iiO = iIOOoI;
/* 12 */            VarHandle.storeStoreFence();
/* 37 */            return olOO1i11110;
                }

                @Override
                public O00IIlIoil I0000Il00O(OOloioIl oOloioIl, Object obj) {
                    O00IIlIoil o00IIlIoilI0000Il00O;
/* 3 */             IOlIOiI0iiI1 iOlIOiI0iiI1 = (IOlIOiI0iiI1) this.I00iiI;
/* 5 */             if (iOlIOiI0iiI1 == null) {
/* 8 */                 iOlIOiI0iiI1 = null;
                    }
/* 9 */             if (iOlIOiI0iiI1 == null || (o00IIlIoilI0000Il00O = iOlIOiI0iiI1.I0000Il00O(oOloioIl, obj)) == null) {
/* 17 */                o00IIlIoilI0000Il00O = O00IIlIoil.I00iOIl;
                    }
/* 21 */            if (o00IIlIoilI0000Il00O != O00IIlIoil.I00iOIl) {
/* 106 */               return o00IIlIoilI0000Il00O;
                    }
/* 25 */            OI0Iol1O oI0Iol1O = (OI0Iol1O) this.I00iiO;
/* 40 */            oI0Iol1O.I0001Ioi1lo = IOOi0Ool1i.I00OI1(oI0Iol1O.I0001Ioi1lo, new OIoi0IIoi(oOloioIl, obj));
/* 42 */            return O00IIlIoil.I00iiI;
                }

                @Override
                public void I0000oI00(O1il00oooo o1il00oooo, Bitmap bitmap, Map map) {
                    int i;
/* 1 */             int iI00000oIO = iO1o01.I00000oIO(bitmap);
/* 7 */             OOllli10 oOllli10 = (OOllli10) this.I00iiO;
                    synchronized (oOllli10.I0000Il00O) {
/* 12 */                i = oOllli10.I00000oIO;
                    }
/* 17 */            OOllli10 oOllli102 = (OOllli10) this.I00iiO;
/* 19 */            if (iI00000oIO > i) {
/* 39 */                oOllli102.I0000oI00(o1il00oooo);
/* 46 */                ((O1I1OO) this.I00iiI).I00111O(o1il00oooo, bitmap, map, iI00000oIO);
/* 49 */                return;
                    }
/* 23 */            OOlllIo0 oOlllIo0 = new OOlllIo0();
/* 26 */            oOlllIo0.I00000oIO = bitmap;
/* 28 */            oOlllIo0.I00000oOI = map;
/* 30 */            oOlllIo0.I0000Il00O = iI00000oIO;
/* 32 */            VarHandle.storeStoreFence();
/* 35 */            oOllli102.I0000O(o1il00oooo, oOlllIo0);
                }

                @Override
                public void I0001Ioi1lo(Object obj) {
                    switch (this.I00iOIl) {
                        case 11:
/* 35 */                    OliolIlIO oliolIlIO = (OliolIlIO) obj;
/* 37 */                    oliolIlIO.getClass();
/* 48 */                    ((Olioli) ((I1ii1o0) this.I00iiO).I00iiI).I0000O(oliolIlIO);
                            break;
                        case PoseLandmark.RIGHT_ANKLE:
/* 18 */                    OliolIlIO oliolIlIO2 = (OliolIlIO) obj;
/* 20 */                    oliolIlIO2.getClass();
/* 31 */                    ((Olioli) ((IoIlOo1o0IIl) this.I00iiO).I00iiI).I0000O(oliolIlIO2);
                            break;
                        default:
/* 14 */                    ((Olo1I1) this.I00iiO).I00iiI.I00OIl();
                            break;
                    }
                }

                public Ii10lIo0l1 I000II() {
/* 7 */             lII11l.I00000oIO(IIlio101Io.class, (IIlio101Io) this.I00iiO);
/* 14 */            Ii10oo ii10oo = (Ii10oo) this.I00iiI;
/* 18 */            IIlio101Io iIlio101Io = (IIlio101Io) this.I00iiO;
/* 20 */            Ii10lIo0l1 ii10lIo0l1 = new Ii10lIo0l1();
/* 23 */            ii10lIo0l1.I00000oIO = iIlio101Io;
/* 27 */            int i = 2;
/* 35 */            ii10lIo0l1.I00000oOI = Iiio0Ii.I00000oIO(new Ii10Oil1(ii10oo, i, i, ii10lIo0l1));
/* 47 */            ii10lIo0l1.I0000Il00O = Iiio0Ii.I00000oIO(new Ii10Oil1(ii10oo, 1, i, ii10lIo0l1));
/* 59 */            ii10lIo0l1.I0000O = Iiio0Ii.I00000oIO(new Ii10Oil1(ii10oo, 4, i, ii10lIo0l1));
/* 66 */            ii10lIo0l1.I00100o1O0lo = new IiIio01lo();
/* 73 */            ii10lIo0l1.I0010I0i = new IiIio01lo();
/* 80 */            ii10lIo0l1.I0010o = new IiIio01lo();
/* 93 */            ii10lIo0l1.I0000oI00 = Iiio0Ii.I00000oIO(new Ii10Oil1(ii10oo, 9, i, ii10lIo0l1));
/* 110 */           IiIio01lo.I00000oIO((IiIio01lo) ii10lIo0l1.I0010o, Iiio0Ii.I00000oIO(new Ii10Oil1(ii10oo, 8, i, ii10lIo0l1)));
/* 127 */           IiIio01lo.I00000oIO((IiIio01lo) ii10lIo0l1.I0010I0i, Iiio0Ii.I00000oIO(new Ii10Oil1(ii10oo, 7, i, ii10lIo0l1)));
/* 141 */           ii10lIo0l1.I0001Ioi1lo = Iiio0Ii.I00000oIO(new Ii10Oil1(ii10oo, 10, i, ii10lIo0l1));
/* 154 */           ii10lIo0l1.I000II = Iiio0Ii.I00000oIO(new Ii10Oil1(ii10oo, 11, i, ii10lIo0l1));
/* 166 */           ii10lIo0l1.I000O01llI0 = Iiio0Ii.I00000oIO(new Ii10Oil1(ii10oo, 6, i, ii10lIo0l1));
/* 178 */           ii10lIo0l1.I000OOo1O = Iiio0Ii.I00000oIO(new Ii10Oil1(ii10oo, 5, i, ii10lIo0l1));
/* 194 */           IiIio01lo.I00000oIO((IiIio01lo) ii10lIo0l1.I00100o1O0lo, Iiio0Ii.I00000oIO(new Ii10Oil1(ii10oo, 3, i, ii10lIo0l1)));
/* 208 */           ii10lIo0l1.I000OiO = Iiio0Ii.I00000oIO(new Ii10Oil1(ii10oo, 13, i, ii10lIo0l1));
/* 221 */           ii10lIo0l1.I000iOII = Iiio0Ii.I00000oIO(new Ii10Oil1(ii10oo, 14, i, ii10lIo0l1));
/* 234 */           ii10lIo0l1.I000l1 = Iiio0Ii.I00000oIO(new Ii10Oil1(ii10oo, 12, i, ii10lIo0l1));
/* 247 */           ii10lIo0l1.I000lI = Iiio0Ii.I00000oIO(new Ii10Oil1(ii10oo, 15, i, ii10lIo0l1));
/* 260 */           ii10lIo0l1.I000o00OoI0I = Iiio0Ii.I00000oIO(new Ii10Oil1(ii10oo, 17, i, ii10lIo0l1));
/* 273 */           ii10lIo0l1.I000oI1ioi = Iiio0Ii.I00000oIO(new Ii10Oil1(ii10oo, 16, i, ii10lIo0l1));
/* 285 */           ii10lIo0l1.I00100l0 = Iiio0Ii.I00000oIO(new Ii10Oil1(ii10oo, 0, i, ii10lIo0l1));
/* 287 */           VarHandle.storeStoreFence();
/* 743 */           return ii10lIo0l1;
                }

                public IlIO00o1 I000O01llI0() {
/* 29 */            return new IlIO00o1((String) this.I00iiI, ((HashMap) this.I00iiO) == null ? Collections.EMPTY_MAP : Collections.unmodifiableMap(new HashMap((HashMap) this.I00iiO)));
                }

                @Override
                public O1il0O00 I000OOo1O(O1il00oooo o1il00oooo) {
/* 9 */             OOlllIo0 oOlllIo0 = (OOlllIo0) ((OOllli10) this.I00iiO).I0000Il00O(o1il00oooo);
/* 11 */            if (oOlllIo0 != null) {
/* 19 */                return new O1il0O00(oOlllIo0.I00000oIO, oOlllIo0.I00000oOI);
                    }
/* 23 */            return null;
                }

                @Override
                public void I000OiO(int i) {
                    int i2;
/* 3 */             OOllli10 oOllli10 = (OOllli10) this.I00iiO;
/* 7 */             if (i >= 40) {
/* 10 */                oOllli10.I000O01llI0(-1);
/* 13 */                return;
                    }
/* 16 */            if (10 > i || i >= 20) {
/* 77 */                return;
                    }
                    synchronized (oOllli10.I0000Il00O) {
/* 25 */                i2 = oOllli10.I0000O;
                    }
/* 30 */            oOllli10.I000O01llI0(i2 / 2);
                }

                /* JADX WARN: Removed duplicated region for block: B:105:0x0303  */
                /* JADX WARN: Removed duplicated region for block: B:111:0x0319  */
                /* JADX WARN: Removed duplicated region for block: B:129:0x03af  */
                /* JADX WARN: Removed duplicated region for block: B:133:0x03ce  */
                /* JADX WARN: Removed duplicated region for block: B:139:0x03f9  */
                /* JADX WARN: Removed duplicated region for block: B:147:0x043c  */
                /* JADX WARN: Removed duplicated region for block: B:151:0x044b  */
                /* JADX WARN: Removed duplicated region for block: B:164:0x0481  */
                /* JADX WARN: Removed duplicated region for block: B:175:0x04ab  */
                /* JADX WARN: Removed duplicated region for block: B:184:0x04d1  */
                /* JADX WARN: Removed duplicated region for block: B:185:0x04d6  */
                /* JADX WARN: Removed duplicated region for block: B:189:0x04e3 A[LOOP:16: B:187:0x04dd->B:189:0x04e3, LOOP_END] */
                /* JADX WARN: Removed duplicated region for block: B:193:0x04fa A[LOOP:17: B:191:0x04f4->B:193:0x04fa, LOOP_END] */
                /* JADX WARN: Removed duplicated region for block: B:196:0x0526  */
                /* JADX WARN: Removed duplicated region for block: B:197:0x0528  */
                /* JADX WARN: Removed duplicated region for block: B:208:0x054c  */
                /* JADX WARN: Removed duplicated region for block: B:214:0x0579  */
                /* JADX WARN: Removed duplicated region for block: B:215:0x057c  */
                /* JADX WARN: Removed duplicated region for block: B:225:0x059d  */
                /* JADX WARN: Removed duplicated region for block: B:236:0x05b9  */
                /* JADX WARN: Removed duplicated region for block: B:239:0x05c4  */
                /* JADX WARN: Removed duplicated region for block: B:257:0x0610  */
                /* JADX WARN: Removed duplicated region for block: B:261:0x0635  */
                /* JADX WARN: Removed duplicated region for block: B:269:0x0662  */
                /* JADX WARN: Removed duplicated region for block: B:342:0x0458 A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:356:0x055b A[SYNTHETIC] */
                /* JADX WARN: Type inference failed for: r6v23, types: [boolean, int] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public OlOO1i0ll0 I000iOII(int i, IIllOioOlolI iIllOioOlolI, ArrayList arrayList, ArrayList arrayList2, IIlIi00 iIlIi00, Range range, boolean z) {
                    int i2;
                    Rect rectI000OOo1O;
                    boolean z2;
                    OlilioIoO11 olilioIoO11;
                    boolean z3;
                    LinkedHashMap linkedHashMap;
                    Iterator it;
                    Iterator it2;
                    LinkedHashMap linkedHashMapI000OiO;
                    Iterator it3;
                    boolean z4;
                    Iterator it4;
                    Iterator it5;
                    Range rangeI000o00OoI0I;
                    Iterator it6;
                    Iterator it7;
                    boolean z5;
                    Iterator it8;
                    int i3;
                    Olilii0i olilii0i;
                    int iOrdinal;
                    Oll0IO000Ii oll0IO000IiI000oI1ioi;
                    OlilioIoO11 olilioIoO112;
                    ArrayList arrayList3;
                    boolean z6;
                    Iterator it9;
                    OlilioIoO11 olilioIoO113;
/* 14 */            ArrayList arrayList4 = new ArrayList();
/* 17 */            String strI0001Ioi1lo = iIllOioOlolI.I0001Ioi1lo();
/* 23 */            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
/* 28 */            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
/* 31 */            Iterator it10 = arrayList2.iterator();
/* 39 */            while (it10.hasNext()) {
/* 45 */                Ool10o ool10o = (Ool10o) it10.next();
/* 47 */                I1lIoOIi i1lIoOIi = ool10o.I000OiO;
/* 49 */                if (i1lIoOIi == null) {
/* 307 */                   I000II.I000iOII("Attached stream spec cannot be null for already attached use cases.");
/* 303 */                   return null;
                        }
/* 53 */                IIoI00I00I iIoI00I00I = (IIoI00I00I) this.I00iiO;
/* 55 */                if (iIoI00I00I == null) {
/* 299 */                   I000II.I001IO000("Required value was null.");
/* 295 */                   return null;
                        }
/* 59 */                int iI000o00OoI0I = ool10o.I000OOo1O.I000o00OoI0I();
/* 63 */                Size sizeI0000Il00O = ool10o.I0000Il00O();
/* 67 */                if (sizeI0000Il00O == null) {
/* 291 */                   I000II.I000iOII("Attached surface resolution cannot be null for already attached use cases.");
/* 287 */                   return null;
                        }
/* 71 */                OlOOI001 olOOI001I00100o1O0lo = ool10o.I000OOo1O.I00100o1O0lo();
/* 87 */                lII1OI11o1I.I00000oIO("No such camera id in supported combination list: ".concat(strI0001Ioi1lo), iIoI00I00I.I0000O.containsKey(strI0001Ioi1lo));
                        synchronized (iIoI00I00I.I0000Il00O) {
/* 99 */                    olilioIoO113 = (OlilioIoO11) iIoI00I00I.I0000O.get(strI0001Ioi1lo);
                        }
/* 102 */               if (olilioIoO113 == null) {
/* 280 */                   I000II.I000iOII("No such camera id in supported combination list: ".concat(strI0001Ioi1lo));
/* 272 */                   return null;
                        }
/* 104 */               OlOOI001 olOOI001 = Olio00O.I0000oI00;
/* 114 */               Olio00O olio00OI000o00OoI0I = loIOiIO1O1.I000o00OoI0I(iI000o00OoI0I, sizeI0000Il00O, olilioIoO113.I000lI(iI000o00OoI0I), i, OliloO1OOO.I00iiI, olOOI001I00100o1O0lo);
/* 120 */               int iI000o00OoI0I2 = ool10o.I000OOo1O.I000o00OoI0I();
/* 124 */               Size sizeI0000Il00O2 = ool10o.I0000Il00O();
/* 128 */               Iio1oiI iio1oiI = i1lIoOIi.I0000Il00O;
/* 132 */               ArrayList arrayList5 = new ArrayList();
/* 137 */               if (ool10o instanceof OlOO1Io010o) {
/* 146 */                   Iterator it11 = ((OlOO1Io010o) ool10o).I0010o.I00iOIl.iterator();
/* 154 */                   while (it11.hasNext()) {
/* 168 */                       arrayList5.add(((Ool10o) it11.next()).I000OOo1O.I0010o());
                            }
                        } else {
/* 178 */                   arrayList5.add(ool10o.I000OOo1O.I0010o());
                        }
/* 181 */               IOlOo1ll1l1 iOlOo1ll1l1 = i1lIoOIi.I0001Ioi1lo;
/* 195 */               int iIntValue = ((Integer) ool10o.I000OOo1O.I00000oOI(OolIl0ii1.I00Iooi00oi, 0)).intValue();
/* 213 */               Range range2 = (Range) ool10o.I000OOo1O.I00000oOI(OolIl0ii1.I00O0i0ii, I1lIoOIi.I000O01llI0);
/* 215 */               if (range2 == null) {
/* 268 */                   I000II.I000iOII("Required value was null.");
/* 185 */                   return null;
                        }
/* 227 */               Boolean bool = (Boolean) ool10o.I000OOo1O.I00000oOI(OolIl0ii1.I00O0o1oo, Boolean.FALSE);
/* 229 */               Objects.requireNonNull(bool);
/* 250 */               I1ilio0iOl i1ilio0iOlI00000oIO = I1ilio0iOl.I00000oIO(olio00OI000o00OoI0I, iI000o00OoI0I2, sizeI0000Il00O2, iio1oiI, arrayList5, iOlOo1ll1l1, iIntValue, range2, bool.booleanValue(), ool10o.I000OOo1O.I001i1O0Ol(ool10o.I0000Il00O()));
/* 254 */               arrayList4.add(i1ilio0iOlI00000oIO);
/* 257 */               linkedHashMap3.put(i1ilio0iOlI00000oIO, ool10o);
/* 260 */               linkedHashMap2.put(ool10o, i1lIoOIi);
                    }
/* 315 */           Pair pair = new Pair(linkedHashMap2, linkedHashMap3);
/* 320 */           Map map = (Map) pair.second;
/* 340 */           HashMap mapI001iOo1i0O = IIoIi00lIii0.I001iOo1i0O(arrayList, (OolO0o0O10I) iIlIi00.I00000oOI(IIlIi00.I0000oI00, OolO0o0O10I.I00000oIO), (IIoIi0iI) this.I00iiI, range);
/* 344 */           String strI0001Ioi1lo2 = iIllOioOlolI.I0001Ioi1lo();
/* 350 */           LinkedHashMap linkedHashMap4 = new LinkedHashMap();
/* 357 */           if (arrayList.isEmpty()) {
/* 1701 */              i2 = Integer.MAX_VALUE;
                    } else {
/* 361 */               LinkedHashMap linkedHashMap5 = new LinkedHashMap();
/* 366 */               LinkedHashMap linkedHashMap6 = new LinkedHashMap();
                        try {
/* 369 */                   rectI000OOo1O = iIllOioOlolI.I000OOo1O();
                        } catch (NullPointerException unused) {
/* 374 */                   rectI000OOo1O = null;
                        }
/* 387 */               OlilOlOiI olilOlOiI = new OlilOlOiI(iIllOioOlolI, rectI000OOo1O != null ? OoI0lIiO.I0001Ioi1lo(rectI000OOo1O) : null);
/* 390 */               Iterator it12 = arrayList.iterator();
/* 398 */               while (it12.hasNext()) {
/* 404 */                   Ool10o ool10o2 = (Ool10o) it12.next();
/* 406 */                   Object obj = mapI001iOo1i0O.get(ool10o2);
/* 410 */                   if (obj == null) {
/* 435 */                       I000II.I000iOII("Required value was null.");
/* 311 */                       return null;
                            }
/* 412 */                   IIoIIlol iIoIIlol = (IIoIIlol) obj;
/* 418 */                   OolIl0ii1 oolIl0ii1I000oI1ioi = ool10o2.I000oI1ioi(iIllOioOlolI, iIoIIlol.I00000oIO, iIoIIlol.I00000oOI);
/* 422 */                   linkedHashMap5.put(oolIl0ii1I000oI1ioi, ool10o2);
/* 429 */                   linkedHashMap6.put(oolIl0ii1I000oI1ioi, olilOlOiI.I000oI1ioi(oolIl0ii1I000oI1ioi));
                        }
/* 442 */               OiOi011iI1ol oiOi011iI1ol = new OiOi011iI1ol(7);
/* 445 */               oiOi011iI1ol.I00iiI = mapI001iOo1i0O;
/* 447 */               oiOi011iI1ol.I00iiO = iIllOioOlolI;
/* 449 */               VarHandle.storeStoreFence();
/* 452 */               Oooi0I oooi0II00000oIO = li0IooIlo10.I00000oIO(arrayList, oiOi011iI1ol);
/* 458 */               IIoI00I00I iIoI00I00I2 = (IIoI00I00I) this.I00iiO;
/* 460 */               if (iIoI00I00I2 == null) {
/* 1697 */                  I000II.I001IO000("Required value was null.");
/* 311 */                   return null;
                        }
/* 470 */               ArrayList arrayList6 = new ArrayList(map.keySet());
/* 473 */               Iterator it13 = arrayList.iterator();
                        while (true) {
/* 482 */                   if (!it13.hasNext()) {
/* 501 */                       z2 = false;
                                break;
                            }
/* 488 */                   Ool10o ool10o3 = (Ool10o) it13.next();
/* 490 */                   if (ool10o3 != null && li0IooIlo10.I00000oOI(ool10o3)) {
/* 498 */                       z2 = true;
                                break;
                            }
                        }
/* 515 */               lII1OI11o1I.I00000oIO("No such camera id in supported combination list: ".concat(strI0001Ioi1lo2), iIoI00I00I2.I0000O.containsKey(strI0001Ioi1lo2));
                        synchronized (iIoI00I00I2.I0000Il00O) {
/* 527 */                   olilioIoO11 = (OlilioIoO11) iIoI00I00I2.I0000O.get(strI0001Ioi1lo2);
                        }
/* 530 */               if (olilioIoO11 == null) {
/* 1685 */                  I000II.I000iOII("No such camera id in supported combination list: ".concat(strI0001Ioi1lo2));
/* 1688 */                  return null;
                        }
/* 532 */               IiiIlilOO iiiIlilOO = olilioIoO11.I001iOo1i0O;
                        synchronized (iiiIlilOO.I0000Il00O) {
/* 541 */                   iiiIlilOO.I0001Ioi1lo = iiiIlilOO.I00000oIO();
                        }
/* 546 */               if (olilioIoO11.I001IO000 == null) {
/* 548 */                   olilioIoO11.I00000oOI();
                        } else {
/* 626 */                   olilioIoO11.I001IO000 = I1lO00O00I1.I00000oIO(olilioIoO11.I000l1().I00000oIO, olilioIoO11.I000l1().I00000oOI, olilioIoO11.I001iOo1i0O.I0000Il00O(), olilioIoO11.I000l1().I0000O, olilioIoO11.I000l1().I0000oI00, olilioIoO11.I000l1().I0001Ioi1lo, olilioIoO11.I000l1().I000II, olilioIoO11.I000l1().I000O01llI0, olilioIoO11.I000l1().I000OOo1O);
                        }
/* 628 */               Range range3 = Io1iOil0oli.I0001Ioi1lo;
/* 630 */               Set setKeySet = linkedHashMap6.keySet();
/* 644 */               ArrayList arrayList7 = new ArrayList(IOOi1I.I0000O(arrayList6, 10));
/* 647 */               Iterator it14 = arrayList6.iterator();
/* 655 */               while (it14.hasNext()) {
/* 669 */                   arrayList7.add(Integer.valueOf(((I1ilio0iOl) it14.next()).I000II));
                        }
/* 673 */               Set set = setKeySet;
/* 681 */               ArrayList arrayList8 = new ArrayList(IOOi1I.I0000O(set, 10));
/* 684 */               Iterator it15 = set.iterator();
/* 692 */               while (it15.hasNext()) {
/* 706 */                   Integer num = (Integer) ((OolIl0ii1) it15.next()).I00000oOI(OolIl0ii1.I00Iooi00oi, 0);
/* 708 */                   num.getClass();
/* 711 */                   arrayList8.add(num);
                        }
/* 715 */               ArrayList arrayListI00O10llo = IOOi0Ool1i.I00O10llo(arrayList7, arrayList8);
/* 723 */               if (arrayListI00O10llo.isEmpty()) {
/* 725 */                   z3 = false;
/* 753 */                   if (z3 && !arrayListI00O10llo.isEmpty()) {
/* 762 */                       it9 = arrayListI00O10llo.iterator();
/* 770 */                       while (it9.hasNext()) {
/* 783 */                           if (((Number) it9.next()).intValue() != 1) {
/* 788 */                               I000II.I000iOII("All sessionTypes should be high-speed when any of them is high-speed");
/* 311 */                               return null;
                                    }
                                }
                            }
/* 792 */                   if (z3) {
/* 944 */                       linkedHashMap = linkedHashMap6;
                            } else {
/* 794 */                       Io1iOil0oli io1iOil0oli = olilioIoO11.I001lloI;
/* 796 */                       io1iOil0oli.getClass();
/* 809 */                       List listI00000oIO = Io1iOil0oli.I00000oIO(IOOi0Ool1i.I00iIi0i1o(linkedHashMap6.values()));
/* 817 */                       ArrayList arrayList9 = new ArrayList();
/* 828 */                       for (Object obj2 : listI00000oIO) {
/* 849 */                           if (((List) io1iOil0oli.I0000oI00.getValue()).contains((Size) obj2)) {
/* 851 */                               arrayList9.add(obj2);
                                    }
                                }
/* 865 */                       LinkedHashMap linkedHashMap7 = new LinkedHashMap(O1Oii0o0Oi.I00000oIO(linkedHashMap6.size()));
/* 882 */                       for (Map.Entry entry : linkedHashMap6.entrySet()) {
/* 890 */                           Object key = entry.getKey();
/* 898 */                           List list = (List) entry.getValue();
/* 904 */                           ArrayList arrayList10 = new ArrayList();
/* 915 */                           for (Object obj3 : list) {
/* 928 */                               if (arrayList9.contains((Size) obj3)) {
/* 930 */                                   arrayList10.add(obj3);
                                        }
                                    }
/* 936 */                           linkedHashMap7.put(key, arrayList10);
                                }
/* 942 */                       linkedHashMap = linkedHashMap7;
                            }
/* 951 */                   List<OolIl0ii1> listI00iIi0i1o = IOOi0Ool1i.I00iIi0i1o(linkedHashMap.keySet());
/* 957 */                   ArrayList arrayList11 = new ArrayList();
/* 962 */                   ArrayList arrayList12 = new ArrayList();
/* 965 */                   it = listI00iIi0i1o.iterator();
/* 973 */                   while (it.hasNext()) {
/* 987 */                       Integer num2 = (Integer) ((OolIl0ii1) it.next()).I00000oOI(OolIl0ii1.I00IoiI, 0);
/* 989 */                       num2.getClass();
/* 996 */                       if (!arrayList12.contains(num2)) {
/* 998 */                           arrayList12.add(num2);
                                }
                            }
/* 1002 */                  IOOiOil.I000o00OoI0I(arrayList12);
/* 1005 */                  Collections.reverse(arrayList12);
/* 1008 */                  it2 = arrayList12.iterator();
/* 1016 */                  while (it2.hasNext()) {
/* 1024 */                      int iIntValue2 = ((Number) it2.next()).intValue();
/* 1036 */                      for (OolIl0ii1 oolIl0ii1 : listI00iIi0i1o) {
/* 1056 */                          if (iIntValue2 == ((Integer) oolIl0ii1.I00000oOI(OolIl0ii1.I00IoiI, 0)).intValue()) {
/* 1066 */                              arrayList11.add(Integer.valueOf(listI00iIi0i1o.indexOf(oolIl0ii1)));
                                    }
                                }
                            }
/* 1072 */                  linkedHashMapI000OiO = olilioIoO11.I001lllioOl.I000OiO(arrayList6, listI00iIi0i1o, arrayList11);
/* 1083 */                  if (l11I11lO.I0000O(3, "CXCP")) {
/* 1085 */                      linkedHashMapI000OiO.toString();
                            }
/* 1088 */                  it3 = arrayList6.iterator();
                            while (true) {
/* 1098 */                      if (!it3.hasNext()) {
/* 1108 */                          if (((I1ilio0iOl) it3.next()).I00000oOI == 4101) {
                                        break;
                                    }
                                } else {
/* 1117 */                          Iterator it16 = linkedHashMap.keySet().iterator();
/* 1125 */                          while (it16.hasNext()) {
/* 1137 */                              if (((OolIl0ii1) it16.next()).I000o00OoI0I() == 4101) {
                                        }
                                    }
/* 1140 */                          z4 = false;
                                }
                            }
/* 1110 */                  z4 = true;
/* 1142 */                  it4 = arrayList6.iterator();
/* 1146 */                  Boolean boolValueOf = null;
/* 1152 */                  while (it4.hasNext()) {
/* 1160 */                      boolean z7 = ((I1ilio0iOl) it4.next()).I000OOo1O;
/* 1162 */                      if (boolValueOf != null && !boolValueOf.equals(Boolean.valueOf(z7))) {
/* 1177 */                          I000II.I001IO000("All isStrictFpsRequired should be the same");
/* 311 */                           return null;
                                }
/* 1181 */                      boolValueOf = Boolean.valueOf(z7);
                            }
/* 1186 */                  it5 = listI00iIi0i1o.iterator();
/* 1194 */                  while (it5.hasNext()) {
/* 1210 */                      Boolean bool2 = (Boolean) ((OolIl0ii1) it5.next()).I00000oOI(OolIl0ii1.I00O0o1oo, Boolean.FALSE);
/* 1212 */                      Objects.requireNonNull(bool2);
/* 1215 */                      if (boolValueOf != null && !boolValueOf.equals(bool2)) {
/* 1226 */                          I000II.I001IO000("All isStrictFpsRequired should be the same");
/* 311 */                           return null;
                                }
/* 1230 */                      boolValueOf = bool2;
                            }
/* 1239 */                  boolean zBooleanValue = boolValueOf == null ? boolValueOf.booleanValue() : false;
/* 1240 */                  rangeI000o00OoI0I = I1lIoOIi.I000O01llI0;
/* 1242 */                  it6 = arrayList6.iterator();
/* 1250 */                  while (it6.hasNext()) {
/* 1260 */                      rangeI000o00OoI0I = OlilioIoO11.I000o00OoI0I(((I1ilio0iOl) it6.next()).I000O01llI0, rangeI000o00OoI0I, zBooleanValue);
                            }
/* 1265 */                  it7 = arrayList11.iterator();
/* 1273 */                  while (it7.hasNext()) {
/* 1301 */                      rangeI000o00OoI0I = OlilioIoO11.I000o00OoI0I((Range) ((OolIl0ii1) listI00iIi0i1o.get(((Number) it7.next()).intValue())).I00000oOI(OolIl0ii1.I00O0i0ii, I1lIoOIi.I000O01llI0), rangeI000o00OoI0I, zBooleanValue);
                            }
/* 1311 */                  boolean zBooleanValue2 = Boolean.valueOf(zBooleanValue).booleanValue();
/* 1321 */                  z5 = oooi0II00000oIO != Oooi0I.I00ilI0I1;
/* 1325 */                  l11I11lO.I0000O(3, "CXCP");
/* 1328 */                  boolean z8 = olilioIoO11.I00111O;
/* 1330 */                  if (!z5 && !z8 && z) {
/* 1339 */                      I000II.I000iOII("Preview stabilization is not supported by the camera.");
/* 311 */                       return null;
                            }
/* 1347 */                  it8 = linkedHashMapI000OiO.values().iterator();
                            while (true) {
/* 1355 */                      if (it8.hasNext()) {
/* 1374 */                          i3 = 8;
                                    break;
                                }
/* 1367 */                      if (((Iio1oiI) it8.next()).I00000oOI == 10) {
/* 1369 */                          i3 = 10;
                                    break;
                                }
                            }
/* 1388 */                  OliliiIIiil oliliiIIiil = new OliliiIIiil(i, i3, z2, oooi0II00000oIO, z4, z3, z, false, rangeI000o00OoI0I, zBooleanValue2);
/* 1393 */                  olilioIoO11.I0010I0i(oliliiIIiil);
/* 1396 */                  Collection collectionValues = linkedHashMapI000OiO.values();
/* 1400 */                  if (z) {
/* 1402 */                      olilii0i = Olilii0i.I00iOIl;
                            } else {
/* 1407 */                      ?? Contains = collectionValues.contains(Iio1oiI.I0000oI00);
/* 1415 */                      Integer num3 = (Integer) rangeI000o00OoI0I.getUpper();
                                int i4 = Contains;
/* 1417 */                      if (num3 != null) {
                                    i4 = Contains;
/* 1426 */                          if (num3.intValue() == 60) {
/* 1428 */                              i4 = Contains + 1;
                                    }
                                }
/* 1432 */                      if (oooi0II00000oIO != Oooi0I.I00iio) {
                                    int i5 = i4;
/* 1436 */                          if (oooi0II00000oIO == Oooi0I.I00ilI0I1) {
/* 1438 */                              i5 = i4 + 1;
                                    }
/* 1440 */                          if (z4) {
/* 1442 */                              i5++;
                                    }
/* 1455 */                          olilii0i = i5 > 1 ? Olilii0i.I00iiI : i5 == 1 ? Olilii0i.I00iiO : Olilii0i.I00iOIl;
                                }
                            }
/* 1464 */                  if (l11I11lO.I0000O(3, "CXCP")) {
/* 1466 */                      Objects.toString(olilii0i);
                            }
/* 1469 */                  iOrdinal = olilii0i.ordinal();
/* 1475 */                  if (iOrdinal != 0) {
/* 1559 */                      OliliiIIiil oliliiIIiilI00000oIO = OliliiIIiil.I00000oIO(oliliiIIiil, false, null, 895);
/* 1563 */                      olilioIoO11.I0010I0i(oliliiIIiilI00000oIO);
/* 1566 */                      oll0IO000IiI000oI1ioi = olilioIoO11.I000oI1ioi(oliliiIIiilI00000oIO, arrayList6, linkedHashMap, listI00iIi0i1o, arrayList11, linkedHashMapI000OiO);
                            } else if (iOrdinal == 1) {
/* 1535 */                      if (z) {
/* 1537 */                          Range range4 = I1lIoOIi.I000O01llI0;
                                }
/* 1541 */                      OliliiIIiil oliliiIIiilI00000oIO2 = OliliiIIiil.I00000oIO(oliliiIIiil, true, rangeI000o00OoI0I, 639);
/* 1545 */                      olilioIoO11.I0010I0i(oliliiIIiilI00000oIO2);
/* 1548 */                      oll0IO000IiI000oI1ioi = olilioIoO11.I000oI1ioi(oliliiIIiilI00000oIO2, arrayList6, linkedHashMap, listI00iIi0i1o, arrayList11, linkedHashMapI000OiO);
                            } else {
/* 1481 */                      if (iOrdinal != 2) {
/* 1527 */                          I000II.I00000oIO();
/* 311 */                           return null;
                                }
                                try {
/* 1486 */                          OliliiIIiil oliliiIIiilI00000oIO3 = OliliiIIiil.I00000oIO(oliliiIIiil, false, null, 895);
/* 1490 */                          olilioIoO11.I0010I0i(oliliiIIiilI00000oIO3);
/* 1493 */                          olilioIoO112 = olilioIoO11;
/* 1494 */                          arrayList3 = arrayList11;
/* 1496 */                          z6 = true;
                                    try {
/* 1498 */                              oll0IO000IiI000oI1ioi = olilioIoO112.I000oI1ioi(oliliiIIiilI00000oIO3, arrayList6, linkedHashMap, listI00iIi0i1o, arrayList3, linkedHashMapI000OiO);
                                    } catch (IllegalArgumentException unused2) {
/* 1510 */                              l11I11lO.I0000O(3, "CXCP");
/* 1513 */                              OliliiIIiil oliliiIIiilI00000oIO4 = OliliiIIiil.I00000oIO(oliliiIIiil, z6, null, 895);
/* 1517 */                              olilioIoO112.I0010I0i(oliliiIIiilI00000oIO4);
/* 1520 */                              oll0IO000IiI000oI1ioi = olilioIoO112.I000oI1ioi(oliliiIIiilI00000oIO4, arrayList6, linkedHashMap, listI00iIi0i1o, arrayList3, linkedHashMapI000OiO);
/* 1570 */                              LinkedHashMap linkedHashMap8 = oll0IO000IiI000oI1ioi.I00000oIO;
/* 1572 */                              LinkedHashMap linkedHashMap9 = oll0IO000IiI000oI1ioi.I00000oOI;
/* 1574 */                              i2 = oll0IO000IiI000oI1ioi.I0000Il00O;
/* 1588 */                              while (r4.hasNext()) {
                                        }
/* 1633 */                              while (r1.hasNext()) {
                                        }
/* 1710 */                              LinkedHashMap linkedHashMapI0001Ioi1lo = O1Oii0O0loo.I0001Ioi1lo((Map) pair.first, linkedHashMap4);
/* 1714 */                              OlOO1i0ll0 olOO1i0ll0 = new OlOO1i0ll0();
/* 1717 */                              olOO1i0ll0.I00000oIO = linkedHashMapI0001Ioi1lo;
/* 1719 */                              olOO1i0ll0.I00000oOI = i2;
/* 1721 */                              VarHandle.storeStoreFence();
/* 2665 */                              return olOO1i0ll0;
                                    }
                                } catch (IllegalArgumentException unused3) {
/* 1505 */                          olilioIoO112 = olilioIoO11;
/* 1506 */                          arrayList3 = arrayList11;
/* 1508 */                          z6 = true;
                                }
                            }
/* 1570 */                  LinkedHashMap linkedHashMap82 = oll0IO000IiI000oI1ioi.I00000oIO;
/* 1572 */                  LinkedHashMap linkedHashMap92 = oll0IO000IiI000oI1ioi.I00000oOI;
/* 1574 */                  i2 = oll0IO000IiI000oI1ioi.I0000Il00O;
/* 1588 */                  for (Map.Entry entry2 : linkedHashMap5.entrySet()) {
/* 1596 */                      Object value = entry2.getValue();
/* 1604 */                      Object obj4 = linkedHashMap82.get(entry2.getKey());
/* 1608 */                      if (obj4 == null) {
/* 1616 */                          I000II.I000iOII("Required value was null.");
/* 1619 */                          return null;
                                }
/* 1610 */                      linkedHashMap4.put(value, obj4);
                            }
/* 1633 */                  for (Map.Entry entry3 : linkedHashMap92.entrySet()) {
/* 1649 */                      if (map.containsKey(entry3.getKey())) {
/* 1655 */                          Object obj5 = map.get(entry3.getKey());
/* 1659 */                          if (obj5 == null) {
/* 1671 */                              I000II.I000iOII("Required value was null.");
/* 1674 */                              return null;
                                    }
/* 1665 */                          linkedHashMap4.put(obj5, entry3.getValue());
                                }
                            }
                        } else {
/* 728 */                   Iterator it17 = arrayListI00O10llo.iterator();
/* 736 */                   while (it17.hasNext()) {
/* 749 */                       if (((Number) it17.next()).intValue() == 1) {
/* 751 */                           z3 = true;
                                    break;
                                }
                            }
/* 725 */                   z3 = false;
/* 753 */                   if (z3) {
/* 762 */                       it9 = arrayListI00O10llo.iterator();
/* 770 */                       while (it9.hasNext()) {
                                }
                            }
/* 792 */                   if (z3) {
                            }
/* 951 */                   List<OolIl0ii1> listI00iIi0i1o2 = IOOi0Ool1i.I00iIi0i1o(linkedHashMap.keySet());
/* 957 */                   ArrayList arrayList112 = new ArrayList();
/* 962 */                   ArrayList arrayList122 = new ArrayList();
/* 965 */                   it = listI00iIi0i1o2.iterator();
/* 973 */                   while (it.hasNext()) {
                            }
/* 1002 */                  IOOiOil.I000o00OoI0I(arrayList122);
/* 1005 */                  Collections.reverse(arrayList122);
/* 1008 */                  it2 = arrayList122.iterator();
/* 1016 */                  while (it2.hasNext()) {
                            }
/* 1072 */                  linkedHashMapI000OiO = olilioIoO11.I001lllioOl.I000OiO(arrayList6, listI00iIi0i1o2, arrayList112);
/* 1083 */                  if (l11I11lO.I0000O(3, "CXCP")) {
                            }
/* 1088 */                  it3 = arrayList6.iterator();
                            while (true) {
/* 1098 */                      if (!it3.hasNext()) {
                                }
                            }
/* 1110 */                  z4 = true;
/* 1142 */                  it4 = arrayList6.iterator();
/* 1146 */                  Boolean boolValueOf2 = null;
/* 1152 */                  while (it4.hasNext()) {
                            }
/* 1186 */                  it5 = listI00iIi0i1o2.iterator();
/* 1194 */                  while (it5.hasNext()) {
                            }
/* 1239 */                  if (boolValueOf2 == null) {
                            }
/* 1240 */                  rangeI000o00OoI0I = I1lIoOIi.I000O01llI0;
/* 1242 */                  it6 = arrayList6.iterator();
/* 1250 */                  while (it6.hasNext()) {
                            }
/* 1265 */                  it7 = arrayList112.iterator();
/* 1273 */                  while (it7.hasNext()) {
                            }
/* 1311 */                  boolean zBooleanValue22 = Boolean.valueOf(zBooleanValue).booleanValue();
/* 1321 */                  if (oooi0II00000oIO != Oooi0I.I00ilI0I1) {
                            }
/* 1325 */                  l11I11lO.I0000O(3, "CXCP");
/* 1328 */                  boolean z82 = olilioIoO11.I00111O;
/* 1330 */                  if (!z5) {
                            }
/* 1347 */                  it8 = linkedHashMapI000OiO.values().iterator();
                            while (true) {
/* 1355 */                      if (it8.hasNext()) {
                                }
                            }
/* 1388 */                  OliliiIIiil oliliiIIiil2 = new OliliiIIiil(i, i3, z2, oooi0II00000oIO, z4, z3, z, false, rangeI000o00OoI0I, zBooleanValue22);
/* 1393 */                  olilioIoO11.I0010I0i(oliliiIIiil2);
/* 1396 */                  Collection collectionValues2 = linkedHashMapI000OiO.values();
/* 1400 */                  if (z) {
                            }
/* 1464 */                  if (l11I11lO.I0000O(3, "CXCP")) {
                            }
/* 1469 */                  iOrdinal = olilii0i.ordinal();
/* 1475 */                  if (iOrdinal != 0) {
                            }
/* 1570 */                  LinkedHashMap linkedHashMap822 = oll0IO000IiI000oI1ioi.I00000oIO;
/* 1572 */                  LinkedHashMap linkedHashMap922 = oll0IO000IiI000oI1ioi.I00000oOI;
/* 1574 */                  i2 = oll0IO000IiI000oI1ioi.I0000Il00O;
/* 1588 */                  while (r4.hasNext()) {
                            }
/* 1633 */                  while (r1.hasNext()) {
                            }
                        }
                    }
/* 1710 */          LinkedHashMap linkedHashMapI0001Ioi1lo2 = O1Oii0O0loo.I0001Ioi1lo((Map) pair.first, linkedHashMap4);
/* 1714 */          OlOO1i0ll0 olOO1i0ll02 = new OlOO1i0ll0();
/* 1717 */          olOO1i0ll02.I00000oIO = linkedHashMapI0001Ioi1lo2;
/* 1719 */          olOO1i0ll02.I00000oOI = i2;
/* 1721 */          VarHandle.storeStoreFence();
/* 2665 */          return olOO1i0ll02;
                }

                public byte[] I000lI(int i, String str) throws IOException {
/* 3 */             byte[] bArr = (byte[]) this.I00iiO;
/* 6 */             if (i >= 0) {
/* 13 */                int i2 = 1;
/* 14 */                if (1 <= str.length() - i) {
/* 18 */                    if ((i & 1) != 0) {
/* 62 */                        IioIoO10iOiI.I000OOo1O("a hexadecimal encoding must have an even number of characters");
/* 5 */                         return null;
                            }
/* 20 */                    int i3 = i >>> 1;
/* 21 */                    byte[] bArr2 = new byte[i3];
/* 24 */                    for (int i4 = 0; i4 < i3; i4++) {
/* 26 */                        int i5 = i2 + 1;
/* 32 */                        byte b = bArr[str.charAt(i2)];
/* 34 */                        i2 += 2;
/* 44 */                        int i6 = bArr[str.charAt(i5)] | (b << 4);
/* 45 */                        if (i6 < 0) {
/* 55 */                            IioIoO10iOiI.I000OOo1O("invalid characters encountered in Hex string");
/* 5 */                             return null;
                                }
/* 48 */                        bArr2[i4] = (byte) i6;
                            }
/* 59 */                    return bArr2;
                        }
                    }
/* 68 */            I000II.I0010o("invalid offset and/or length specified");
/* 5 */             return null;
                }

                @Override
                public boolean I000oI1ioi(IIoIil iIoIil) {
/* 1 */             return true;
                }

                public void I00100l0(String str, CameraDevice.StateCallback stateCallback) {
/* 9 */             CameraManager cameraManager = (CameraManager) ((OOiO01IO) this.I00iiI).get();
                    try {
/* 32 */                Trace.beginSection(((Object) IIllI0o.I0000Il00O(str)) + "#openCamera");
/* 47 */                cameraManager.openCamera(str, (Executor) ((Oo10IliO00O) this.I00iiO).I000O01llI0.getValue(), stateCallback);
                    } finally {
/* 55 */                Trace.endSection();
                    }
                }

                public Il0IOIi I00100o1O0lo() throws FileNotFoundException {
/* 3 */             File file = (File) this.I00iiI;
/* 9 */             if (!file.exists()) {
/* 110 */               throw new FileNotFoundException("file doesn't exist: " + file.getName());
                    }
/* 13 */            FileInputStream fileInputStream = new FileInputStream(file);
/* 30 */            InputStream inputStreamI00000oIO = ((OlOiOooOO1) this.I00iiO).I00000oIO(fileInputStream, file.getName().getBytes(StandardCharsets.UTF_8));
/* 40 */            Il0IOIi il0IOIi = new Il0IOIi(fileInputStream.getFD());
/* 48 */            il0IOIi.I00iiI = new Object();
/* 50 */            il0IOIi.I00iOIl = inputStreamI00000oIO;
/* 52 */            VarHandle.storeStoreFence();
/* 55 */            return il0IOIi;
                }

                public Il0IOO011iI I0010I0i() throws IOException {
/* 3 */             File file = (File) this.I00iiI;
/* 9 */             if (file.exists()) {
/* 55 */                I000II.I00111O("output file already exists, please use a new file: ", file.getName());
/* 58 */                return null;
                    }
/* 13 */            FileOutputStream fileOutputStream = new FileOutputStream(file);
/* 30 */            OutputStream outputStreamI00000oOI = ((OlOiOooOO1) this.I00iiO).I00000oOI(fileOutputStream, file.getName().getBytes(StandardCharsets.UTF_8));
/* 40 */            Il0IOO011iI il0IOO011iI = new Il0IOO011iI(fileOutputStream.getFD());
/* 43 */            il0IOO011iI.I00iOIl = outputStreamI00000oOI;
/* 45 */            VarHandle.storeStoreFence();
/* 48 */            return il0IOO011iI;
                }

                public void I0010o(byte[] bArr) throws IOException {
/* 4 */             if (bArr.length < 18) {
/* 181 */               IioIoO10iOiI.I000OOo1O("PFB header missing");
/* 437 */               return;
                    }
/* 8 */             ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
/* 15 */            this.I00iiI = new byte[bArr.length - 18];
/* 20 */            this.I00iiO = new int[3];
/* 23 */            int i = 0;
/* 24 */            for (int i2 = 0; i2 < 3; i2++) {
/* 32 */                if (byteArrayInputStream.read() != 128) {
/* 175 */                   IioIoO10iOiI.I000OOo1O("Start marker missing");
/* 178 */                   return;
                        }
/* 42 */                if (byteArrayInputStream.read() != I00iio[i2]) {
/* 169 */                   IioIoO10iOiI.I000OOo1O("Incorrect record type");
/* 172 */                   return;
                        }
/* 68 */                int i3 = byteArrayInputStream.read() + (byteArrayInputStream.read() << 8) + (byteArrayInputStream.read() << 16) + (byteArrayInputStream.read() << 24);
/* 69 */                if (i3 < 0) {
/* 163 */                   IioIoO10iOiI.I000OOo1O(Oi010OO0.I000oI1ioi(i3, "PFB record size is negative: "));
/* 166 */                   return;
                        }
/* 75 */                ((int[]) this.I00iiO)[i2] = i3;
/* 79 */                byte[] bArr2 = (byte[]) this.I00iiI;
/* 82 */                if (i >= bArr2.length) {
/* 156 */                   throw new EOFException("attempted to read past EOF");
                        }
/* 86 */                if (i3 > bArr2.length - i) {
/* 110 */                   StringBuilder sbI0010I0i = IIl001iO0Io.I0010I0i("attempted to read ", i3, " bytes at position ", i, " into array of size ");
/* 119 */                   sbI0010I0i.append(((byte[]) this.I00iiI).length);
/* 124 */                   sbI0010I0i.append(", but only space for ");
/* 133 */                   sbI0010I0i.append(((byte[]) this.I00iiI).length - i);
/* 138 */                   sbI0010I0i.append(" bytes left");
/* 148 */                   throw new EOFException(sbI0010I0i.toString());
                        }
/* 88 */                int i4 = byteArrayInputStream.read(bArr2, i, i3);
/* 92 */                if (i4 < 0) {
/* 98 */                    I000II.I001i1O0Ol();
/* 101 */                   return;
                        }
/* 94 */                i += i4;
                    }
                }

                public void I00111O() throws IOException {
                    try {
/* 5 */                 ((FileLock) this.I00iiO).release();
/* 12 */                ((FileChannel) this.I00iiI).close();
                    } catch (IOException e) {
/* 21 */                Log.e("CrossProcessLock", "encountered error while releasing, ignoring", e);
                    }
                }

                @Override
                public boolean I001IIilI0O() {
/* 1 */             return true;
                }

                public void I001IO000() {
/* 3 */             OlIl0i olIl0i = (OlIl0i) this.I00iiI;
/* 5 */             I110ooool i110ooool = null;
/* 6 */             if (olIl0i != null) {
/* 8 */                 olIl0i.I000II(null);
                    }
/* 25 */            this.I00iiO = new I110IiI1I1(Ooo0ii.I00000oIO, Float.valueOf(0.0f), i110ooool, 60);
                }

                /* JADX WARN: Multi-variable type inference failed */
                public void I001i1O0Ol(float f, IiIooOOOI iiIooOOOI, Ii0110 ii0110) {
/* 9 */             if (f <= iiIooOOOI.I00i0ilIl0i(1.0f)) {
/* 11 */                return;
                    }
/* 12 */            Ol1il1o1 ol1il1o1I000OOo1O = iOl0lOIi11.I000OOo1O();
/* 16 */            IOoil1iiIilo iOoil1iiIilo = null;
/* 16 */            Object[] objArr = 0;
/* 24 */            Function1 function1I0000oI00 = ol1il1o1I000OOo1O != null ? ol1il1o1I000OOo1O.I0000oI00() : null;
/* 25 */            Ol1il1o1 ol1il1o1I000iOII = iOl0lOIi11.I000iOII(ol1il1o1I000OOo1O);
                    try {
/* 41 */                float fFloatValue = ((Number) ((I110IiI1I1) this.I00iiO).I00iiI.getValue()).floatValue();
/* 47 */                OlIl0i olIl0i = (OlIl0i) this.I00iiI;
/* 49 */                if (olIl0i != null) {
/* 51 */                    olIl0i.I000II(null);
                        }
/* 59 */                I110IiI1I1 i110IiI1I1 = (I110IiI1I1) this.I00iiO;
/* 63 */                if (i110IiI1I1.I00ilO0) {
/* 73 */                    this.I00iiO = iOO0I0.I00000oOI(i110IiI1I1, fFloatValue - f, 0.0f, 30);
                        } else {
/* 90 */                    this.I00iiO = new I110IiI1I1(Ooo0ii.I00000oIO, Float.valueOf(-f), objArr == true ? 1 : 0, 60);
                        }
/* 104 */               this.I00iiI = iOi1II01i0.I0000O(ii0110, null, null, new I0II0OiI(this, iOoil1iiIilo, 26), 3);
/* 106 */               iOl0lOIi11.I000oI1ioi(ol1il1o1I000OOo1O, ol1il1o1I000iOII, function1I0000oI00);
                    } catch (Throwable th) {
/* 110 */               iOl0lOIi11.I000oI1ioi(ol1il1o1I000OOo1O, ol1il1o1I000iOII, function1I0000oI00);
/* 408 */               throw th;
                    }
                }

                public void I001i1lo1io(Annotation annotation) {
/* 3 */             HashMap map = (HashMap) this.I00iiO;
/* 5 */             if (map == null) {
/* 9 */                 map = new HashMap();
/* 12 */                this.I00iiO = map;
                    }
/* 18 */            map.put(annotation.annotationType(), annotation);
                }

                public void I001iOo1i0O(int i, I1I1OO00o1o i1I1OO00o1o) {
/* 3 */             Iterator it = (Iterator) this.I00iiI;
                    while (true) {
/* 7 */                 Map.Entry entry = (Map.Entry) this.I00iiO;
/* 9 */                 if (entry == null || ((Io0010Ill) entry.getKey()).I00iOIl >= i) {
/* 332 */                   return;
                        }
/* 29 */                Io0010Ill io0010Ill = (Io0010Ill) ((Map.Entry) this.I00iiO).getKey();
/* 35 */                Object value = ((Map.Entry) this.I00iiO).getValue();
/* 39 */                IlIO0iI10oI ilIO0iI10oI = IlIO0iI10oI.I0000Il00O;
/* 41 */                i011io1o0i i011io1o0iVar = io0010Ill.I00iiI;
/* 43 */                int i2 = io0010Ill.I00iOIl;
/* 49 */                if (io0010Ill.I00iiO) {
/* 61 */                    for (Object obj : (List) value) {
/* 69 */                        if (i011io1o0iVar == i011io1o0i.I00ilI0I1) {
/* 73 */                            i1I1OO00o1o.I00IoIO0lI(i2, 3);
/* 76 */                            ((I01Ilioliio) obj).I0001Ioi1lo(i1I1OO00o1o);
/* 79 */                            i1I1OO00o1o.I00IoIO0lI(i2, 4);
                                } else {
/* 85 */                            i1I1OO00o1o.I00IoIO0lI(i2, i011io1o0iVar.I00iiI);
/* 88 */                            IlIO0iI10oI.I000iOII(i1I1OO00o1o, i011io1o0iVar, obj);
                                }
                            }
                        } else if (i011io1o0iVar == i011io1o0i.I00ilI0I1) {
/* 98 */                    i1I1OO00o1o.I00IoIO0lI(i2, 3);
/* 101 */                   ((I01Ilioliio) value).I0001Ioi1lo(i1I1OO00o1o);
/* 104 */                   i1I1OO00o1o.I00IoIO0lI(i2, 4);
                        } else {
/* 110 */                   i1I1OO00o1o.I00IoIO0lI(i2, i011io1o0iVar.I00iiI);
/* 113 */                   IlIO0iI10oI.I000iOII(i1I1OO00o1o, i011io1o0iVar, value);
                        }
/* 120 */               if (it.hasNext()) {
/* 128 */                   this.I00iiO = (Map.Entry) it.next();
                        } else {
/* 132 */                   this.I00iiO = null;
                        }
                    }
                }

                @Override
                public void I00II0oii1o(Throwable th) {
                    switch (this.I00iOIl) {
                        case 11:
/* 160 */                   int i = ((OlioOil) this.I00iiI).I0001Ioi1lo;
/* 164 */                   if (i != 2 || !(th instanceof CancellationException)) {
/* 190 */                       l11I11lO.I0001Ioi1lo("DualSurfaceProcessorNode", "Downstream node failed to provide Surface. Target: " + lOiio1iliO.I00000oIO(i), th);
                                break;
                            } else {
/* 170 */                       l11I11lO.I0000O(3, "DualSurfaceProcessorNode");
                                break;
                            }
                            break;
                        case PoseLandmark.RIGHT_ANKLE:
/* 122 */                   int i2 = ((OlioOil) this.I00iiI).I0001Ioi1lo;
/* 126 */                   if (i2 != 2 || !(th instanceof CancellationException)) {
/* 152 */                       l11I11lO.I0001Ioi1lo("SurfaceProcessorNode", "Downstream node failed to provide Surface. Target: " + lOiio1iliO.I00000oIO(i2), th);
                                break;
                            } else {
/* 132 */                       l11I11lO.I0000O(3, "SurfaceProcessorNode");
                                break;
                            }
                            break;
                        default:
/* 12 */                    Olo1I1 olo1I1 = (Olo1I1) this.I00iiO;
/* 16 */                    OlOO1i11110 olOO1i11110 = (OlOO1i11110) this.I00iiI;
/* 24 */                    if (!((Oi0Oi10I) olOO1i11110.I00iiO).I000II) {
/* 44 */                        Object obj = ((IIoo00iOol0) ((ArrayList) olOO1i11110.I00iiI).get(0)).I0000oI00.I00000oIO.get("CAPTURE_CONFIG_ID_KEY");
/* 54 */                        int iIntValue = obj == null ? -1 : ((Integer) obj).intValue();
/* 58 */                        boolean z = th instanceof Ioi1lIO;
/* 60 */                        I1ii1o0 i1ii1o0 = olo1I1.I00iiO;
/* 62 */                        if (z) {
/* 66 */                            I1lO01OlllO i1lO01OlllOI00000oIO = I1lO01OlllO.I00000oIO(iIntValue, (Ioi1lIO) th);
/* 70 */                            i1ii1o0.getClass();
/* 73 */                            lOllIO.I00000oIO();
/* 82 */                            ((I1ioOiOI) i1ii1o0.I00ilO0).I000iOII.accept(i1lO01OlllOI00000oIO);
                                } else {
/* 93 */                            I1lO01OlllO i1lO01OlllOI00000oIO2 = I1lO01OlllO.I00000oIO(iIntValue, new Ioi1lIO("Failed to submit capture request", th, 2));
/* 97 */                            i1ii1o0.getClass();
/* 100 */                           lOllIO.I00000oIO();
/* 109 */                           ((I1ioOiOI) i1ii1o0.I00ilO0).I000iOII.accept(i1lO01OlllOI00000oIO2);
                                }
/* 114 */                       olo1I1.I00iiI.I00OIl();
                                break;
                            }
                            break;
                    }
                }

                @Override
                public Oli1o0 apply() {
/* 7 */             return ((O0io0olo) this.I00iiI).I0000oI00(this.I00iiO);
                }

                @Override
                public void cancel() {
                    switch (this.I00iOIl) {
                        case 17:
                            break;
                        default:
/* 15 */                    if (!((I1Ooo1ii0l) this.I00iiO).compareAndSet(1, 1)) {
/* 21 */                        ((I0iI0O1IoIoI) this.I00iiI).invoke();
                                break;
                            }
                            break;
                    }
                }

                @Override
                public void onFailure(Exception exc) {
/* 5 */             ((Bitmap) this.I00iiI).recycle();
/* 14 */            ((OiIOol0) this.I00iiO).resumeWith(Boolean.FALSE);
                }

                public String toString() {
                    switch (this.I00iOIl) {
                        case PoseLandmark.LEFT_INDEX:
/* 15 */                    StringBuilder sb = new StringBuilder(32);
/* 22 */                    sb.append((String) this.I00iiI);
/* 27 */                    sb.append('{');
/* 36 */                    IoloOio0I ioloOio0I = (IoloOio0I) ((IoloOio0I) this.I00iiO).I00iiO;
/* 38 */                    String str = "";
/* 40 */                    while (ioloOio0I != null) {
/* 42 */                        Object obj = ioloOio0I.I00iiI;
/* 44 */                        sb.append(str);
/* 47 */                        if (obj == null || !obj.getClass().isArray()) {
/* 77 */                            sb.append(obj);
                                } else {
/* 63 */                            String strDeepToString = Arrays.deepToString(new Object[]{obj});
/* 73 */                            sb.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
                                }
/* 82 */                        ioloOio0I = (IoloOio0I) ioloOio0I.I00iiO;
/* 84 */                        str = ", ";
                            }
/* 89 */                    sb.append('}');
/* 92 */                    return sb.toString();
                        default:
/* 6 */                     return super.toString();
                    }
                }

/* 19 */        private final void I000l1() {
                }

                @Override
/* 19 */        public void I00000oIO() {
                }

                @Override
/* 28 */        public void I00000oOI(Object obj) {
                }

/* 36 */        public OlOO1i11110(int i, Object obj, Object obj2) {
/* 37 */            this.I00iOIl = i;
                    this.I00iiI = obj;
                    this.I00iiO = obj2;
                }

/* 37 */        public OlOO1i11110(int i) {
/* 38 */            this.I00iOIl = i;
                }

/* 38 */        public OlOO1i11110(IIoIi0iI iIoIi0iI) {
                    this.I00iOIl = 0;
/* 40 */            this.I00iiI = iIoIi0iI;
/* 41 */            this.I00iiO = null;
                }
            }
