            package p000;

            import android.content.ComponentName;
            import android.content.Context;
            import android.graphics.Typeface;
            import android.os.Handler;
            import android.os.Looper;
            import android.os.Parcel;
            import android.os.RemoteException;
            import android.util.Log;
            import android.view.View;
            import android.view.ViewGroup;
            import androidx.camera.core.internal.compat.quirk.ImageCaptureFailedForSpecificCombinationQuirk;
            import androidx.camera.core.internal.compat.quirk.PreviewGreenTintQuirk;
            import com.google.firebase.components.ComponentRegistrar;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import com.google.mlkit.vision.pose.PoseLandmark;
            import java.io.OutputStream;
            import java.lang.invoke.VarHandle;
            import java.nio.ByteBuffer;
            import java.security.PrivateKey;
            import java.util.ArrayDeque;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.HashMap;
            import java.util.HashSet;
            import java.util.Iterator;
            import java.util.LinkedHashMap;
            import java.util.List;
            import java.util.Objects;
            import java.util.concurrent.Executor;
            import java.util.concurrent.atomic.AtomicReference;
            import java.util.concurrent.locks.ReentrantLock;
            
/* 223 */   public final class OillOo0 implements O0iI1olO0O, O0iI0IlO0iI, IIoi0lIOo, IOIO1OOOO0, OooI0100Oill, OloIli, i0Ii0I1ll, IIiOOIoi0 {
                public static OillOo0 I00ilO0;
                public static final Object I00io1l = new Object();
                public static volatile OillOo0 I00ioIO;
                public final int I00iOIl;
                public Object I00iiI;
                public Object I00iiO;
                public Object I00iio;
                public Object I00ilI0I1;

                public OillOo0(Typeface typeface, O1liIlo o1liIlo) {
                    int i;
                    int i2;
                    int i3;
                    int i4;
/* 3 */             this.I00iOIl = 10;
/* 8 */             this.I00ilI0I1 = typeface;
/* 10 */            this.I00iiI = o1liIlo;
/* 19 */            this.I00iio = new O1liIoooO(Barcode.FORMAT_UPC_E);
/* 22 */            int iI00000oIO = o1liIlo.I00000oIO(6);
/* 27 */            if (iI00000oIO != 0) {
/* 31 */                int i5 = iI00000oIO + o1liIlo.I00iOIl;
/* 45 */                i = ((ByteBuffer) o1liIlo.I00iiI).getInt(((ByteBuffer) o1liIlo.I00iiI).getInt(i5) + i5);
                    } else {
/* 50 */                i = 0;
                    }
/* 55 */            this.I00iiO = new char[i * 2];
/* 57 */            int iI00000oIO2 = o1liIlo.I00000oIO(6);
/* 61 */            if (iI00000oIO2 != 0) {
/* 65 */                int i6 = iI00000oIO2 + o1liIlo.I00iOIl;
/* 79 */                i2 = ((ByteBuffer) o1liIlo.I00iiI).getInt(((ByteBuffer) o1liIlo.I00iiI).getInt(i6) + i6);
                    } else {
/* 84 */                i2 = 0;
                    }
/* 86 */            for (int i7 = 0; i7 < i2; i7++) {
/* 90 */                OoOl1ol1l ooOl1ol1l = new OoOl1ol1l();
/* 93 */                ooOl1ol1l.I0000Il00O = 0;
/* 95 */                ooOl1ol1l.I00000oOI = this;
/* 97 */                ooOl1ol1l.I00000oIO = i7;
/* 99 */                VarHandle.storeStoreFence();
/* 102 */               O1liI1Ii o1liI1IiI00000oOI = ooOl1ol1l.I00000oOI();
/* 107 */               int iI00000oIO3 = o1liI1IiI00000oOI.I00000oIO(4);
/* 132 */               Character.toChars(iI00000oIO3 != 0 ? ((ByteBuffer) o1liI1IiI00000oOI.I00iiI).getInt(iI00000oIO3 + o1liI1IiI00000oOI.I00iOIl) : 0, (char[]) this.I00iiO, i7 * 2);
/* 135 */               O1liI1Ii o1liI1IiI00000oOI2 = ooOl1ol1l.I00000oOI();
/* 141 */               int iI00000oIO4 = o1liI1IiI00000oOI2.I00000oIO(16);
/* 145 */               if (iI00000oIO4 != 0) {
/* 149 */                   int i8 = iI00000oIO4 + o1liI1IiI00000oOI2.I00iOIl;
/* 163 */                   i3 = ((ByteBuffer) o1liI1IiI00000oOI2.I00iiI).getInt(((ByteBuffer) o1liI1IiI00000oOI2.I00iiI).getInt(i8) + i8);
                        } else {
/* 168 */                   i3 = 0;
                        }
/* 177 */               lII1OI11o1I.I00000oIO("invalid metadata codepoint length", i3 > 0);
/* 182 */               O1liIoooO o1liIoooO = (O1liIoooO) this.I00iio;
/* 184 */               O1liI1Ii o1liI1IiI00000oOI3 = ooOl1ol1l.I00000oOI();
/* 188 */               int iI00000oIO5 = o1liI1IiI00000oOI3.I00000oIO(16);
/* 192 */               if (iI00000oIO5 != 0) {
/* 196 */                   int i9 = iI00000oIO5 + o1liI1IiI00000oOI3.I00iOIl;
/* 210 */                   i4 = ((ByteBuffer) o1liI1IiI00000oOI3.I00iiI).getInt(((ByteBuffer) o1liI1IiI00000oOI3.I00iiI).getInt(i9) + i9);
                        } else {
/* 215 */                   i4 = 0;
                        }
/* 217 */               o1liIoooO.I00000oIO(ooOl1ol1l, 0, i4 - 1);
                    }
                }

                public static synchronized OillOo0 I000iOII() {
                    OillOo0 oillOo0;
/* 4 */             oillOo0 = I00ilO0;
/* 6 */             if (oillOo0 == null) {
/* 11 */                oillOo0 = new OillOo0(0);
/* 15 */                oillOo0.I00iiI = null;
/* 17 */                oillOo0.I00iiO = null;
/* 19 */                oillOo0.I00iio = null;
/* 26 */                oillOo0.I00ilI0I1 = new ArrayDeque();
/* 28 */                VarHandle.storeStoreFence();
/* 31 */                I00ilO0 = oillOo0;
                    }
/* 37 */            return oillOo0;
                }

                @Override
                public long I00000oOI(I110ooool i110ooool, I110ooool i110ooool2, I110ooool i110ooool3) {
/* 1 */             int iI00000oOI = i110ooool.I00000oOI();
/* 5 */             long jMax = 0;
/* 8 */             for (int i = 0; i < iI00000oOI; i++) {
/* 34 */                jMax = Math.max(jMax, ((I11101ii1) this.I00iiI).get(i).I0000Il00O(i110ooool.I00000oIO(i), i110ooool2.I00000oIO(i), i110ooool3.I00000oIO(i)));
                    }
/* 98 */            return jMax;
                }

                @Override
                public Object I0000Il00O() {
/* 5 */             Object objI0000Il00O = ((i0IOo0i0) this.I00iiI).I0000Il00O();
/* 19 */            i0IOo0i0 i0ioo0i0 = new i0IOo0i0(liIllOil01.I00000oIO((Oi00IilOloo0) this.I00iiO));
/* 26 */            Object objI0000Il00O2 = ((i0IOo0i0) this.I00iio).I0000Il00O();
/* 34 */            liIllOil01.I00000oIO((i0IOo0i0) this.I00ilI0I1);
/* 43 */            i0O1I1o i0o1i1o = new i0O1I1o();
/* 46 */            i0o1i1o.I00000oIO = (i0Il00O1) objI0000Il00O;
/* 48 */            i0o1i1o.I0000oI00 = i0ioo0i0;
/* 50 */            i0o1i1o.I00000oOI = (i0O0oOiO11) objI0000Il00O2;
/* 57 */            i0o1i1o.I0000Il00O = new HashMap();
/* 64 */            i0o1i1o.I0000O = new ReentrantLock();
/* 66 */            VarHandle.storeStoreFence();
/* 110 */           return i0o1i1o;
                }

                @Override
                public O0iI0IlO0iI I0000oI00(IOIOill iOIOill, OOo1Il01OliO oOo1Il01OliO) {
/* 13 */            return ((I0Oi111ii) ((OlOO1i11110) this.I00iio).I00iiI).I00IO1(iOIOill, oOo1Il01OliO, (ArrayList) this.I00iiO);
                }

                public void I0001Ioi1lo(IOiIi0Oi iOiIi0Oi) {
/* 5 */             ((ArrayList) this.I00iio).add(iOiIi0Oi);
                }

                public IOiOol0 I000II() {
/* 5 */             Executor executor = (Executor) this.I00iiI;
/* 9 */             ArrayList arrayList = (ArrayList) this.I00iiO;
/* 13 */            ArrayList arrayList2 = (ArrayList) this.I00iio;
/* 17 */            IOiOl1lII10i iOiOl1lII10i = (IOiOl1lII10i) this.I00ilI0I1;
/* 19 */            int i = 0;
/* 20 */            IOiOol0 iOiOol0 = new IOiOol0(i);
/* 28 */            iOiOol0.I00iiI = new HashMap();
/* 35 */            iOiOol0.I00iiO = new HashMap();
/* 42 */            iOiOol0.I00iio = new HashMap();
/* 49 */            iOiOol0.I00ilI0I1 = new HashSet();
/* 56 */            iOiOol0.I00io1l = new AtomicReference();
/* 60 */            Il10OII il10OII = new Il10OII();
/* 68 */            il10OII.I00000oIO = new HashMap();
/* 75 */            il10OII.I00000oOI = new ArrayDeque();
/* 77 */            il10OII.I0000Il00O = executor;
/* 79 */            VarHandle.storeStoreFence();
/* 82 */            iOiOol0.I00ilO0 = il10OII;
/* 84 */            iOiOol0.I00ioIO = iOiOl1lII10i;
/* 88 */            ArrayList arrayList3 = new ArrayList();
/* 105 */           arrayList3.add(IOiIi0Oi.I0000O(il10OII, Il10OII.class, OliIolIIi.class, OOiiOioO0.class));
/* 116 */           arrayList3.add(IOiIi0Oi.I0000O(iOiOol0, IOiOol0.class, new Class[0]));
/* 119 */           Iterator it = arrayList2.iterator();
/* 127 */           while (it.hasNext()) {
/* 133 */               IOiIi0Oi iOiIi0Oi = (IOiIi0Oi) it.next();
/* 135 */               if (iOiIi0Oi != null) {
/* 137 */                   arrayList3.add(iOiIi0Oi);
                        }
                    }
/* 143 */           ArrayList arrayList4 = new ArrayList();
/* 146 */           Iterator it2 = arrayList.iterator();
/* 154 */           while (it2.hasNext()) {
/* 160 */               arrayList4.add(it2.next());
                    }
/* 166 */           ArrayList arrayList5 = new ArrayList();
                    synchronized (iOiOol0) {
/* 170 */               Iterator it3 = arrayList4.iterator();
/* 178 */               while (it3.hasNext()) {
                            try {
/* 190 */                       ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((OOiO0Il) it3.next()).get();
/* 192 */                       if (componentRegistrar != null) {
/* 202 */                           arrayList3.addAll(((IOiOl1lII10i) iOiOol0.I00ioIO).I00000oIO(componentRegistrar));
/* 205 */                           it3.remove();
                                }
                            } catch (O001O000O01i e) {
/* 213 */                       it3.remove();
/* 220 */                       Log.w("ComponentDiscovery", "Invalid component registrar.", e);
                            }
                        }
/* 224 */               Iterator it4 = arrayList3.iterator();
/* 232 */               while (it4.hasNext()) {
/* 242 */                   Object[] array = ((IOiIi0Oi) it4.next()).I00000oOI.toArray();
/* 246 */                   int length = array.length;
/* 247 */                   int i2 = 0;
                            while (true) {
/* 248 */                       if (i2 < length) {
/* 250 */                           Object obj = array[i2];
/* 262 */                           if (obj.toString().contains("kotlinx.coroutines.CoroutineDispatcher")) {
/* 276 */                               if (((HashSet) iOiOol0.I00ilI0I1).contains(obj.toString())) {
/* 278 */                                   it4.remove();
                                            break;
                                        }
/* 290 */                               ((HashSet) iOiOol0.I00ilI0I1).add(obj.toString());
                                    }
/* 293 */                           i2++;
                                }
                            }
                        }
/* 304 */               if (((HashMap) iOiOol0.I00iiI).isEmpty()) {
/* 306 */                   il011100IO0o.I00000oIO(arrayList3);
                        } else {
/* 320 */                   ArrayList arrayList6 = new ArrayList(((HashMap) iOiOol0.I00iiI).keySet());
/* 323 */                   arrayList6.addAll(arrayList3);
/* 326 */                   il011100IO0o.I00000oIO(arrayList6);
                        }
/* 329 */               Iterator it5 = arrayList3.iterator();
/* 337 */               while (it5.hasNext()) {
/* 343 */                   IOiIi0Oi iOiIi0Oi2 = (IOiIi0Oi) it5.next();
/* 349 */                   IOiOoii0lI0I iOiOoii0lI0I = new IOiOoii0lI0I(i);
/* 352 */                   iOiOoii0lI0I.I00000oOI = iOiOol0;
/* 354 */                   iOiOoii0lI0I.I0000Il00O = iOiIi0Oi2;
/* 356 */                   VarHandle.storeStoreFence();
/* 366 */                   ((HashMap) iOiOol0.I00iiI).put(iOiIi0Oi2, new O0ioIo1O0lO(iOiOoii0lI0I));
                        }
/* 374 */               arrayList5.addAll(iOiOol0.I001lIiIIo1O(arrayList3));
/* 381 */               arrayList5.addAll(iOiOol0.I001lllioOl());
/* 384 */               iOiOol0.I001l0I00();
                    }
/* 388 */           Iterator it6 = arrayList5.iterator();
/* 396 */           while (it6.hasNext()) {
/* 404 */               ((Runnable) it6.next()).run();
                    }
/* 416 */           Boolean bool = (Boolean) ((AtomicReference) iOiOol0.I00io1l).get();
/* 418 */           if (bool != null) {
/* 428 */               iOiOol0.I000oI1ioi((HashMap) iOiOol0.I00iiI, bool.booleanValue());
                    }
/* 431 */           VarHandle.storeStoreFence();
/* 434 */           return iOiOol0;
                }

                public OiliIllol I000O01llI0() {
/* 3 */             OiliIllol oiliIllol = new OiliIllol();
/* 15 */            oiliIllol.I00000oIO = new HashMap((HashMap) this.I00iiI);
/* 26 */            oiliIllol.I00000oOI = new HashMap((HashMap) this.I00iiO);
/* 37 */            oiliIllol.I0000Il00O = new HashMap((HashMap) this.I00iio);
/* 48 */            oiliIllol.I0000O = new HashMap((HashMap) this.I00ilI0I1);
/* 50 */            VarHandle.storeStoreFence();
/* 55 */            return oiliIllol;
                }

                @Override
                public void I000OOo1O() {
                    switch (this.I00iOIl) {
                        case 2:
/* 42 */                    ArrayList arrayList = (ArrayList) this.I00iiO;
/* 48 */                    if (!arrayList.isEmpty()) {
/* 62 */                        ((HashMap) ((OlOO1i11110) this.I00iio).I00iiO).put((O1iioIi0010) this.I00iiI, arrayList);
                                break;
                            }
                            break;
                        default:
/* 10 */                    ((IOiOol0) this.I00iiO).I000OOo1O();
/* 36 */                    ((ArrayList) ((iOliil) this.I00iio).I00iiI).add(new I11IOOl1IolO((I111oOiIiO0) IOOi0Ool1i.I00OilO00Il((ArrayList) this.I00ilI0I1)));
                            break;
                    }
                }

                public void I000OiO(OO1Oooio101 oO1Oooio101, boolean z) {
/* 3 */             OO1ioi oO1ioi = (OO1ioi) this.I00ilI0I1;
/* 5 */             List list = oO1Oooio101.I00000oIO;
/* 8 */             List list2 = list;
/* 10 */            int size = list2.size();
/* 16 */            for (int i = 0; i < size; i++) {
/* 28 */                if (((OO1il00lI) list.get(i)).I0000Il00O()) {
/* 30 */                    I0010I0i(oO1Oooio101);
/* 33 */                    return;
                        }
                    }
/* 39 */            OIIlIII0Ili oIIlIII0Ili = (OIIlIII0Ili) this.I00iiI;
/* 41 */            if (oIIlIII0Ili == null) {
/* 107 */               I000II.I001IO000("layoutCoordinates not set");
/* 332 */               return;
                    }
/* 45 */            long jI00Iooi00oi = oIIlIII0Ili.I00Iooi00oi(0L);
/* 53 */            O1lIIi o1lIIi = new O1lIIi(18);
/* 56 */            o1lIIi.I00iiI = this;
/* 58 */            o1lIIi.I00iiO = oO1ioi;
/* 60 */            VarHandle.storeStoreFence();
/* 63 */            lI1lI10l.I00000oIO(oO1Oooio101, jI00Iooi00oi, o1lIIi, false);
/* 72 */            if (((OO1io1OOl) this.I00iiO) == OO1io1OOl.I00iiI) {
/* 74 */                if (z) {
/* 76 */                    int size2 = list2.size();
/* 80 */                    for (int i2 = 0; i2 < size2; i2++) {
/* 88 */                        ((OO1il00lI) list.get(i2)).I00000oIO();
                            }
                        }
/* 94 */                I0oO0iO1l0lo i0oO0iO1l0lo = oO1Oooio101.I00000oOI;
/* 96 */                if (i0oO0iO1l0lo != null) {
/* 102 */                   i0oO0iO1l0lo.I00iiI = !oO1ioi.I0000Il00O;
                        }
                    }
                }

                public boolean I000l1(Context context) {
/* 5 */             if (((Boolean) this.I00iio) == null) {
/* 22 */                this.I00iio = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
                    }
/* 32 */            if (!((Boolean) this.I00iiO).booleanValue()) {
/* 37 */                Log.isLoggable("FirebaseMessaging", 3);
                    }
/* 44 */            return ((Boolean) this.I00iio).booleanValue();
                }

                @Override
                public void I000lI(OI1Iio0ii1 oI1Iio0ii1, Object obj) {
/* 5 */             ((IOiOol0) this.I00iiI).I000lI(oI1Iio0ii1, obj);
                }

                public boolean I000o00OoI0I(Context context) {
/* 3 */             Boolean boolValueOf = (Boolean) this.I00iiO;
/* 5 */             if (boolValueOf == null) {
/* 18 */                boolValueOf = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
/* 22 */                this.I00iiO = boolValueOf;
                    }
/* 28 */            if (!boolValueOf.booleanValue()) {
/* 33 */                Log.isLoggable("FirebaseMessaging", 3);
                    }
/* 40 */            return ((Boolean) this.I00iiO).booleanValue();
                }

                @Override
                public I110ooool I000oI1ioi(long j, I110ooool i110ooool, I110ooool i110ooool2, I110ooool i110ooool3) {
/* 3 */             I110ooool i110oooolI0000Il00O = (I110ooool) this.I00iio;
/* 5 */             if (i110oooolI0000Il00O == null) {
/* 7 */                 i110oooolI0000Il00O = i110ooool3.I0000Il00O();
/* 11 */                this.I00iio = i110oooolI0000Il00O;
                    }
/* 13 */            int iI00000oOI = i110oooolI0000Il00O.I00000oOI();
/* 17 */            int i = 0;
                    while (true) {
/* 20 */                I110ooool i110ooool4 = (I110ooool) this.I00iio;
/* 25 */                if (i >= iI00000oOI) {
/* 65 */                    if (i110ooool4 != null) {
/* 67 */                        return i110ooool4;
                            }
/* 68 */                    O0000Ioio00.I000OOo1O("velocityVector");
/* 204 */                   throw null;
                        }
/* 27 */                if (i110ooool4 == null) {
/* 61 */                    O0000Ioio00.I000OOo1O("velocityVector");
/* 64 */                    throw null;
                        }
/* 49 */                long j2 = j;
/* 54 */                i110ooool4.I0000oI00(i, ((I11101ii1) this.I00iiI).get(i).I00000oOI(j2, i110ooool.I00000oIO(i), i110ooool2.I00000oIO(i), i110ooool3.I00000oIO(i)));
/* 57 */                i++;
/* 59 */                j = j2;
                    }
                }

                public IIoIi00lIii0 I00100l0(IIllOo0 iIllOo0, IIllOo0 iIllOo02, I0IiOl1oIloO i0IiOl1oIloO, I0IiOl1oIloO i0IiOl1oIloO2, IOlO11lll0l iOlO11lll0l, IOlO11lll0l iOlO11lll0l2) {
/* 5 */             IIlOO01iI iIlOO01iI = (IIlOO01iI) this.I00iiO;
/* 9 */             OlOO1i11110 olOO1i11110 = (OlOO1i11110) this.I00ilI0I1;
/* 13 */            OolO0o0O10I oolO0o0O10I = (OolO0o0O10I) this.I00iio;
/* 15 */            IIoIi00lIii0 iIoIi00lIii0 = new IIoIi00lIii0();
/* 23 */            iIoIi00lIii0.I00ilI0I1 = new ArrayList();
/* 30 */            iIoIi00lIii0.I00ilO0 = new ArrayList();
/* 34 */            iIoIi00lIii0.I00ioIO = Collections.EMPTY_LIST;
/* 38 */            iIoIi00lIii0.I00l0I0l0lO1 = I1lIoOIi.I000O01llI0;
/* 45 */            iIoIi00lIii0.I00li1OI = new Object();
/* 48 */            iIoIi00lIii0.I00ll1 = true;
/* 51 */            iIoIi00lIii0.I00lli11 = null;
/* 57 */            I1I0i0Ilo1Oi i1I0i0Ilo1Oi = new I1I0i0Ilo1Oi(27);
/* 70 */            i1I0i0Ilo1Oi.I00iiI = (ImageCaptureFailedForSpecificCombinationQuirk) IiOol00iooil.I00000oIO.I00000oOI(ImageCaptureFailedForSpecificCombinationQuirk.class);
/* 82 */            i1I0i0Ilo1Oi.I00iiO = (PreviewGreenTintQuirk) IiOol00iooil.I00000oIO.I00000oOI(PreviewGreenTintQuirk.class);
/* 84 */            VarHandle.storeStoreFence();
/* 87 */            iIoIi00lIii0.I00oI0i = i1I0i0Ilo1Oi;
/* 91 */            iIoIi00lIii0.I00l0OO0IO = i0IiOl1oIloO.I00iiO;
/* 98 */            iIoIi00lIii0.I00iOIl = new I0Iiil0(iIllOo0, i0IiOl1oIloO);
/* 100 */           if (iIllOo02 == null || i0IiOl1oIloO2 == null) {
/* 112 */               iIoIi00lIii0.I00iiI = null;
                    } else {
/* 109 */               iIoIi00lIii0.I00iiI = new I0Iiil0(iIllOo02, i0IiOl1oIloO2);
                    }
/* 114 */           iIoIi00lIii0.I00o0l1o1o0 = iOlO11lll0l;
/* 116 */           iIoIi00lIii0.I00o101lO = iOlO11lll0l2;
/* 118 */           iIoIi00lIii0.I00io1l = iIlOO01iI;
/* 120 */           iIoIi00lIii0.I00iiO = oolO0o0O10I;
/* 146 */           iIoIi00lIii0.I00iio = iOillilIolO.I00000oIO(i0IiOl1oIloO.I00iOIl.I0001Ioi1lo(), i0IiOl1oIloO2 != null ? i0IiOl1oIloO2.I00iOIl.I0001Ioi1lo() : null, ((IIlIoiO) i0IiOl1oIloO.I00iiO).I00iOIl);
/* 148 */           iIoIi00lIii0.I00oII = olOO1i11110;
/* 150 */           VarHandle.storeStoreFence();
/* 685 */           return iIoIi00lIii0;
                }

                public void I00100o1O0lo(O0OoII0ii1li o0OoII0ii1li, Enum r5) {
/* 3 */             O0Io0Io o0Io0Io = (O0Io0Io) this.I00iiI;
/* 17 */            IlO1Oi1 ilO1Oi1 = (IlO1Oi1) ((ArrayList) this.I00ilI0I1).get(r5.ordinal());
/* 25 */            int iIntValue = ((Number) o0Io0Io.get(o0OoII0ii1li)).intValue();
/* 34 */            int i = (1 << ilO1Oi1.I00000oOI) - 1;
/* 35 */            int i2 = ilO1Oi1.I00000oIO;
/* 48 */            o0Io0Io.I0010o(o0OoII0ii1li, Integer.valueOf((iIntValue & (~(i << i2))) + (ilO1Oi1.I0000Il00O << i2)));
                }

                public void I0010I0i(OO1Oooio101 oO1Oooio101) {
/* 7 */             if (((OO1io1OOl) this.I00iiO) == OO1io1OOl.I00iiI) {
/* 11 */                OIIlIII0Ili oIIlIII0Ili = (OIIlIII0Ili) this.I00iiI;
/* 13 */                if (oIIlIII0Ili == null) {
/* 43 */                    I000II.I001IO000("layoutCoordinates not set");
/* 46 */                    return;
                        }
/* 17 */                long jI00Iooi00oi = oIIlIII0Ili.I00Iooi00oi(0L);
/* 23 */                OO1ioi oO1ioi = (OO1ioi) this.I00ilI0I1;
/* 28 */                OIoO1Ol oIoO1Ol = new OIoO1Ol(2);
/* 31 */                oIoO1Ol.I00iiI = oO1ioi;
/* 33 */                VarHandle.storeStoreFence();
/* 37 */                lI1lI10l.I00000oIO(oO1Oooio101, jI00Iooi00oi, oIoO1Ol, true);
                    }
/* 49 */            this.I00iiO = OO1io1OOl.I00iiO;
                }

                public IOiOol0 I0010o(int i, IOIOill iOIOill, OOo1Il01OliO oOo1Il01OliO) {
/* 26 */            O1iioIi0010 o1iioIi0010 = new O1iioIi0010(((O1iioIi0010) this.I00iiI).I00000oIO + '@' + i);
/* 31 */            OlOO1i11110 olOO1i11110 = (OlOO1i11110) this.I00ilI0I1;
/* 35 */            HashMap map = (HashMap) olOO1i11110.I00iiO;
/* 41 */            List arrayList = (List) map.get(o1iioIi0010);
/* 43 */            if (arrayList == null) {
/* 47 */                arrayList = new ArrayList();
/* 50 */                map.put(o1iioIi0010, arrayList);
                    }
/* 57 */            return ((I0Oi111ii) olOO1i11110.I00iiI).I00IO1(iOIOill, oOo1Il01OliO, arrayList);
                }

                public iO0iIIoO11 I00111O(iO0iIIoO11 io0iiioo11) {
/* 5 */             return ((OoOlO1O0o) this.I00iiO).I000OiO(this, io0iiioo11);
                }

                public void I001IIilI0O(o0oooliI o0ooolii, Object obj, o1101OI1l o1101oi1l) {
/* 9 */             o11IoIoIOI0l o11ioioioi0l = (o11IoIoIOI0l) ((HashMap) this.I00iiI).get(o0ooolii);
/* 11 */            if (o11ioioioi0l != null) {
/* 13 */                o11ioioioi0l.I00000oIO(o0ooolii, obj, o1101oi1l);
                    } else {
/* 21 */                ((o11IoIoIOI0l) this.I00iio).I00000oIO(o0ooolii, obj, o1101oi1l);
                    }
                }

                @Override
                public void I001IO000(OI1Iio0ii1 oI1Iio0ii1, IOIOo1o iOIOo1o) {
/* 5 */             ((IOiOol0) this.I00iiI).I001IO000(oI1Iio0ii1, iOIOo1o);
                }

                public iO0iIIoO11 I001i1O0Ol(i1ollIol0I0 i1olliol0i0) {
/* 1 */             iO0iIIoO11 io0iiioo11I000OiO = iO0iIIoO11.I00Ol1ll1;
/* 3 */             Iterator itI000iOII = i1olliol0i0.I000iOII();
/* 11 */            while (itI000iOII.hasNext()) {
/* 31 */                io0iiioo11I000OiO = ((OoOlO1O0o) this.I00iiO).I000OiO(this, i1olliol0i0.I000o00OoI0I(((Integer) itI000iOII.next()).intValue()));
/* 37 */                if (io0iiioo11I000OiO instanceof iI1II1oO) {
                            break;
                        }
                    }
/* 77 */            return io0iiioo11I000OiO;
                }

                @Override
                public O0iI1ol I001i1lo1io(OI1Iio0ii1 oI1Iio0ii1) {
/* 5 */             return ((IOiOol0) this.I00iiI).I001i1lo1io(oI1Iio0ii1);
                }

                @Override
                public void I001iOo1i0O(OI1Iio0ii1 oI1Iio0ii1, IOIOill iOIOill, OI1Iio0ii1 oI1Iio0ii12) {
/* 5 */             ((IOiOol0) this.I00iiI).I001iOo1i0O(oI1Iio0ii1, iOIOill, oI1Iio0ii12);
                }

                public void I001l0I00(o0oooliI o0ooolii, Iterator it, o1101OI1l o1101oi1l) {
/* 9 */             o11O11o o11o11o = (o11O11o) ((HashMap) this.I00iiO).get(o0ooolii);
/* 11 */            if (o11o11o != null) {
/* 13 */                o11o11o.I00000oIO(o0ooolii, it, o1101oi1l);
/* 16 */                return;
                    }
/* 19 */            o11O11o o11o11o2 = (o11O11o) this.I00ilI0I1;
/* 21 */            if (o11o11o2 != null && !((HashMap) this.I00iiI).containsKey(o0ooolii)) {
/* 34 */                o11o11o2.I00000oIO(o0ooolii, it, o1101oi1l);
                    } else {
/* 42 */                while (it.hasNext()) {
/* 48 */                    I001IIilI0O(o0ooolii, it.next(), o1101oi1l);
                        }
                    }
                }

                @Override
                public IOIO1OO1l10l I001lIiIIo1O(IOIOill iOIOill) {
/* 9 */             OOOi0i1IOo oOOi0i1IOo = (OOOi0i1IOo) ((LinkedHashMap) this.I00ilI0I1).get(iOIOill);
/* 11 */            if (oOOi0i1IOo == null) {
/* 13 */                return null;
                    }
/* 35 */            return new IOIO1OO1l10l((OI1Ili10l0i) this.I00iiI, oOOi0i1IOo, (IIIOOI0O10I) this.I00iiO, (OlI1o0ooI) ((OoOi1I011O) this.I00iio).invoke(iOIOill));
                }

                public OillOo0 I001lloI() {
/* 7 */             return new OillOo0(this, (OoOlO1O0o) this.I00iiO);
                }

                public ArrayList I00II0Ol1O0l(OutputStream outputStream) {
                    llo0oI llo0oi;
/* 3 */             ArrayList arrayList = new ArrayList();
/* 6 */             arrayList.add(outputStream);
/* 11 */            ArrayList arrayList2 = (ArrayList) this.I00iio;
/* 18 */            if (!arrayList2.isEmpty()) {
/* 20 */                int i = llo0oI.I00iiI;
/* 24 */                ArrayList arrayList3 = new ArrayList();
/* 27 */                Iterator it = arrayList2.iterator();
/* 35 */                if (it.hasNext()) {
/* 65 */                    throw IIlIOloOOO.I000lI(it);
                        }
/* 41 */                if (arrayList3.isEmpty()) {
/* 54 */                    llo0oi = null;
                        } else {
/* 45 */                    llo0oi = new llo0oI(outputStream);
/* 48 */                    llo0oi.I00iOIl = arrayList3;
/* 50 */                    VarHandle.storeStoreFence();
                        }
/* 55 */                if (llo0oi != null) {
/* 57 */                    arrayList.add(llo0oi);
                        }
                    }
/* 70 */            Iterator it2 = ((IoillO0OOoo) this.I00iiO).iterator();
/* 78 */            if (!it2.hasNext()) {
/* 80 */                Collections.reverse(arrayList);
/* 83 */                return arrayList;
                    }
/* 88 */            if (it2.next() != null) {
/* 90 */                OIiilo1Ool0o.I00000oIO();
/* 17 */                return null;
                    }
/* 168 */           throw null;
                }

                public boolean I00II0oii1o(String str) {
/* 9 */             if (((HashMap) this.I00iio).containsKey(str)) {
/* 11 */                return true;
                    }
/* 15 */            OillOo0 oillOo0 = (OillOo0) this.I00iiI;
/* 17 */            if (oillOo0 != null) {
/* 19 */                return oillOo0.I00II0oii1o(str);
                    }
/* 24 */            return false;
                }

                @Override
                public O0iI0IlO0iI I00IO1(IOIOill iOIOill, OI1Iio0ii1 oI1Iio0ii1) {
/* 5 */             return ((IOiOol0) this.I00iiI).I00IO1(iOIOill, oI1Iio0ii1);
                }

                public void I00IO1oi11O(String str, iO0iIIoO11 io0iiioo11) {
                    OillOo0 oillOo0;
/* 3 */             HashMap map = (HashMap) this.I00iio;
/* 9 */             if (!map.containsKey(str) && (oillOo0 = (OillOo0) this.I00iiI) != null && oillOo0.I00II0oii1o(str)) {
/* 23 */                oillOo0.I00IO1oi11O(str, io0iiioo11);
                    } else {
/* 35 */                if (((HashMap) this.I00ilI0I1).containsKey(str)) {
/* 37 */                    return;
                        }
/* 38 */                if (io0iiioo11 == null) {
/* 40 */                    map.remove(str);
                        } else {
/* 44 */                    map.put(str, io0iiioo11);
                        }
                    }
                }

                public void I00IioO0OiOi(String str, iO0iIIoO11 io0iiioo11) {
/* 9 */             if (((HashMap) this.I00ilI0I1).containsKey(str)) {
/* 11 */                return;
                    }
/* 14 */            HashMap map = (HashMap) this.I00iio;
/* 16 */            if (io0iiioo11 == null) {
/* 18 */                map.remove(str);
                    } else {
/* 22 */                map.put(str, io0iiioo11);
                    }
                }

                public iO0iIIoO11 I00IlilI0i0i(String str) {
/* 3 */             HashMap map = (HashMap) this.I00iio;
/* 9 */             if (map.containsKey(str)) {
/* 15 */                return (iO0iIIoO11) map.get(str);
                    }
/* 20 */            OillOo0 oillOo0 = (OillOo0) this.I00iiI;
/* 22 */            if (oillOo0 != null) {
/* 24 */                return oillOo0.I00IlilI0i0i(str);
                    }
/* 35 */            I000II.I000iOII(Oi010OO0.I00111O(str, " is not defined"));
/* 38 */            return null;
                }

                @Override
                public I110ooool I00Io1lO(long j, I110ooool i110ooool, I110ooool i110ooool2, I110ooool i110ooool3) {
/* 3 */             I110ooool i110oooolI0000Il00O = (I110ooool) this.I00iiO;
/* 5 */             if (i110oooolI0000Il00O == null) {
/* 7 */                 i110oooolI0000Il00O = i110ooool.I0000Il00O();
/* 11 */                this.I00iiO = i110oooolI0000Il00O;
                    }
/* 13 */            int iI00000oOI = i110oooolI0000Il00O.I00000oOI();
/* 17 */            int i = 0;
                    while (true) {
/* 20 */                I110ooool i110ooool4 = (I110ooool) this.I00iiO;
/* 25 */                if (i >= iI00000oOI) {
/* 65 */                    if (i110ooool4 != null) {
/* 67 */                        return i110ooool4;
                            }
/* 68 */                    O0000Ioio00.I000OOo1O("valueVector");
/* 204 */                   throw null;
                        }
/* 27 */                if (i110ooool4 == null) {
/* 61 */                    O0000Ioio00.I000OOo1O("valueVector");
/* 64 */                    throw null;
                        }
/* 49 */                long j2 = j;
/* 54 */                i110ooool4.I0000oI00(i, ((I11101ii1) this.I00iiI).get(i).I0000oI00(j2, i110ooool.I00000oIO(i), i110ooool2.I00000oIO(i), i110ooool3.I00000oIO(i)));
/* 57 */                i++;
/* 59 */                j = j2;
                    }
                }

                @Override
                public I110ooool I00Io1o110i(I110ooool i110ooool, I110ooool i110ooool2, I110ooool i110ooool3) {
/* 3 */             I110ooool i110oooolI0000Il00O = (I110ooool) this.I00ilI0I1;
/* 5 */             if (i110oooolI0000Il00O == null) {
/* 7 */                 i110oooolI0000Il00O = i110ooool3.I0000Il00O();
/* 11 */                this.I00ilI0I1 = i110oooolI0000Il00O;
                    }
/* 13 */            int iI00000oOI = i110oooolI0000Il00O.I00000oOI();
/* 17 */            int i = 0;
                    while (true) {
/* 20 */                I110ooool i110ooool4 = (I110ooool) this.I00ilI0I1;
/* 25 */                if (i >= iI00000oOI) {
/* 63 */                    if (i110ooool4 != null) {
/* 65 */                        return i110ooool4;
                            }
/* 66 */                    O0000Ioio00.I000OOo1O("endVelocityVector");
/* 98 */                    throw null;
                        }
/* 27 */                if (i110ooool4 == null) {
/* 59 */                    O0000Ioio00.I000OOo1O("endVelocityVector");
/* 62 */                    throw null;
                        }
/* 53 */                i110ooool4.I0000oI00(i, ((I11101ii1) this.I00iiI).get(i).I0000O(i110ooool.I00000oIO(i), i110ooool2.I00000oIO(i), i110ooool3.I00000oIO(i)));
/* 56 */                i++;
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r3v21 */
                /* JADX WARN: Type inference failed for: r3v7 */
                @Override
                public Object attachCompleter(IIiOOI iIiOOI) {
                    iOli1OIoI0o ioli1oioi0o;
                    iOIoil ioioil;
                    IIiOOI iIiOOI2;
                    l0o1looii0Ol l0o1looii0ol;
                    int i;
                    switch (this.I00iOIl) {
                        case PoseLandmark.RIGHT_INDEX:
/* 186 */                   IIiOOI iIiOOI3 = iIiOOI;
/* 190 */                   il00iIOo1 il00iioo1 = (il00iIOo1) this.I00iiI;
/* 194 */                   iOoll1io1010 iooll1io1010 = (iOoll1io1010) this.I00iiO;
/* 198 */                   iOli1OIoI0o ioli1oioi0o2 = (iOli1OIoI0o) this.I00iio;
/* 202 */                   ii01iI1oI1l ii01ii1oi1l = (ii01iI1oI1l) this.I00ilI0I1;
/* 204 */                   ComponentName componentName = il00iIOo1.I00li1OI;
                            try {
/* 206 */                       l0IIO1Oi0lOi l0iio1oi0loi = iooll1io1010.I00000oIO;
/* 209 */                       io101O1Il io101o1il = (io101O1Il) l0iio1oi0loi;
/* 215 */                       Parcel parcelI00O0i0ii = io101o1il.I00O0i0ii(11, io101o1il.I00Iooi00oi());
/* 219 */                       int i2 = parcelI00O0i0ii.readInt();
/* 223 */                       parcelI00O0i0ii.recycle();
                                try {
/* 226 */                           if (i2 > 0) {
                                        try {
/* 228 */                                   il11il01o il11il01oVarI00000oIO = ioli1oioi0o2.I00000oIO();
/* 235 */                                   iOli1OIoI0o ioli1oioi0o3 = ioli1oioi0o2;
/* 237 */                                   iio1IIoOO iio1iiooo = new iio1IIoOO(il00iioo1, ii01ii1oi1l, ioli1oioi0o3, iIiOOI3, 0);
/* 240 */                                   io101O1Il io101o1il2 = (io101O1Il) l0iio1oi0loi;
/* 242 */                                   Parcel parcelI00Iooi00oi = io101o1il2.I00Iooi00oi();
/* 246 */                                   int i3 = iil0Ii00oOI1.I00000oIO;
/* 248 */                                   parcelI00Iooi00oi.writeInt(1);
/* 251 */                                   il11il01oVarI00000oIO.writeToParcel(parcelI00Iooi00oi, 0);
/* 254 */                                   parcelI00Iooi00oi.writeStrongBinder(iio1iiooo);
/* 257 */                                   Parcel parcelI00O0i0ii2 = io101o1il2.I00O0i0ii(12, parcelI00Iooi00oi);
/* 261 */                                   parcelI00O0i0ii2.readInt();
/* 264 */                                   parcelI00O0i0ii2.recycle();
                                            i2 = ioli1oioi0o3;
                                        } catch (RemoteException e) {
/* 273 */                                   e = e;
/* 274 */                                   ioli1oioi0o = ioli1oioi0o2;
/* 268 */                                   iIiOOI3 = iIiOOI;
/* 333 */                                   Log.e("il00iIOo1", "AiCore service failed to download feature ".concat(((ii00Il000) ioli1oioi0o).I00000oIO), e);
/* 349 */                                   iIiOOI3.I0000O(iOlI0O0iIiO.I00000oOI(6, "AICore service failed to download feature ".concat(((ii00Il000) ioli1oioi0o).I00000oIO), e));
/* 5 */                                     return "requestDownloadableFeatureFuture";
                                        }
                                    } else {
/* 277 */                               ioli1oioi0o = ioli1oioi0o2;
/* 281 */                               iIiOOI3 = iIiOOI;
                                        try {
/* 283 */                                   iio1IIoOO iio1iiooo2 = new iio1IIoOO(il00iioo1, ii01ii1oi1l, ioli1oioi0o, iIiOOI3, 1);
/* 286 */                                   il11il01o il11il01oVarI00000oIO2 = ioli1oioi0o.I00000oIO();
/* 290 */                                   io101O1Il io101o1il3 = (io101O1Il) l0iio1oi0loi;
/* 292 */                                   Parcel parcelI00Iooi00oi2 = io101o1il3.I00Iooi00oi();
/* 296 */                                   int i4 = iil0Ii00oOI1.I00000oIO;
/* 298 */                                   parcelI00Iooi00oi2.writeInt(1);
/* 301 */                                   il11il01oVarI00000oIO2.writeToParcel(parcelI00Iooi00oi2, 0);
/* 304 */                                   parcelI00Iooi00oi2.writeStrongBinder(iio1iiooo2);
/* 307 */                                   Parcel parcelI00O0i0ii3 = io101o1il3.I00O0i0ii(7, parcelI00Iooi00oi2);
/* 311 */                                   parcelI00O0i0ii3.readInt();
/* 314 */                                   parcelI00O0i0ii3.recycle();
                                            i2 = ioli1oioi0o;
                                        } catch (RemoteException e2) {
/* 318 */                                   e = e2;
/* 333 */                                   Log.e("il00iIOo1", "AiCore service failed to download feature ".concat(((ii00Il000) ioli1oioi0o).I00000oIO), e);
/* 349 */                                   iIiOOI3.I0000O(iOlI0O0iIiO.I00000oOI(6, "AICore service failed to download feature ".concat(((ii00Il000) ioli1oioi0o).I00000oIO), e));
/* 5 */                                     return "requestDownloadableFeatureFuture";
                                        }
                                    }
                                } catch (RemoteException e3) {
/* 271 */                           e = e3;
                                    ioli1oioi0o = i2;
                                }
                            } catch (RemoteException e4) {
/* 320 */                       e = e4;
/* 321 */                       ioli1oioi0o = ioli1oioi0o2;
                            }
                        default:
/* 24 */                    il1OOI0 il1ooi0 = (il1OOI0) this.I00iiI;
/* 28 */                    iOl1oo01Ii iol1oo01ii = (iOl1oo01Ii) this.I00iiO;
/* 32 */                    iOIoil ioioil2 = (iOIoil) this.I00iio;
/* 36 */                    iOlloil01Ilo iolloil01ilo = (iOlloil01Ilo) this.I00ilI0I1;
/* 38 */                    ComponentName componentName2 = il1OOI0.I00li1OI;
                            try {
/* 40 */                        l0o1looii0ol = iol1oo01ii.I00000oIO;
/* 43 */                        iolOiIoi ioloiioi = (iolOiIoi) l0o1looii0ol;
/* 49 */                        Parcel parcelI00O0i0ii4 = ioloiioi.I00O0i0ii(11, ioloiioi.I00Iooi00oi());
/* 53 */                        i = parcelI00O0i0ii4.readInt();
/* 57 */                        parcelI00O0i0ii4.recycle();
                            } catch (RemoteException e5) {
/* 109 */                       e = e5;
/* 110 */                       ioioil = ioioil2;
                            }
                            try {
/* 60 */                        if (i > 0) {
/* 62 */                            il1I1O il1i1oI00000oIO = ioioil2.I00000oIO();
/* 70 */                            iOIoil ioioil3 = ioioil2;
/* 73 */                            il0O1ooOo il0o1oooo = new il0O1ooOo(il1ooi0, iolloil01ilo, ioioil3, iIiOOI, 0);
/* 76 */                            iolOiIoi ioloiioi2 = (iolOiIoi) l0o1looii0ol;
/* 78 */                            Parcel parcelI00Iooi00oi3 = ioloiioi2.I00Iooi00oi();
/* 82 */                            int i5 = iil1ii1loOI1.I00000oIO;
/* 84 */                            parcelI00Iooi00oi3.writeInt(1);
/* 87 */                            il1i1oI00000oIO.writeToParcel(parcelI00Iooi00oi3, 0);
/* 90 */                            parcelI00Iooi00oi3.writeStrongBinder(il0o1oooo);
/* 93 */                            Parcel parcelI00O0i0ii5 = ioloiioi2.I00O0i0ii(12, parcelI00Iooi00oi3);
/* 97 */                            parcelI00O0i0ii5.readInt();
/* 100 */                           parcelI00O0i0ii5.recycle();
                                    i = ioioil3;
                                } else {
/* 113 */                           ioioil = ioioil2;
/* 117 */                           iIiOOI2 = iIiOOI;
                                    try {
/* 119 */                               il0O1ooOo il0o1oooo2 = new il0O1ooOo(il1ooi0, iolloil01ilo, ioioil, iIiOOI2, 1);
/* 122 */                               il1I1O il1i1oI00000oIO2 = ioioil.I00000oIO();
/* 126 */                               iolOiIoi ioloiioi3 = (iolOiIoi) l0o1looii0ol;
/* 128 */                               Parcel parcelI00Iooi00oi4 = ioloiioi3.I00Iooi00oi();
/* 132 */                               int i6 = iil1ii1loOI1.I00000oIO;
/* 134 */                               parcelI00Iooi00oi4.writeInt(1);
/* 137 */                               il1i1oI00000oIO2.writeToParcel(parcelI00Iooi00oi4, 0);
/* 140 */                               parcelI00Iooi00oi4.writeStrongBinder(il0o1oooo2);
/* 143 */                               Parcel parcelI00O0i0ii6 = ioloiioi3.I00O0i0ii(7, parcelI00Iooi00oi4);
/* 147 */                               parcelI00O0i0ii6.readInt();
/* 150 */                               parcelI00O0i0ii6.recycle();
                                        i = ioioil;
                                    } catch (RemoteException e6) {
/* 154 */                               e = e6;
/* 166 */                               Log.e("il1OOI0", "AiCore service failed to download feature ".concat(((iOli1OIiO1I0) ioioil).I00000oIO), e);
/* 182 */                               iIiOOI2.I0000O(iOIIOoOoii.I00000oOI(6, "AICore service failed to download feature ".concat(((iOli1OIiO1I0) ioioil).I00000oIO), e));
/* 5 */                                 return "requestDownloadableFeatureFuture";
                                    }
                                }
                            } catch (RemoteException e7) {
/* 107 */                       e = e7;
                                ioioil = i;
/* 104 */                       iIiOOI2 = iIiOOI;
/* 166 */                       Log.e("il1OOI0", "AiCore service failed to download feature ".concat(((iOli1OIiO1I0) ioioil).I00000oIO), e);
/* 182 */                       iIiOOI2.I0000O(iOIIOoOoii.I00000oOI(6, "AICore service failed to download feature ".concat(((iOli1OIiO1I0) ioioil).I00000oIO), e));
/* 5 */                         return "requestDownloadableFeatureFuture";
                            }
                    }
/* 5 */             return "requestDownloadableFeatureFuture";
                }

                @Override
                public void onCancel() {
/* 3 */             View view = (View) this.I00iiI;
/* 5 */             view.clearAnimation();
/* 12 */            ((ViewGroup) this.I00iiO).endViewTransition(view);
/* 19 */            ((IiI1Iii) this.I00iio).I0001Ioi1lo();
/* 27 */            if (Ill1OlOOl.I00IOO(2)) {
/* 33 */                Objects.toString((OlIIlIO1O) this.I00ilI0I1);
                    }
                }

/* 224 */       public OillOo0(Object obj, Object obj2, Object obj3, Object obj4, int i) {
/* 225 */           this.I00iOIl = i;
                    this.I00iiI = obj;
                    this.I00iiO = obj2;
                    this.I00iio = obj3;
                    this.I00ilI0I1 = obj4;
                }

/* 225 */       public OillOo0(PrivateKey privateKey) {
                    this.I00iOIl = 9;
/* 226 */           Il0o10 il0o10 = new Il0o10();
/* 227 */           this.I00iiO = il0o10;
                    this.I00iio = il0o10;
                    this.I00ilI0I1 = new HashMap();
                    HashSet hashSet = IIOo0iOIo.I00000oIO;
                    this.I00iiI = privateKey;
                }

/* 227 */       public OillOo0(OillOo0 oillOo0, OoOlO1O0o ooOlO1O0o) {
                    this.I00iOIl = 22;
                    this.I00iio = new HashMap();
/* 229 */           this.I00ilI0I1 = new HashMap();
                    this.I00iiI = oillOo0;
                    this.I00iiO = ooOlO1O0o;
                }

/* 229 */       public OillOo0(Executor executor) {
                    this.I00iOIl = 17;
/* 231 */           this.I00iio = new Handler(Looper.getMainLooper());
/* 233 */           Io1iO1Ooo0l io1iO1Ooo0l = new Io1iO1Ooo0l(2);
                    io1iO1Ooo0l.I00iiI = this;
/* 234 */           VarHandle.storeStoreFence();
                    this.I00ilI0I1 = io1iO1Ooo0l;
/* 236 */           OilOol oilOol = new OilOol(0);
/* 237 */           oilOol.I00iiI = executor;
/* 238 */           oilOol.I00iiO = new ArrayDeque();
/* 239 */           oilOol.I00ilI0I1 = new Object();
/* 240 */           VarHandle.storeStoreFence();
                    this.I00iiI = oilOol;
/* 241 */           this.I00iiO = ilIl1O1ii0Oo.I00000oIO(oilOol);
                }

/* 241 */       public OillOo0(OiliIllol oiliIllol) {
                    this.I00iOIl = 13;
/* 245 */           this.I00iiI = new HashMap(oiliIllol.I00000oIO);
/* 248 */           this.I00iiO = new HashMap(oiliIllol.I00000oOI);
/* 251 */           this.I00iio = new HashMap(oiliIllol.I0000Il00O);
/* 254 */           this.I00ilI0I1 = new HashMap(oiliIllol.I0000O);
                }

/* 254 */       public OillOo0(Oi00l1 oi00l1) {
                    i01IlOO i01iloo;
                    this.I00iOIl = 1;
                    synchronized (i01IlOO.I000o00OoI0I) {
                        try {
/* 257 */                   i01iloo = i01IlOO.I000l1;
                            if (i01iloo == null) {
/* 259 */                       i01iloo = i01IlOO.I000lI;
                            }
                        } finally {
                        }
                    }
                    if (i01iloo != null) {
/* 261 */               this.I00iiI = i01iloo.I00000oOI;
/* 263 */               this.I00iiO = i01iloo.I0000O;
                    } else {
/* 264 */               Context applicationContext = oi00l1.getApplicationContext();
/* 266 */               I0i0io0oOOi i0i0io0oOOi = new I0i0io0oOOi(2);
/* 268 */               i0i0io0oOOi.I00iiI = applicationContext.getPackageName();
/* 269 */               IOllii iOlliiI0000Il00O = i0i0io0oOOi.I0000Il00O();
                        this.I00iiI = iOlliiI0000Il00O;
/* 272 */               this.I00iiO = new OillOo0(iOlliiI0000Il00O.I0000Il00O);
                    }
                    int i = 14;
/* 275 */           this.I00iio = new looil0O1Io1(i);
/* 278 */           this.I00ilI0I1 = new lolOiIoiillI(i);
                }

/* 279 */       public OillOo0(int i) {
/* 280 */           this.I00iOIl = i;
                }

/* 280 */       public OillOo0(I11101ii1 i11101ii1) {
                    this.I00iOIl = 16;
/* 282 */           this.I00iiI = i11101ii1;
                }

/* 282 */       public OillOo0(IlOO1o00IOi ilOO1o00IOi) {
                    this.I00iOIl = 16;
/* 284 */           IIOOoll iIOOoll = new IIOOoll(28);
/* 285 */           iIOOoll.I00iiI = ilOO1o00IOi;
/* 286 */           VarHandle.storeStoreFence();
/* 287 */           this(iIOOoll);
                }
            }
