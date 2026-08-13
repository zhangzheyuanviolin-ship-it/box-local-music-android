            package p000;

            import android.graphics.Matrix;
            import android.graphics.Rect;
            import android.util.Log;
            import android.util.Size;
            import androidx.camera.core.ImageProcessingUtil;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.io.EOFException;
            import java.io.IOException;
            import java.io.StringReader;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.HashMap;
            import java.util.Iterator;
            import java.util.LinkedHashMap;
            import java.util.List;
            import java.util.Locale;
            import java.util.Map;
            import java.util.Objects;
            import java.util.Set;
            import java.util.concurrent.ConcurrentHashMap;
            import java.util.concurrent.CopyOnWriteArrayList;
            import java.util.concurrent.Executor;
            import java.util.concurrent.ScheduledExecutorService;
            import java.util.concurrent.atomic.AtomicBoolean;
            
/* 75 */    public final class OoIlIoo1oiOo implements OIOiOoiIil1I {
                public static final String[] I00ll1 = {"INSERT", "UPDATE", "DELETE"};
                public final int I00iOIl;
                public boolean I00iiI;
                public Object I00iiO;
                public Object I00iio;
                public Object I00ilI0I1;
                public Object I00ilO0;
                public Object I00io1l;
                public Object I00ioIO;
                public Object I00l0I0l0lO1;
                public Object I00l0OO0IO;
                public Object I00li1OI;

                public OoIlIoo1oiOo() {
/* 2 */             this.I00iOIl = 1;
/* 4 */             Io11100li1 io11100li1 = Io11100li1.I000OiO;
/* 14 */            this.I00iiO = new ThreadLocal();
/* 21 */            this.I00iio = new ConcurrentHashMap();
/* 23 */            Il11i1 il11i1 = io11100li1.I00000oIO;
/* 29 */            new HashMap(io11100li1.I00000oOI);
/* 34 */            this.I00iiI = io11100li1.I0000oI00;
/* 38 */            this.I00ioIO = io11100li1.I0001Ioi1lo;
/* 46 */            this.I00l0I0l0lO1 = Io11100li1.I00000oIO(io11100li1.I0000Il00O);
/* 54 */            this.I00l0OO0IO = Io11100li1.I00000oIO(io11100li1.I0000O);
/* 62 */            this.I00li1OI = Io11100li1.I00000oIO(io11100li1.I000II);
/* 66 */            this.I00ilI0I1 = Io11100li1.I000O01llI0;
/* 70 */            this.I00ilO0 = Io11100li1.I000OOo1O;
/* 74 */            this.I00io1l = Io11100li1.I000iOII;
                }

                public static void I000O01llI0(OOIo1Iiiil oOIo1Iiiil, Ioi1lIO ioi1lIO) {
/* 1 */             ScheduledExecutorService scheduledExecutorServiceI0000O = O1OIIoio0i1.I0000O();
/* 9 */             Io11iII11ll io11iII11ll = new Io11iII11ll(13);
/* 12 */            io11iII11ll.I00iiI = oOIo1Iiiil;
/* 14 */            io11iII11ll.I00iiO = ioi1lIO;
/* 16 */            VarHandle.storeStoreFence();
/* 21 */            ((Io11oioo) scheduledExecutorServiceI0000O).execute(io11iII11ll);
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public Object I00000oIO(OO1lOI oO1lOI, IOoilo iOoilo) throws Throwable {
                    OoIilIIo ooIilIIo;
/* 3 */             if (iOoilo instanceof OoIilIIo) {
/* 6 */                 ooIilIIo = (OoIilIIo) iOoilo;
/* 8 */                 int i = ooIilIIo.I00iio;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    ooIilIIo.I00iio = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    ooIilIIo = new OoIilIIo(this, iOoilo);
                        }
                    }
/* 25 */            Object objI00000oIO = ooIilIIo.I00iiI;
/* 27 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 29 */            int i2 = ooIilIIo.I00iio;
/* 33 */            if (i2 == 0) {
/* 62 */                lIoii1l01l0i.I00000oOI(objI00000oIO);
/* 69 */                Oo011oIOO1 oo011oIOO1 = new Oo011oIOO1(20);
/* 72 */                ooIilIIo.I00iOIl = oO1lOI;
/* 74 */                ooIilIIo.I00iio = 1;
/* 78 */                objI00000oIO = oO1lOI.I00000oIO("SELECT * FROM room_table_modification_log WHERE invalidated = 1", oo011oIOO1, ooIilIIo);
/* 82 */                if (objI00000oIO != ii0111o) {
                        }
/* 108 */               return ii0111o;
                    }
/* 35 */            if (i2 != 1) {
/* 37 */                if (i2 != 2) {
/* 49 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 52 */                    return null;
                        }
/* 41 */                Set set = (Set) ooIilIIo.I00iOIl;
/* 43 */                lIoii1l01l0i.I00000oOI(objI00000oIO);
/* 46 */                return set;
                    }
/* 56 */            oO1lOI = (OO1lOI) ooIilIIo.I00iOIl;
/* 58 */            lIoii1l01l0i.I00000oOI(objI00000oIO);
/* 85 */            Set set2 = (Set) objI00000oIO;
/* 94 */            if (!set2.isEmpty()) {
/* 96 */                ooIilIIo.I00iOIl = set2;
/* 98 */                ooIilIIo.I00iio = 2;
/* 106 */               if (lOo0Ii0OOil.I00000oIO(oO1lOI, "UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1", ooIilIIo) == ii0111o) {
/* 108 */                   return ii0111o;
                        }
                    }
/* 332 */           return set2;
                }

                @Override
                public void I00000oOI(Executor executor, OIOiOllolii oIOiOllolii) {
                    List listUnmodifiableList;
                    Throwable th;
/* 1 */             executor.getClass();
/* 4 */             oIOiOllolii.getClass();
/* 16 */            ((CopyOnWriteArrayList) this.I00iio).add(new I00l0I0l0lO1(executor, oIOiOllolii));
                    synchronized (this.I00iiO) {
                        try {
/* 24 */                    if (!this.I00iiI && !((CopyOnWriteArrayList) this.I00iio).isEmpty()) {
/* 40 */                        Log.i("CameraPresenceSrc", "First observer added. Starting monitoring.");
/* 44 */                        this.I00iiI = true;
/* 46 */                        I000OiO();
                            }
/* 56 */                    listUnmodifiableList = Collections.unmodifiableList((List) this.I00ilI0I1);
/* 62 */                    th = (Throwable) this.I00ilO0;
                        } catch (Throwable th2) {
/* 106 */                   throw th2;
                        }
                    }
/* 67 */            I00l0I0l0lO1 i00l0I0l0lO1 = new I00l0I0l0lO1(executor, oIOiOllolii);
/* 73 */            I00ioIO i00ioIO = new I00ioIO(0);
/* 76 */            i00ioIO.I00iiI = th;
/* 78 */            i00ioIO.I00iiO = i00l0I0l0lO1;
/* 80 */            i00ioIO.I00iio = listUnmodifiableList;
/* 82 */            VarHandle.storeStoreFence();
/* 85 */            executor.execute(i00ioIO);
                }

                public Object I0000Il00O(String str, OoOilO ooOilO) {
                    Object objI00000oOI;
/* 8 */             O01loll1loll o01loll1loll = new O01loll1loll(new StringReader(str));
/* 12 */            o01loll1loll.I00oliIiO01i(2);
/* 19 */            int i = o01loll1loll.I00o0iI0io1;
/* 21 */            boolean z = true;
/* 22 */            if (i == 2) {
/* 24 */                o01loll1loll.I00o0iI0io1 = 1;
                    }
                    try {
                        try {
                            try {
/* 26 */                        o01loll1loll.peek();
/* 29 */                        z = false;
/* 30 */                        OoO00O1IiOl ooO00O1IiOlI0000O = I0000O(ooOilO);
/* 34 */                        Class cls = ooOilO.I00000oIO;
/* 36 */                        objI00000oOI = ooO00O1IiOlI0000O.I00000oOI(o01loll1loll);
/* 40 */                        Class clsI00000oIO = lIIIO1Oo.I00000oIO(cls);
/* 44 */                        if (objI00000oOI != null && !clsI00000oIO.isInstance(objI00000oOI)) {
/* 95 */                            throw new ClassCastException("Type adapter '" + ooO00O1IiOlI0000O + "' returned wrong type; requested " + cls + " but got instance of " + objI00000oOI.getClass() + "\nVerify that the adapter was registered for the correct type.");
                                }
                            } finally {
/* 190 */                       o01loll1loll.I00oliIiO01i(i);
                            }
                        } catch (IOException e) {
/* 137 */                   throw new O01Oo001(e);
                        } catch (IllegalStateException e2) {
/* 143 */                   throw new O01Oo001(e2);
                        }
                    } catch (EOFException e3) {
/* 144 */               if (!z) {
/* 189 */                   throw new O01Oo001(e3);
                        }
/* 146 */               o01loll1loll.I00oliIiO01i(i);
/* 149 */               objI00000oOI = null;
                    } catch (AssertionError e4) {
/* 131 */               throw new AssertionError("AssertionError (GSON 2.14.0): " + e4.getMessage(), e4);
                    }
/* 150 */           if (objI00000oOI != null) {
                        try {
/* 158 */                   if (o01loll1loll.peek() != 10) {
/* 168 */                       throw new O01Oo001("JSON document was not fully consumed.");
                            }
                        } catch (O1OIO1Ill0 e5) {
/* 182 */                   throw new O01Oo001(e5);
                        } catch (IOException e6) {
/* 175 */                   throw new O01Oo001(e6);
                        }
                    }
/* 183 */           return objI00000oOI;
                }

                public OoO00O1IiOl I0000O(OoOilO ooOilO) {
                    boolean z;
/* 3 */             ThreadLocal threadLocal = (ThreadLocal) this.I00iiO;
/* 7 */             ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.I00iio;
/* 13 */            OoO00O1IiOl ooO00O1IiOl = (OoO00O1IiOl) concurrentHashMap.get(ooOilO);
/* 15 */            if (ooO00O1IiOl != null) {
/* 17 */                return ooO00O1IiOl;
                    }
/* 22 */            Map map = (Map) threadLocal.get();
/* 24 */            if (map == null) {
/* 28 */                map = new HashMap();
/* 31 */                threadLocal.set(map);
/* 34 */                z = true;
                    } else {
/* 40 */                OoO00O1IiOl ooO00O1IiOl2 = (OoO00O1IiOl) map.get(ooOilO);
/* 42 */                if (ooO00O1IiOl2 != null) {
/* 44 */                    return ooO00O1IiOl2;
                        }
/* 45 */                z = false;
                    }
                    try {
/* 48 */                Io110l01i io110l01i = new Io110l01i();
/* 51 */                map.put(ooOilO, io110l01i);
/* 58 */                Iterator it = ((List) this.I00io1l).iterator();
/* 63 */                OoO00O1IiOl ooO00O1IiOlI00000oIO = null;
                        while (true) {
/* 68 */                    if (!it.hasNext()) {
                                break;
                            }
/* 76 */                    ooO00O1IiOlI00000oIO = ((OoO00iO0OOl0) it.next()).I00000oIO(this, ooOilO);
/* 80 */                    if (ooO00O1IiOlI00000oIO != null) {
/* 84 */                        if (io110l01i.I00000oIO != null) {
/* 101 */                           throw new AssertionError("Delegate is already set");
                                }
/* 86 */                        io110l01i.I00000oIO = ooO00O1IiOlI00000oIO;
/* 88 */                        map.put(ooOilO, ooO00O1IiOlI00000oIO);
                            }
                        }
/* 102 */               if (z) {
/* 104 */                   threadLocal.remove();
                        }
/* 107 */               if (ooO00O1IiOlI00000oIO == null) {
/* 117 */                   IioIoO10iOiI.I000OiO("GSON (2.14.0) cannot handle ", ooOilO);
/* 62 */                    return null;
                        }
/* 109 */               if (z) {
/* 111 */                   concurrentHashMap.putAll(map);
                        }
/* 114 */               return ooO00O1IiOlI00000oIO;
                    } catch (Throwable th) {
/* 121 */               if (z) {
/* 123 */                   threadLocal.remove();
                        }
/* 168 */               throw th;
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public Object I0000oI00(IOoilo iOoilo) throws Throwable {
                    OoIl0O1I1loI ooIl0O1I1loI;
                    IIlio101Io iIlio101Io;
                    Object value;
                    int[] iArr;
/* 3 */             Oi1oIiOiIi0 oi1oIiOiIi0 = (Oi1oIiOiIi0) this.I00iiO;
/* 7 */             if (iOoilo instanceof OoIl0O1I1loI) {
/* 10 */                ooIl0O1I1loI = (OoIl0O1I1loI) iOoilo;
/* 12 */                int i = ooIl0O1I1loI.I00iio;
/* 18 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 21 */                    ooIl0O1I1loI.I00iio = i - Integer.MIN_VALUE;
                        } else {
/* 26 */                    ooIl0O1I1loI = new OoIl0O1I1loI(this, iOoilo);
                        }
                    }
/* 29 */            Object obj = ooIl0O1I1loI.I00iiI;
/* 31 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 33 */            int i2 = ooIl0O1I1loI.I00iio;
/* 35 */            IOoil1iiIilo iOoil1iiIilo = null;
/* 37 */            int i3 = 1;
/* 38 */            if (i2 == 0) {
/* 57 */                lIoii1l01l0i.I00000oOI(obj);
/* 60 */                IIlio101Io iIlio101Io2 = oi1oIiOiIi0.I000II;
/* 62 */                boolean zI00O0o1oo = iIlio101Io2.I00O0o1oo();
/* 66 */                Il01llIol0 il01llIol0 = Il01llIol0.I00iOIl;
/* 68 */                if (!zI00O0o1oo) {
/* 437 */                   return il01llIol0;
                        }
                        try {
/* 78 */                    if (!((AtomicBoolean) this.I00l0OO0IO).compareAndSet(true, false)) {
/* 80 */                        iIlio101Io2.I010I0();
/* 83 */                        return il01llIol0;
                            }
/* 98 */                    if (!((Boolean) ((IllOOo00lI) this.I00li1OI).invoke()).booleanValue()) {
/* 100 */                       iIlio101Io2.I010I0();
/* 103 */                       return il01llIol0;
                            }
/* 106 */                   OoIl0Oi0O1 ooIl0Oi0O1 = new OoIl0Oi0O1(this, iOoil1iiIilo, i3);
/* 109 */                   ooIl0O1I1loI.I00iOIl = iIlio101Io2;
/* 111 */                   ooIl0O1I1loI.I00iio = 1;
/* 113 */                   Object objI00111O = oi1oIiOiIi0.I00111O(false, ooIl0Oi0O1, ooIl0O1I1loI);
/* 117 */                   if (objI00111O == ii0111o) {
/* 119 */                       return ii0111o;
                            }
/* 121 */                   iIlio101Io = iIlio101Io2;
/* 122 */                   obj = objI00111O;
                        } catch (Throwable th) {
/* 201 */                   th = th;
/* 202 */                   iIlio101Io = iIlio101Io2;
/* 203 */                   iIlio101Io.I010I0();
/* 206 */                   throw th;
                        }
                    } else {
/* 40 */                if (i2 != 1) {
/* 53 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 35 */                    return null;
                        }
/* 42 */                iIlio101Io = ooIl0O1I1loI.I00iOIl;
                        try {
/* 44 */                    lIoii1l01l0i.I00000oOI(obj);
                        } catch (Throwable th2) {
/* 48 */                    th = th2;
/* 203 */                   iIlio101Io.I010I0();
/* 206 */                   throw th;
                        }
                    }
/* 123 */           Set set = (Set) obj;
/* 132 */           if (!set.isEmpty()) {
/* 136 */               Ii1OIo10 ii1OIo10 = (Ii1OIo10) this.I00l0I0l0lO1;
/* 138 */               ii1OIo10.getClass();
/* 145 */               if (!set.isEmpty()) {
/* 148 */                   OlO0OIIl1 olO0OIIl1 = ii1OIo10.I00000oIO;
/* 188 */                   do {
/* 150 */                       value = olO0OIIl1.getValue();
/* 155 */                       int[] iArr2 = (int[]) value;
/* 157 */                       int length = iArr2.length;
/* 158 */                       iArr = new int[length];
/* 161 */                       for (int i4 = 0; i4 < length; i4++) {
/* 179 */                           iArr[i4] = set.contains(Integer.valueOf(i4)) ? iArr2[i4] + 1 : iArr2[i4];
                                }
/* 188 */                   } while (!olO0OIIl1.I000iOII(value, iArr));
                        }
/* 194 */               ((I00oII) this.I00ilO0).invoke(set);
                    }
/* 197 */           iIlio101Io.I010I0();
/* 200 */           return set;
                }

                public IoiO1IO1I1i I0001Ioi1lo(I1lIII10oIl i1lIII10oIl) throws Exception {
                    I1l1oO0OI1 i1l1oO0OI1I00Io1lO;
/* 1 */             OOIo1Iiiil oOIo1Iiiil = i1lIII10oIl.I00000oIO;
/* 3 */             int i = oOIo1Iiiil.I00000oIO;
/* 8 */             l11I11lO.I0000O(3, "ProcessingNode");
/* 19 */            I1l1oO0OI1 i1l1oO0OI1 = (I1l1oO0OI1) ((i1O01oOIoI0I) this.I00ilI0I1).apply(i1lIII10oIl);
/* 21 */            Object obj = i1l1oO0OI1.I00000oIO;
/* 27 */            ArrayList arrayList = ((I1lII0lO) this.I00iio).I0000O;
/* 35 */            lII1OI11o1I.I00000oOI(!arrayList.isEmpty());
/* 45 */            int iIntValue = ((Integer) arrayList.get(0)).intValue();
/* 49 */            int i2 = i1l1oO0OI1.I0000Il00O;
/* 53 */            if ((i2 == 35 || this.I00iiI) && iIntValue == 256) {
/* 65 */                iiOlilo0IIIl iiolilo0iiil = (iiOlilo0IIIl) this.I00ilO0;
/* 67 */                int i3 = oOIo1Iiiil.I0000oI00;
/* 71 */                I1l0iIlI10 i1l0iIlI10 = new I1l0iIlI10();
/* 74 */                i1l0iIlI10.I00000oIO = i1l1oO0OI1;
/* 76 */                i1l0iIlI10.I00000oOI = i3;
/* 78 */                VarHandle.storeStoreFence();
/* 81 */                iiolilo0iiil.getClass();
                        try {
/* 86 */                    if (i2 == 35) {
/* 126 */                       i1l1oO0OI1I00Io1lO = iiOlilo0IIIl.I00Io1lO(i1l0iIlI10);
                            } else {
/* 88 */                        if (i2 != 256 && i2 != 4101) {
/* 112 */                           throw new IllegalArgumentException("Unexpected format: " + i2);
                                }
/* 116 */                       i1l1oO0OI1I00Io1lO = iiolilo0iiil.I00IlilI0i0i(i1l0iIlI10, i2);
                            }
/* 122 */                   ((IoiO1IO1I1i) obj).close();
/* 131 */                   Size size = i1l1oO0OI1I00Io1lO.I0000O;
/* 137 */                   ((lolIo0) this.I00l0OO0IO).getClass();
/* 155 */                   OOlli1l1lOlI oOlli1l1lOlI = new OOlli1l1lOlI(ioOI11II.I00000oIO(size.getWidth(), size.getHeight(), Barcode.FORMAT_QR_CODE, 2));
/* 162 */                   IoiO1IO1I1i ioiO1IO1I1iI00000oOI = ImageProcessingUtil.I00000oOI(oOlli1l1lOlI, (byte[]) i1l1oO0OI1I00Io1lO.I00000oIO);
/* 166 */                   oOlli1l1lOlI.I000O01llI0();
/* 169 */                   Objects.requireNonNull(ioiO1IO1I1iI00000oOI);
/* 172 */                   Il1I0ll il1I0ll = i1l1oO0OI1I00Io1lO.I00000oOI;
/* 174 */                   Objects.requireNonNull(il1I0ll);
/* 177 */                   Rect rect = i1l1oO0OI1I00Io1lO.I0000oI00;
/* 179 */                   int i4 = i1l1oO0OI1I00Io1lO.I0001Ioi1lo;
/* 181 */                   Matrix matrix = i1l1oO0OI1I00Io1lO.I000II;
/* 183 */                   IIlI0I1li iIlI0I1li = i1l1oO0OI1I00Io1lO.I000O01llI0;
/* 188 */                   Ilioo0O0O ilioo0O0O = (Ilioo0O0O) ioiO1IO1I1iI00000oOI;
/* 198 */                   Size size2 = new Size(ilioo0O0O.I0001Ioi1lo(), ilioo0O0O.I0000O());
/* 201 */                   ilioo0O0O.getFormat();
/* 210 */                   i1l1oO0OI1 = new I1l1oO0OI1(ioiO1IO1I1iI00000oOI, il1I0ll, ilioo0O0O.getFormat(), size2, rect, i4, matrix, iIlI0I1li);
                        } catch (Throwable th) {
/* 217 */                   ((IoiO1IO1I1i) obj).close();
/* 220 */                   throw th;
                        }
                    }
/* 225 */           ((lolOiIoiillI) this.I00l0I0l0lO1).getClass();
/* 230 */           IoiO1IO1I1i ioiO1IO1I1i = (IoiO1IO1I1i) i1l1oO0OI1.I00000oIO;
/* 268 */           Oio0oi11l oio0oi11l = new Oio0oi11l(ioiO1IO1I1i, i1l1oO0OI1.I0000O, I1l0l0.I0001Ioi1lo(ioiO1IO1I1i.I00i0oil().I00000oOI(), ioiO1IO1I1i.I00i0oil().I0000oI00(), i1l1oO0OI1.I0001Ioi1lo, i1l1oO0OI1.I000II, ioiO1IO1I1i.I00i0oil().I0000O()));
/* 273 */           oio0oi11l.I0000Il00O(i1l1oO0OI1.I0000oI00);
/* 280 */           if (arrayList.size() > 1) {
/* 288 */               oOIo1Iiiil.I00000oOI.I00000oOI(oio0oi11l.getFormat());
                    }
/* 437 */           return oio0oi11l;
                }

                public void I000II(IllOOo00lI illOOo00lI, IllOOo00lI illOOo00lI2) {
/* 11 */            if (((AtomicBoolean) this.I00l0OO0IO).compareAndSet(false, true)) {
/* 13 */                illOOo00lI.invoke();
/* 20 */                IIOlO1ii iIOlO1ii = ((Oi1oIiOiIi0) this.I00iiO).I00000oIO;
/* 22 */                IOoil1iiIilo iOoil1iiIilo = null;
/* 23 */                if (iIOlO1ii != null) {
/* 40 */                    iOi1II01i0.I0000O(iIOlO1ii, new Ii00oll("Room Invalidation Tracker Refresh"), null, new Ol110ii1I(this, illOOo00lI2, iOoil1iiIilo, 9), 2);
                        } else {
/* 46 */                    O0000Ioio00.I000OOo1O("coroutineScope");
/* 49 */                    throw null;
                        }
                    }
                }

                @Override
                public void I000OOo1O(OIOiOllolii oIOiOllolii) {
                    I00l0I0l0lO1 i00l0I0l0lO1;
/* 1 */             oIOiOllolii.getClass();
/* 8 */             Iterator it = ((CopyOnWriteArrayList) this.I00iio).iterator();
                    while (true) {
/* 17 */                if (!it.hasNext()) {
/* 34 */                    i00l0I0l0lO1 = null;
                            break;
                        } else {
/* 23 */                    i00l0I0l0lO1 = (I00l0I0l0lO1) it.next();
/* 31 */                    if (i00l0I0l0lO1.I00000oOI.equals(oIOiOllolii)) {
                                break;
                            }
                        }
                    }
/* 35 */            if (i00l0I0l0lO1 != null) {
/* 41 */                ((CopyOnWriteArrayList) this.I00iio).remove(i00l0I0l0lO1);
                    }
                    synchronized (this.I00iiO) {
                        try {
/* 49 */                    if (this.I00iiI && ((CopyOnWriteArrayList) this.I00iio).isEmpty()) {
/* 65 */                        Log.i("CameraPresenceSrc", "Last observer removed. Stopping monitoring.");
/* 69 */                        this.I00iiI = false;
/* 75 */                        Log.i("PipePresenceSrc", "Stopping camera ID flow collection.");
/* 87 */                        if (((AtomicBoolean) this.I00l0OO0IO).compareAndSet(true, false)) {
/* 92 */                            OlIl0i olIl0i = (OlIl0i) this.I00l0I0l0lO1;
/* 94 */                            if (olIl0i != null) {
/* 96 */                                olIl0i.I000II(null);
                                    }
/* 99 */                            this.I00l0I0l0lO1 = null;
                                }
                            }
                        } finally {
                        }
                    }
                }

                public void I000OiO() {
/* 5 */             int i = 0;
/* 13 */            if (!((AtomicBoolean) this.I00l0OO0IO).compareAndSet(false, true)) {
/* 17 */                Log.i("PipePresenceSrc", "Monitoring is already active. Ignoring redundant start call.");
/* 20 */                return;
                    }
/* 23 */            Log.i("PipePresenceSrc", "Starting to collect camera ID flow.");
/* 28 */            OlIl0i olIl0i = (OlIl0i) this.I00l0I0l0lO1;
/* 30 */            IOoil1iiIilo iOoil1iiIilo = null;
/* 31 */            if (olIl0i != null) {
/* 33 */                olIl0i.I000II(null);
                    }
/* 38 */            OOo0l0ii10l oOo0l0ii10l = new OOo0l0ii10l();
/* 41 */            oOo0l0ii10l.I00iOIl = true;
/* 45 */            OOli00O001 oOli00O001 = (OOli00O001) this.I00io1l;
/* 49 */            int i2 = 2;
/* 50 */            Ii1Io1loiI ii1Io1loiI = new Ii1Io1loiI(i2);
/* 53 */            ii1Io1loiI.I00iiI = oOli00O001;
/* 55 */            VarHandle.storeStoreFence();
/* 60 */            OO11OilO oO11OilO = new OO11OilO(this, oOo0l0ii10l, iOoil1iiIilo, i);
/* 65 */            IlOlOlI0 ilOlOlI0 = new IlOlOlI0(i2);
/* 68 */            ilOlOlI0.I00iiI = ii1Io1loiI;
/* 70 */            ilOlOlI0.I00iiO = oO11OilO;
/* 72 */            VarHandle.storeStoreFence();
/* 100 */           this.I00l0I0l0lO1 = iOi1II01i0.I0000O((IIOlO1ii) this.I00ioIO, null, null, new I0II0OiI(ilOo1lI1o10.I00000oIO(ilOlOlI0, new Ii1iii100O1O(this, iOoil1iiIilo, 3)), iOoil1iiIilo, 17), 3);
                }

                /* JADX WARN: Code restructure failed: missing block: B:17:0x0075, code lost:
                
                    if (p000.lOo0Ii0OOil.I00000oIO(r1, r3, r4) == r5) goto L27;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:26:0x00d7, code lost:
                
                    if (p000.lOo0Ii0OOil.I00000oIO(r11, r3, r4) == r5) goto L27;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:27:0x00d9, code lost:
                
                    return r5;
                 */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:21:0x008b  */
                /* JADX WARN: Removed duplicated region for block: B:29:0x00df  */
                /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
                /* JADX WARN: Type inference failed for: r2v6, types: [OO1lOI] */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00d7 -> B:28:0x00da). Please report as a decompilation issue!!! */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public Object I000iOII(OO01Ol oO01Ol, int i, IOoilo iOoilo) throws Throwable {
                    OoIl11o ooIl11o;
                    int i2;
                    int i3;
                    String[] strArr;
                    OO1lOI oO1lOI;
                    int i4;
                    String str;
/* 3 */             OO01Ol oO01Ol2 = oO01Ol;
/* 5 */             int i5 = i;
/* 11 */            if (iOoilo instanceof OoIl11o) {
/* 14 */                ooIl11o = (OoIl11o) iOoilo;
/* 16 */                int i6 = ooIl11o.I00l0I0l0lO1;
/* 22 */                if ((i6 & Integer.MIN_VALUE) != 0) {
/* 25 */                    ooIl11o.I00l0I0l0lO1 = i6 - Integer.MIN_VALUE;
                        } else {
/* 30 */                    ooIl11o = new OoIl11o(this, iOoilo);
                        }
                    }
/* 33 */            Object obj = ooIl11o.I00io1l;
/* 35 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 37 */            int i7 = ooIl11o.I00l0I0l0lO1;
/* 40 */            boolean z = true;
/* 41 */            if (i7 == 0) {
/* 86 */                lIoii1l01l0i.I00000oOI(obj);
/* 104 */               String str2 = "INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i5 + ", 0)";
/* 108 */               ooIl11o.I00iOIl = oO01Ol2;
/* 110 */               ooIl11o.I00iio = i5;
/* 112 */               ooIl11o.I00l0I0l0lO1 = 1;
                    } else if (i7 == 1) {
/* 73 */                int i8 = ooIl11o.I00iio;
/* 75 */                ?? r2 = ooIl11o.I00iOIl;
/* 77 */                lIoii1l01l0i.I00000oOI(obj);
/* 82 */                i5 = i8;
/* 83 */                oO01Ol2 = r2;
                    } else {
/* 45 */                if (i7 != 2) {
/* 68 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 71 */                    return null;
                        }
/* 47 */                i4 = ooIl11o.I00ilO0;
/* 49 */                i3 = ooIl11o.I00ilI0I1;
/* 51 */                i2 = ooIl11o.I00iio;
/* 53 */                strArr = ooIl11o.I00iiO;
/* 55 */                str = ooIl11o.I00iiI;
/* 57 */                oO1lOI = ooIl11o.I00iOIl;
/* 59 */                lIoii1l01l0i.I00000oOI(obj);
/* 62 */                boolean z2 = true;
/* 219 */               i3++;
/* 221 */               z = z2;
/* 138 */               if (i3 < i4) {
/* 224 */                   return OoiIlOl1iI.I00000oIO;
                        }
/* 140 */               String str3 = strArr[i3];
/* 177 */               z2 = z;
/* 181 */               StringBuilder sbI00111O = IIl001iO0Io.I00111O("CREATE ", this.I00iiI ? "TEMP" : "", " TRIGGER IF NOT EXISTS `", "room_table_modification_trigger_" + str + '_' + str3, "` AFTER ");
/* 189 */               IIl001iO0Io.I001lIiIIo1O(sbI00111O, str3, " ON `", str, "` BEGIN UPDATE room_table_modification_log SET invalidated = 1 WHERE table_id = ");
/* 194 */               String strI000lI = IIl001iO0Io.I000lI(i2, " AND invalidated = 0; END", sbI00111O);
/* 198 */               ooIl11o.I00iOIl = oO1lOI;
/* 200 */               ooIl11o.I00iiI = str;
/* 202 */               ooIl11o.I00iiO = strArr;
/* 204 */               ooIl11o.I00iio = i2;
/* 206 */               ooIl11o.I00ilI0I1 = i3;
/* 208 */               ooIl11o.I00ilO0 = i4;
/* 210 */               ooIl11o.I00l0I0l0lO1 = 2;
                    }
/* 125 */           String str4 = ((String[]) this.I00io1l)[i5];
/* 132 */           i2 = i5;
/* 133 */           i3 = 0;
/* 127 */           strArr = I00ll1;
/* 135 */           oO1lOI = oO01Ol2;
/* 136 */           i4 = 3;
/* 137 */           str = str4;
/* 138 */           if (i3 < i4) {
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:16:0x0050  */
                /* JADX WARN: Removed duplicated region for block: B:20:0x0085  */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                /* JADX WARN: Type inference failed for: r4v4, types: [OO1lOI] */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0080 -> B:19:0x0083). Please report as a decompilation issue!!! */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public Object I000l1(OO01Ol oO01Ol, int i, IOoilo iOoilo) throws Throwable {
                    OoIl1oOo ooIl1oOo;
                    String str;
                    int i2;
                    OO01Ol oO01Ol2;
                    int i3;
                    String[] strArr;
/* 3 */             if (iOoilo instanceof OoIl1oOo) {
/* 6 */                 ooIl1oOo = (OoIl1oOo) iOoilo;
/* 8 */                 int i4 = ooIl1oOo.I00ioIO;
/* 14 */                if ((i4 & Integer.MIN_VALUE) != 0) {
/* 17 */                    ooIl1oOo.I00ioIO = i4 - Integer.MIN_VALUE;
                        } else {
/* 22 */                    ooIl1oOo = new OoIl1oOo(this, iOoilo);
                        }
                    }
/* 25 */            Object obj = ooIl1oOo.I00ilO0;
/* 27 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 29 */            int i5 = ooIl1oOo.I00ioIO;
/* 32 */            if (i5 == 0) {
/* 59 */                lIoii1l01l0i.I00000oOI(obj);
/* 66 */                str = ((String[]) this.I00io1l)[i];
/* 74 */                i2 = 3;
/* 76 */                oO01Ol2 = oO01Ol;
/* 77 */                i3 = 0;
/* 68 */                strArr = I00ll1;
/* 79 */                if (i3 < i2) {
                        }
                    } else {
/* 34 */                if (i5 != 1) {
/* 54 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 57 */                    return null;
                        }
/* 36 */                i2 = ooIl1oOo.I00ilI0I1;
/* 38 */                i3 = ooIl1oOo.I00iio;
/* 40 */                String[] strArr2 = ooIl1oOo.I00iiO;
/* 42 */                str = ooIl1oOo.I00iiI;
/* 44 */                ?? r4 = ooIl1oOo.I00iOIl;
/* 46 */                lIoii1l01l0i.I00000oOI(obj);
/* 49 */                strArr = strArr2;
/* 50 */                oO01Ol2 = r4;
/* 132 */               i3++;
/* 79 */                if (i3 < i2) {
/* 109 */                   String strI000iOII = IIl001iO0Io.I000iOII('`', "DROP TRIGGER IF EXISTS `", "room_table_modification_trigger_" + str + '_' + strArr[i3]);
/* 113 */                   ooIl1oOo.I00iOIl = oO01Ol2;
/* 115 */                   ooIl1oOo.I00iiI = str;
/* 117 */                   ooIl1oOo.I00iiO = strArr;
/* 119 */                   ooIl1oOo.I00iio = i3;
/* 121 */                   ooIl1oOo.I00ilI0I1 = i2;
/* 123 */                   ooIl1oOo.I00ioIO = 1;
/* 129 */                   if (lOo0Ii0OOil.I00000oIO(oO01Ol2, strI000iOII, ooIl1oOo) == ii0111o) {
/* 131 */                       return ii0111o;
                            }
/* 132 */                   i3++;
/* 79 */                    if (i3 < i2) {
/* 134 */                       return OoiIlOl1iI.I00000oIO;
                            }
                        }
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public Object I000lI(IOoilo iOoilo) throws Throwable {
                    OoIlI01li0 ooIlI01li0;
                    Throwable th;
                    IIlio101Io iIlio101Io;
/* 3 */             Oi1oIiOiIi0 oi1oIiOiIi0 = (Oi1oIiOiIi0) this.I00iiO;
/* 7 */             if (iOoilo instanceof OoIlI01li0) {
/* 10 */                ooIlI01li0 = (OoIlI01li0) iOoilo;
/* 12 */                int i = ooIlI01li0.I00iio;
/* 18 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 21 */                    ooIlI01li0.I00iio = i - Integer.MIN_VALUE;
                        } else {
/* 26 */                    ooIlI01li0 = new OoIlI01li0(this, iOoilo);
                        }
                    }
/* 29 */            Object obj = ooIlI01li0.I00iiI;
/* 31 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 33 */            int i2 = ooIlI01li0.I00iio;
/* 35 */            IOoil1iiIilo iOoil1iiIilo = null;
/* 37 */            if (i2 == 0) {
/* 55 */                lIoii1l01l0i.I00000oOI(obj);
/* 58 */                IIlio101Io iIlio101Io2 = oi1oIiOiIi0.I000II;
/* 64 */                if (iIlio101Io2.I00O0o1oo()) {
                            try {
/* 70 */                        OO11OilO oO11OilO = new OO11OilO(this, iOoil1iiIilo, 26);
/* 73 */                        ooIlI01li0.I00iOIl = iIlio101Io2;
/* 75 */                        ooIlI01li0.I00iio = 1;
/* 82 */                        if (oi1oIiOiIi0.I00111O(false, oO11OilO, ooIlI01li0) == ii0111o) {
/* 84 */                            return ii0111o;
                                }
/* 85 */                        iIlio101Io = iIlio101Io2;
/* 86 */                        iIlio101Io.I010I0();
                            } catch (Throwable th2) {
/* 92 */                        th = th2;
/* 93 */                        iIlio101Io = iIlio101Io2;
/* 94 */                        iIlio101Io.I010I0();
/* 97 */                        throw th;
                            }
                        }
                    } else {
/* 39 */                if (i2 != 1) {
/* 51 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 35 */                    return null;
                        }
/* 41 */                iIlio101Io = ooIlI01li0.I00iOIl;
                        try {
/* 43 */                    lIoii1l01l0i.I00000oOI(obj);
/* 86 */                    iIlio101Io.I010I0();
                        } catch (Throwable th3) {
/* 47 */                    th = th3;
/* 94 */                    iIlio101Io.I010I0();
/* 97 */                    throw th;
                        }
                    }
/* 98 */            return OoiIlOl1iI.I00000oIO;
                }

                public void I000o00OoI0I(ArrayList arrayList, Class cls, O01ooi1IIiiO o01ooi1IIiiO) {
/* 8 */             OoO00O1IiOl ooO00O1IiOlI0000O = I0000O(new OoOilO(cls));
/* 12 */            int i = o01ooi1IIiiO.I00ioIO;
/* 15 */            if (i == 2) {
/* 18 */                o01ooi1IIiiO.I00ioIO = 1;
                    }
/* 20 */            boolean z = o01ooi1IIiiO.I00l0I0l0lO1;
/* 22 */            boolean z2 = o01ooi1IIiiO.I00li1OI;
/* 26 */            o01ooi1IIiiO.I00l0I0l0lO1 = this.I00iiI;
/* 29 */            o01ooi1IIiiO.I00li1OI = false;
                    try {
                        try {
/* 31 */                    ooO00O1IiOlI0000O.I0000Il00O(o01ooi1IIiiO, arrayList);
                        } catch (IOException e) {
/* 73 */                    throw new O01Oo001(e);
                        } catch (AssertionError e2) {
/* 66 */                    throw new AssertionError("AssertionError (GSON 2.14.0): " + e2.getMessage(), e2);
                        }
                    } finally {
/* 74 */                o01ooi1IIiiO.I00Io1lO(i);
/* 77 */                o01ooi1IIiiO.I00l0I0l0lO1 = z;
/* 79 */                o01ooi1IIiiO.I00li1OI = z2;
                    }
                }

                public void I000oI1ioi(List list, Throwable th) {
                    boolean z;
                    int i;
                    List listUnmodifiableList;
                    Throwable th2;
                    synchronized (this.I00iiO) {
/* 4 */                 z = true;
/* 5 */                 i = 0;
                        try {
/* 6 */                     if (th != null) {
/* 12 */                        if (((Throwable) this.I00ilO0) != null && ((List) this.I00ilI0I1).isEmpty()) {
/* 25 */                            z = false;
                                }
/* 29 */                        this.I00ilO0 = th;
/* 31 */                        list = Collections.EMPTY_LIST;
/* 33 */                        this.I00ilI0I1 = list;
                            } else {
/* 36 */                        list.getClass();
/* 43 */                        if (((Throwable) this.I00ilO0) == null && ((List) this.I00ilI0I1).equals(list)) {
/* 56 */                            z = false;
                                }
/* 58 */                        this.I00ilO0 = null;
/* 60 */                        this.I00ilI0I1 = list;
                            }
/* 62 */                    listUnmodifiableList = Collections.unmodifiableList(list);
/* 68 */                    th2 = (Throwable) this.I00ilO0;
                        } catch (Throwable th3) {
/* 332 */                   throw th3;
                        }
                    }
/* 71 */            if (z) {
/* 77 */                ((CopyOnWriteArrayList) this.I00iio).size();
/* 84 */                Iterator it = ((CopyOnWriteArrayList) this.I00iio).iterator();
/* 92 */                while (it.hasNext()) {
/* 98 */                    I00l0I0l0lO1 i00l0I0l0lO1 = (I00l0I0l0lO1) it.next();
/* 100 */                   Executor executor = i00l0I0l0lO1.I00000oIO;
/* 104 */                   I00ioIO i00ioIO = new I00ioIO(i);
/* 107 */                   i00ioIO.I00iiI = th2;
/* 109 */                   i00ioIO.I00iiO = i00l0I0l0lO1;
/* 111 */                   i00ioIO.I00iio = listUnmodifiableList;
/* 113 */                   VarHandle.storeStoreFence();
/* 116 */                   executor.execute(i00ioIO);
                        }
                    }
                }

                public OIoi0IIoi I00100l0(String[] strArr) {
/* 3 */             Oilolol11I oilolol11I = new Oilolol11I();
/* 9 */             for (String str : strArr) {
/* 27 */                Set set = (Set) ((LinkedHashMap) this.I00iio).get(str.toLowerCase(Locale.ROOT));
/* 29 */                if (set != null) {
/* 33 */                    oilolol11I.addAll(set);
                        } else {
/* 37 */                    oilolol11I.add(str);
                        }
                    }
/* 53 */            String[] strArr2 = (String[]) Oio0lI.I00000oIO(oilolol11I).toArray(new String[0]);
/* 55 */            int length = strArr2.length;
/* 56 */            int[] iArr = new int[length];
/* 58 */            for (int i = 0; i < length; i++) {
/* 60 */                String str2 = strArr2[i];
/* 76 */                Integer num = (Integer) ((LinkedHashMap) this.I00ilI0I1).get(str2.toLowerCase(Locale.ROOT));
/* 78 */                if (num == null) {
/* 95 */                    I000II.I000iOII("There is no table with name ".concat(str2));
/* 98 */                    return null;
                        }
/* 84 */                iArr[i] = num.intValue();
                    }
/* 102 */           return new OIoi0IIoi(strArr2, iArr);
                }

                public String toString() {
                    switch (this.I00iOIl) {
                        case 1:
/* 42 */                    return "{serializeNulls:false,factories:" + ((List) this.I00io1l) + ",instanceCreators:" + ((IIlio101Io) this.I00ilI0I1) + "}";
                        default:
/* 6 */                     return super.toString();
                    }
                }

/* 76 */        public OoIlIoo1oiOo(int i) {
/* 77 */            this.I00iOIl = i;
                }
            }
