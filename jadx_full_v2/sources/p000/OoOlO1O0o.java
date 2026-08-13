            package p000;

            import android.os.Parcel;
            import android.os.RemoteException;
            import android.util.Log;
            import android.view.View;
            import android.view.Window;
            import android.view.WindowInsetsController;
            import com.google.mlkit.genai.common.GenAiException;
            import java.io.OutputStream;
            import java.lang.invoke.VarHandle;
            import java.nio.ByteBuffer;
            import java.nio.ByteOrder;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Collections;
            import java.util.HashMap;
            import java.util.Iterator;
            import java.util.TreeMap;
            
/* 14 */    public class OoOlO1O0o implements I0iiilOi, OOooilOIIl0I, iOiO11oOi1, ii0O1IOI, IIiOOIoi0, IOoillilli, OliiillO, o0lOOi0l1II {
                public final int I00iOIl;
                public Object I00iiI;
                public Object I00iiO;

                public OoOlO1O0o(Window window) {
/* 2 */             this.I00iOIl = 1;
/* 11 */            this.I00iiI = window.getInsetsController();
/* 13 */            this.I00iiO = window;
                }

                public static OoOlO1O0o I000l1(I1ii1o0 i1ii1o0) {
/* 4 */             OoOlO1O0o ooOlO1O0o = new OoOlO1O0o(4);
/* 14 */            ooOlO1O0o.I00iiO = new IIlOoolol0ll(18);
/* 16 */            ooOlO1O0o.I00iiI = i1ii1o0;
/* 18 */            i1O10l1io1iO.I000o00OoI0I();
/* 21 */            VarHandle.storeStoreFence();
/* 29 */            return ooOlO1O0o;
                }

                public void I00000oIO(int i, int i2, boolean z) {
/* 3 */             Window window = (Window) this.I00iiO;
/* 5 */             if (window == null) {
/* 38 */                WindowInsetsController windowInsetsController = (WindowInsetsController) this.I00iiI;
/* 40 */                if (z) {
/* 42 */                    windowInsetsController.setSystemBarsAppearance(i2, i2);
/* 45 */                    return;
                        } else {
/* 47 */                    windowInsetsController.setSystemBarsAppearance(0, i2);
/* 98 */                    return;
                        }
                    }
/* 7 */             if (z) {
/* 9 */                 View decorView = window.getDecorView();
/* 18 */                decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
                    } else {
/* 22 */                View decorView2 = window.getDecorView();
/* 32 */                decorView2.setSystemUiVisibility((~i) & decorView2.getSystemUiVisibility());
                    }
                }

                @Override
                public OillOo0 I00000oOI(iO0iIIoO11 io0iiioo11) {
/* 3 */             OillOo0 oillOo0 = (OillOo0) this.I00iiI;
/* 9 */             oillOo0.I00IioO0OiOi((String) this.I00iiO, io0iiioo11);
/* 29 */            return oillOo0;
                }

                public void I0000Il00O(boolean z) {
/* 3 */             I00000oIO(16, 16, z);
                }

                @Override
                public Object I0000O(OloIIoII1oo oloIIoII1oo) {
/* 5 */             boolean z = oloIIoII1oo.I0001Ioi1lo() instanceof OoiolI1Oll;
/* 9 */             lO1Iill100l1 lo1iill100l1 = (lO1Iill100l1) this.I00iiO;
/* 13 */            lI1i1OI1O0l li1i1oi1o0l = (lI1i1OI1O0l) this.I00iiI;
/* 15 */            if (z) {
/* 21 */                return li1i1oi1o0l.I0000Il00O(lo1iill100l1.I00111O());
                    }
/* 32 */            if (oloIIoII1oo.I0001Ioi1lo() instanceof I11OiOl) {
/* 38 */                I11OiOl i11OiOl = (I11OiOl) oloIIoII1oo.I0001Ioi1lo();
/* 40 */                i11OiOl.getClass();
/* 49 */                if (i11OiOl.I00iOIl.I00iOIl == 29514) {
/* 55 */                    return li1i1oi1o0l.I0000Il00O(lo1iill100l1.I00111O());
                        }
                    }
/* 77 */            return oloIIoII1oo;
                }

                public void I0000oI00(boolean z) {
/* 5 */             I00000oIO(8192, 8, z);
                }

                @Override
                public void I0001Ioi1lo(GenAiException genAiException) {
/* 3 */             iOiiOlio ioiiolio = (iOiiOlio) this.I00iiI;
/* 5 */             Object obj = this.I00iiO;
/* 7 */             ilOiOOII0I0 iloiooii0i0 = ioiiolio.I00iio;
/* 21 */            ioiiolio.I00iiO.I0001Ioi1lo(obj, iloiooii0i0 != null ? iloiooii0i0.I0001Ioi1lo : -1, genAiException.getErrorCode());
                }

                public void I000II(I0il01 i0il01) {
/* 9 */             i0OOI1OOo0 i0ooi1ooo0 = (i0OOI1OOo0) ((HashMap) this.I00iiO).get(i0il01);
/* 11 */            if (i0ooi1ooo0 != null) {
/* 15 */                i0OOOllloIII i0ooollloiii = (i0OOOllloIII) this.I00iiI;
/* 17 */                i0Iio1OiI i0iio1oii = i0ooollloiii.I0000Il00O;
                        synchronized (i0iio1oii) {
/* 27 */                    i0Iio1OiI.I0000Il00O.I0000O("unregisterListener", new Object[0]);
/* 32 */                    i0iio1oii.I00000oIO.remove(i0ooi1ooo0);
                        }
/* 36 */                i0Iii1o10 i0iii1o10 = i0ooollloiii.I00000oOI;
                        synchronized (i0iii1o10) {
/* 45 */                    i0iii1o10.I00000oIO.I0000O("unregisterListener", new Object[0]);
/* 50 */                    i0iii1o10.I0000O.remove(i0ooi1ooo0);
/* 53 */                    i0iii1o10.I00000oIO();
                        }
/* 61 */                ((HashMap) this.I00iiO).remove(i0il01);
                    }
                }

                public void I000O01llI0(ArrayList arrayList) {
/* 5 */             OutputStream outputStream = (OutputStream) l00lol.I00000oIO(arrayList);
/* 9 */             if (outputStream instanceof lo1OoIIlll) {
/* 13 */                this.I00iiO = (lo1OoIIlll) outputStream;
/* 22 */                this.I00iiI = (OutputStream) arrayList.get(0);
                    }
                }

                public void I000OOo1O(iOiO0lo ioio0lo) {
/* 3 */             Iterator it = ioio0lo.I00000oIO.iterator();
/* 11 */            while (it.hasNext()) {
/* 33 */                ((HashMap) this.I00iiI).put(Integer.valueOf(((ii1il1Il) it.next()).I00iOIl).toString(), ioio0lo);
                    }
                }

                public iO0iIIoO11 I000OiO(OillOo0 oillOo0, iO0iIIoO11 io0iiioo11) {
/* 1 */             ll00I0ii.I000iOII(oillOo0);
/* 6 */             if (!(io0iiioo11 instanceof iO11IOo0II)) {
/* 106 */               return io0iiioo11;
                    }
/* 8 */             iO11IOo0II io11ioo0ii = (iO11IOo0II) io0iiioo11;
/* 10 */            ArrayList arrayList = io11ioo0ii.I00iiI;
/* 12 */            String str = io11ioo0ii.I00iOIl;
/* 16 */            HashMap map = (HashMap) this.I00iiI;
/* 35 */            return (map.containsKey(str) ? (iOiO0lo) map.get(str) : (iOiO0lo) this.I00iiO).I00000oIO(str, oillOo0, arrayList);
                }

                public void I000iOII(OillOo0 oillOo0, OlilOlOiI olilOlOiI) {
/* 3 */             lIOllOo01oI liolloo01oi = new lIOllOo01oI();
/* 6 */             liolloo01oi.I00iiI = olilOlOiI;
/* 8 */             VarHandle.storeStoreFence();
/* 13 */            TreeMap treeMap = (TreeMap) this.I00iiI;
/* 27 */            for (Integer num : treeMap.keySet()) {
/* 39 */                i1IO0oi1I i1io0oi1iI00000oIO = ((i1IO0oi1I) olilOlOiI.I00iiO).clone();
/* 53 */                iO0iIIoO11 io0iiioo11I00000oIO = ((iIolollI1) treeMap.get(num)).I00000oIO(oillOo0, Collections.singletonList(liolloo01oi));
/* 75 */                int iI000II = io0iiioo11I00000oIO instanceof iII01l ? ll00I0ii.I000II(((iII01l) io0iiioo11I00000oIO).I00iOIl.doubleValue()) : -1;
/* 77 */                if (iI000II == 2 || iI000II == -1) {
/* 81 */                    olilOlOiI.I00iiO = i1io0oi1iI00000oIO;
                        }
                    }
/* 86 */            TreeMap treeMap2 = (TreeMap) this.I00iiO;
/* 92 */            Iterator it = treeMap2.keySet().iterator();
/* 100 */           while (it.hasNext()) {
/* 118 */               iO0iIIoO11 io0iiioo11I00000oIO2 = ((iIolollI1) treeMap2.get((Integer) it.next())).I00000oIO(oillOo0, Collections.singletonList(liolloo01oi));
/* 124 */               if (io0iiioo11I00000oIO2 instanceof iII01l) {
/* 134 */                   ll00I0ii.I000II(((iII01l) io0iiioo11I00000oIO2).I00iOIl.doubleValue());
                        }
                    }
                }

                @Override
                public void accept(Object obj, Object obj2) {
/* 12 */            i0i000l1o i0i000l1oVar = new i0i000l1o((i0i0iII) this.I00iiI, (OloIlI0ll) obj2, 0);
/* 19 */            i0OoOOOI00l i0oooooi00l = (i0OoOOOI00l) ((i0i0iOi) obj).I000l1();
/* 23 */            I11OiiIO i11OiiIO = (I11OiiIO) this.I00iiO;
/* 25 */            Parcel parcelI0000oI00 = i0oooooi00l.I0000oI00();
/* 29 */            int i = i0OlOO.I00000oIO;
/* 31 */            parcelI0000oI00.writeStrongBinder(i0i000l1oVar);
/* 34 */            i0OlOO.I00000oOI(parcelI0000oI00, i11OiiIO);
/* 38 */            i0oooooi00l.I00IoIO0lI(1, parcelI0000oI00);
                }

                @Override
                public Object attachCompleter(IIiOOI iIiOOI) {
/* 7 */             iiI11l01l iii11l01l = (iiI11l01l) this.I00iiI;
                    try {
/* 19 */                li0ioOOll li0iooollI0000Il00O = iiI11l01l.I0000Il00O(((il1iII1Oo) this.I00iiO).I00000oIO, new ii0o00I1l(iIiOOI));
/* 25 */                iiiOloI1iOl iiioloi1iol = new iiiOloI1iOl(0);
/* 28 */                iiioloi1iol.I00iiI = li0iooollI0000Il00O;
/* 30 */                VarHandle.storeStoreFence();
/* 35 */                iIiOOI.I00000oIO(iiioloi1iol, iii11l01l.I0000O);
/* 38 */                return "prepareInferenceEngineFuture";
                    } catch (RemoteException e) {
/* 58 */                iIiOOI.I0000O(iOIIOoOoii.I0000Il00O(6, e, "Failed to prepare inference engine"));
/* 61 */                return null;
                    } catch (RuntimeException e2) {
/* 49 */                iIiOOI.I0000O(iOIIOoOoii.I0000Il00O(0, e2, "Failed to prepare inference engine"));
/* 61 */                return null;
                    }
                }

                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                @Override
                public Object get() {
                    long unsignedInt;
                    char c;
                    long unsignedInt2;
                    long unsignedInt3;
                    long unsignedInt4;
                    long unsignedInt5;
                    long unsignedInt6;
                    long unsignedInt7;
/* 5 */             l1Il1IliOI1l l1il1ilioi1l = (l1Il1IliOI1l) this.I00iiI;
/* 9 */             String str = (String) this.I00iiO;
/* 11 */            int i = Io1IiOil.I00000oIO;
/* 13 */            int i2 = OI0io10l0.I00iOIl;
/* 17 */            OI0illOo0i oI0illOo0i = new OI0illOo0i();
/* 22 */            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(23);
/* 26 */            ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
/* 32 */            oI0illOo0i.I00000oIO = byteBufferAllocate.order(byteOrder);
/* 36 */            oI0illOo0i.I00000oOI = 16;
/* 38 */            oI0illOo0i.I0000Il00O = 16;
/* 40 */            long unsignedInt8 = 0;
/* 42 */            oI0illOo0i.I0000O = 0L;
/* 44 */            oI0illOo0i.I0000oI00 = 0L;
/* 47 */            oI0illOo0i.I0001Ioi1lo = 0;
/* 49 */            VarHandle.storeStoreFence();
/* 56 */            OI0illOo0i oI0illOo0iI0000Il00O = oI0illOo0i.I0000Il00O(str.getBytes());
/* 60 */            ByteBuffer byteBuffer = oI0illOo0iI0000Il00O.I00000oIO;
/* 62 */            byteBuffer.put((byte) 0);
/* 71 */            if (byteBuffer.remaining() < 8) {
/* 73 */                oI0illOo0iI0000Il00O.I00000oIO();
                    }
/* 82 */            OI0illOo0i oI0illOo0iI0000Il00O2 = oI0illOo0iI0000Il00O.I0000Il00O("".getBytes());
/* 86 */            oI0illOo0iI0000Il00O2.I00000oIO();
/* 89 */            ByteBuffer byteBuffer2 = oI0illOo0iI0000Il00O2.I00000oIO;
/* 91 */            byteBuffer2.flip();
/* 100 */           if (byteBuffer2.remaining() > 0) {
/* 109 */               oI0illOo0iI0000Il00O2.I0001Ioi1lo = byteBuffer2.remaining() + oI0illOo0iI0000Il00O2.I0001Ioi1lo;
                        switch (byteBuffer2.remaining()) {
                            case 1:
/* 327 */                       unsignedInt = 0;
/* 338 */                       unsignedInt7 = Byte.toUnsignedInt(byteBuffer2.get(0)) ^ unsignedInt;
/* 339 */                       unsignedInt8 = 0;
/* 362 */                       oI0illOo0iI0000Il00O2.I0000O = (Long.rotateLeft(unsignedInt7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ oI0illOo0iI0000Il00O2.I0000O;
/* 373 */                       oI0illOo0iI0000Il00O2.I0000oI00 = (Long.rotateLeft(unsignedInt8 * 5545529020109919103L, 33) * (-8663945395140668459L)) ^ oI0illOo0iI0000Il00O2.I0000oI00;
/* 379 */                       byteBuffer2.position(byteBuffer2.limit());
                                break;
                            case 2:
/* 309 */                       c = '\b';
/* 311 */                       unsignedInt2 = 0;
/* 325 */                       unsignedInt = unsignedInt2 ^ (Byte.toUnsignedInt(byteBuffer2.get(1)) << c);
/* 338 */                       unsignedInt7 = Byte.toUnsignedInt(byteBuffer2.get(0)) ^ unsignedInt;
/* 339 */                       unsignedInt8 = 0;
/* 362 */                       oI0illOo0iI0000Il00O2.I0000O = (Long.rotateLeft(unsignedInt7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ oI0illOo0iI0000Il00O2.I0000O;
/* 373 */                       oI0illOo0iI0000Il00O2.I0000oI00 = (Long.rotateLeft(unsignedInt8 * 5545529020109919103L, 33) * (-8663945395140668459L)) ^ oI0illOo0iI0000Il00O2.I0000oI00;
/* 379 */                       byteBuffer2.position(byteBuffer2.limit());
                                break;
                            case 3:
/* 292 */                       c = '\b';
/* 294 */                       unsignedInt3 = 0;
/* 307 */                       unsignedInt2 = unsignedInt3 ^ (Byte.toUnsignedInt(byteBuffer2.get(2)) << 16);
/* 325 */                       unsignedInt = unsignedInt2 ^ (Byte.toUnsignedInt(byteBuffer2.get(1)) << c);
/* 338 */                       unsignedInt7 = Byte.toUnsignedInt(byteBuffer2.get(0)) ^ unsignedInt;
/* 339 */                       unsignedInt8 = 0;
/* 362 */                       oI0illOo0iI0000Il00O2.I0000O = (Long.rotateLeft(unsignedInt7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ oI0illOo0iI0000Il00O2.I0000O;
/* 373 */                       oI0illOo0iI0000Il00O2.I0000oI00 = (Long.rotateLeft(unsignedInt8 * 5545529020109919103L, 33) * (-8663945395140668459L)) ^ oI0illOo0iI0000Il00O2.I0000oI00;
/* 379 */                       byteBuffer2.position(byteBuffer2.limit());
                                break;
                            case 4:
/* 275 */                       c = '\b';
/* 277 */                       unsignedInt4 = 0;
/* 290 */                       unsignedInt3 = unsignedInt4 ^ (Byte.toUnsignedInt(byteBuffer2.get(3)) << 24);
/* 307 */                       unsignedInt2 = unsignedInt3 ^ (Byte.toUnsignedInt(byteBuffer2.get(2)) << 16);
/* 325 */                       unsignedInt = unsignedInt2 ^ (Byte.toUnsignedInt(byteBuffer2.get(1)) << c);
/* 338 */                       unsignedInt7 = Byte.toUnsignedInt(byteBuffer2.get(0)) ^ unsignedInt;
/* 339 */                       unsignedInt8 = 0;
/* 362 */                       oI0illOo0iI0000Il00O2.I0000O = (Long.rotateLeft(unsignedInt7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ oI0illOo0iI0000Il00O2.I0000O;
/* 373 */                       oI0illOo0iI0000Il00O2.I0000oI00 = (Long.rotateLeft(unsignedInt8 * 5545529020109919103L, 33) * (-8663945395140668459L)) ^ oI0illOo0iI0000Il00O2.I0000oI00;
/* 379 */                       byteBuffer2.position(byteBuffer2.limit());
                                break;
                            case 5:
/* 258 */                       c = '\b';
/* 260 */                       unsignedInt5 = 0;
/* 273 */                       unsignedInt4 = unsignedInt5 ^ (Byte.toUnsignedInt(byteBuffer2.get(4)) << 32);
/* 290 */                       unsignedInt3 = unsignedInt4 ^ (Byte.toUnsignedInt(byteBuffer2.get(3)) << 24);
/* 307 */                       unsignedInt2 = unsignedInt3 ^ (Byte.toUnsignedInt(byteBuffer2.get(2)) << 16);
/* 325 */                       unsignedInt = unsignedInt2 ^ (Byte.toUnsignedInt(byteBuffer2.get(1)) << c);
/* 338 */                       unsignedInt7 = Byte.toUnsignedInt(byteBuffer2.get(0)) ^ unsignedInt;
/* 339 */                       unsignedInt8 = 0;
/* 362 */                       oI0illOo0iI0000Il00O2.I0000O = (Long.rotateLeft(unsignedInt7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ oI0illOo0iI0000Il00O2.I0000O;
/* 373 */                       oI0illOo0iI0000Il00O2.I0000oI00 = (Long.rotateLeft(unsignedInt8 * 5545529020109919103L, 33) * (-8663945395140668459L)) ^ oI0illOo0iI0000Il00O2.I0000oI00;
/* 379 */                       byteBuffer2.position(byteBuffer2.limit());
                                break;
                            case 6:
/* 241 */                       unsignedInt6 = 0;
/* 252 */                       c = '\b';
/* 256 */                       unsignedInt5 = unsignedInt6 ^ (Byte.toUnsignedInt(byteBuffer2.get(5)) << 40);
/* 273 */                       unsignedInt4 = unsignedInt5 ^ (Byte.toUnsignedInt(byteBuffer2.get(4)) << 32);
/* 290 */                       unsignedInt3 = unsignedInt4 ^ (Byte.toUnsignedInt(byteBuffer2.get(3)) << 24);
/* 307 */                       unsignedInt2 = unsignedInt3 ^ (Byte.toUnsignedInt(byteBuffer2.get(2)) << 16);
/* 325 */                       unsignedInt = unsignedInt2 ^ (Byte.toUnsignedInt(byteBuffer2.get(1)) << c);
/* 338 */                       unsignedInt7 = Byte.toUnsignedInt(byteBuffer2.get(0)) ^ unsignedInt;
/* 339 */                       unsignedInt8 = 0;
/* 362 */                       oI0illOo0iI0000Il00O2.I0000O = (Long.rotateLeft(unsignedInt7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ oI0illOo0iI0000Il00O2.I0000O;
/* 373 */                       oI0illOo0iI0000Il00O2.I0000oI00 = (Long.rotateLeft(unsignedInt8 * 5545529020109919103L, 33) * (-8663945395140668459L)) ^ oI0illOo0iI0000Il00O2.I0000oI00;
/* 379 */                       byteBuffer2.position(byteBuffer2.limit());
                                break;
                            case 7:
/* 239 */                       unsignedInt6 = Byte.toUnsignedInt(byteBuffer2.get(6)) << 48;
/* 252 */                       c = '\b';
/* 256 */                       unsignedInt5 = unsignedInt6 ^ (Byte.toUnsignedInt(byteBuffer2.get(5)) << 40);
/* 273 */                       unsignedInt4 = unsignedInt5 ^ (Byte.toUnsignedInt(byteBuffer2.get(4)) << 32);
/* 290 */                       unsignedInt3 = unsignedInt4 ^ (Byte.toUnsignedInt(byteBuffer2.get(3)) << 24);
/* 307 */                       unsignedInt2 = unsignedInt3 ^ (Byte.toUnsignedInt(byteBuffer2.get(2)) << 16);
/* 325 */                       unsignedInt = unsignedInt2 ^ (Byte.toUnsignedInt(byteBuffer2.get(1)) << c);
/* 338 */                       unsignedInt7 = Byte.toUnsignedInt(byteBuffer2.get(0)) ^ unsignedInt;
/* 339 */                       unsignedInt8 = 0;
/* 362 */                       oI0illOo0iI0000Il00O2.I0000O = (Long.rotateLeft(unsignedInt7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ oI0illOo0iI0000Il00O2.I0000O;
/* 373 */                       oI0illOo0iI0000Il00O2.I0000oI00 = (Long.rotateLeft(unsignedInt8 * 5545529020109919103L, 33) * (-8663945395140668459L)) ^ oI0illOo0iI0000Il00O2.I0000oI00;
/* 379 */                       byteBuffer2.position(byteBuffer2.limit());
                                break;
                            case 8:
/* 223 */                       unsignedInt7 = byteBuffer2.getLong();
/* 362 */                       oI0illOo0iI0000Il00O2.I0000O = (Long.rotateLeft(unsignedInt7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ oI0illOo0iI0000Il00O2.I0000O;
/* 373 */                       oI0illOo0iI0000Il00O2.I0000oI00 = (Long.rotateLeft(unsignedInt8 * 5545529020109919103L, 33) * (-8663945395140668459L)) ^ oI0illOo0iI0000Il00O2.I0000oI00;
/* 379 */                       byteBuffer2.position(byteBuffer2.limit());
                                break;
                            case 9:
/* 222 */                       unsignedInt8 ^= Byte.toUnsignedInt(byteBuffer2.get(8));
/* 223 */                       unsignedInt7 = byteBuffer2.getLong();
/* 362 */                       oI0illOo0iI0000Il00O2.I0000O = (Long.rotateLeft(unsignedInt7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ oI0illOo0iI0000Il00O2.I0000O;
/* 373 */                       oI0illOo0iI0000Il00O2.I0000oI00 = (Long.rotateLeft(unsignedInt8 * 5545529020109919103L, 33) * (-8663945395140668459L)) ^ oI0illOo0iI0000Il00O2.I0000oI00;
/* 379 */                       byteBuffer2.position(byteBuffer2.limit());
                                break;
                            case 10:
/* 212 */                       unsignedInt8 ^= Byte.toUnsignedInt(byteBuffer2.get(9)) << 8;
/* 222 */                       unsignedInt8 ^= Byte.toUnsignedInt(byteBuffer2.get(8));
/* 223 */                       unsignedInt7 = byteBuffer2.getLong();
/* 362 */                       oI0illOo0iI0000Il00O2.I0000O = (Long.rotateLeft(unsignedInt7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ oI0illOo0iI0000Il00O2.I0000O;
/* 373 */                       oI0illOo0iI0000Il00O2.I0000oI00 = (Long.rotateLeft(unsignedInt8 * 5545529020109919103L, 33) * (-8663945395140668459L)) ^ oI0illOo0iI0000Il00O2.I0000oI00;
/* 379 */                       byteBuffer2.position(byteBuffer2.limit());
                                break;
                            case 11:
/* 199 */                       unsignedInt8 ^= Byte.toUnsignedInt(byteBuffer2.get(10)) << 16;
/* 212 */                       unsignedInt8 ^= Byte.toUnsignedInt(byteBuffer2.get(9)) << 8;
/* 222 */                       unsignedInt8 ^= Byte.toUnsignedInt(byteBuffer2.get(8));
/* 223 */                       unsignedInt7 = byteBuffer2.getLong();
/* 362 */                       oI0illOo0iI0000Il00O2.I0000O = (Long.rotateLeft(unsignedInt7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ oI0illOo0iI0000Il00O2.I0000O;
/* 373 */                       oI0illOo0iI0000Il00O2.I0000oI00 = (Long.rotateLeft(unsignedInt8 * 5545529020109919103L, 33) * (-8663945395140668459L)) ^ oI0illOo0iI0000Il00O2.I0000oI00;
/* 379 */                       byteBuffer2.position(byteBuffer2.limit());
                                break;
                            case 12:
/* 186 */                       unsignedInt8 ^= Byte.toUnsignedInt(byteBuffer2.get(11)) << 24;
/* 199 */                       unsignedInt8 ^= Byte.toUnsignedInt(byteBuffer2.get(10)) << 16;
/* 212 */                       unsignedInt8 ^= Byte.toUnsignedInt(byteBuffer2.get(9)) << 8;
/* 222 */                       unsignedInt8 ^= Byte.toUnsignedInt(byteBuffer2.get(8));
/* 223 */                       unsignedInt7 = byteBuffer2.getLong();
/* 362 */                       oI0illOo0iI0000Il00O2.I0000O = (Long.rotateLeft(unsignedInt7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ oI0illOo0iI0000Il00O2.I0000O;
/* 373 */                       oI0illOo0iI0000Il00O2.I0000oI00 = (Long.rotateLeft(unsignedInt8 * 5545529020109919103L, 33) * (-8663945395140668459L)) ^ oI0illOo0iI0000Il00O2.I0000oI00;
/* 379 */                       byteBuffer2.position(byteBuffer2.limit());
                                break;
                            case 13:
/* 172 */                       unsignedInt8 ^= Byte.toUnsignedInt(byteBuffer2.get(12)) << 32;
/* 186 */                       unsignedInt8 ^= Byte.toUnsignedInt(byteBuffer2.get(11)) << 24;
/* 199 */                       unsignedInt8 ^= Byte.toUnsignedInt(byteBuffer2.get(10)) << 16;
/* 212 */                       unsignedInt8 ^= Byte.toUnsignedInt(byteBuffer2.get(9)) << 8;
/* 222 */                       unsignedInt8 ^= Byte.toUnsignedInt(byteBuffer2.get(8));
/* 223 */                       unsignedInt7 = byteBuffer2.getLong();
/* 362 */                       oI0illOo0iI0000Il00O2.I0000O = (Long.rotateLeft(unsignedInt7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ oI0illOo0iI0000Il00O2.I0000O;
/* 373 */                       oI0illOo0iI0000Il00O2.I0000oI00 = (Long.rotateLeft(unsignedInt8 * 5545529020109919103L, 33) * (-8663945395140668459L)) ^ oI0illOo0iI0000Il00O2.I0000oI00;
/* 379 */                       byteBuffer2.position(byteBuffer2.limit());
                                break;
                            case 14:
/* 158 */                       unsignedInt8 ^= Byte.toUnsignedInt(byteBuffer2.get(13)) << 40;
/* 172 */                       unsignedInt8 ^= Byte.toUnsignedInt(byteBuffer2.get(12)) << 32;
/* 186 */                       unsignedInt8 ^= Byte.toUnsignedInt(byteBuffer2.get(11)) << 24;
/* 199 */                       unsignedInt8 ^= Byte.toUnsignedInt(byteBuffer2.get(10)) << 16;
/* 212 */                       unsignedInt8 ^= Byte.toUnsignedInt(byteBuffer2.get(9)) << 8;
/* 222 */                       unsignedInt8 ^= Byte.toUnsignedInt(byteBuffer2.get(8));
/* 223 */                       unsignedInt7 = byteBuffer2.getLong();
/* 362 */                       oI0illOo0iI0000Il00O2.I0000O = (Long.rotateLeft(unsignedInt7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ oI0illOo0iI0000Il00O2.I0000O;
/* 373 */                       oI0illOo0iI0000Il00O2.I0000oI00 = (Long.rotateLeft(unsignedInt8 * 5545529020109919103L, 33) * (-8663945395140668459L)) ^ oI0illOo0iI0000Il00O2.I0000oI00;
/* 379 */                       byteBuffer2.position(byteBuffer2.limit());
                                break;
                            case 15:
/* 144 */                       unsignedInt8 = Byte.toUnsignedInt(byteBuffer2.get(14)) << 48;
/* 158 */                       unsignedInt8 ^= Byte.toUnsignedInt(byteBuffer2.get(13)) << 40;
/* 172 */                       unsignedInt8 ^= Byte.toUnsignedInt(byteBuffer2.get(12)) << 32;
/* 186 */                       unsignedInt8 ^= Byte.toUnsignedInt(byteBuffer2.get(11)) << 24;
/* 199 */                       unsignedInt8 ^= Byte.toUnsignedInt(byteBuffer2.get(10)) << 16;
/* 212 */                       unsignedInt8 ^= Byte.toUnsignedInt(byteBuffer2.get(9)) << 8;
/* 222 */                       unsignedInt8 ^= Byte.toUnsignedInt(byteBuffer2.get(8));
/* 223 */                       unsignedInt7 = byteBuffer2.getLong();
/* 362 */                       oI0illOo0iI0000Il00O2.I0000O = (Long.rotateLeft(unsignedInt7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ oI0illOo0iI0000Il00O2.I0000O;
/* 373 */                       oI0illOo0iI0000Il00O2.I0000oI00 = (Long.rotateLeft(unsignedInt8 * 5545529020109919103L, 33) * (-8663945395140668459L)) ^ oI0illOo0iI0000Il00O2.I0000oI00;
/* 379 */                       byteBuffer2.position(byteBuffer2.limit());
                                break;
                            default:
/* 128 */                       I000II.I000O01llI0("Should never get here.");
/* 131 */                       return null;
                        }
                    }
/* 382 */           long j = oI0illOo0iI0000Il00O2.I0000O;
/* 384 */           long j2 = oI0illOo0iI0000Il00O2.I0001Ioi1lo;
/* 387 */           long j3 = j ^ j2;
/* 390 */           long j4 = j2 ^ oI0illOo0iI0000Il00O2.I0000oI00;
/* 391 */           long j5 = j3 + j4;
/* 392 */           long j6 = j4 + j5;
/* 401 */           long j7 = (j5 ^ (j5 >>> 33)) * (-49064778989728563L);
/* 410 */           long j8 = (j7 ^ (j7 >>> 33)) * (-4265267296055464877L);
/* 417 */           long j9 = (j6 ^ (j6 >>> 33)) * (-49064778989728563L);
/* 421 */           long j10 = (j9 ^ (j9 >>> 33)) * (-4265267296055464877L);
/* 424 */           long j11 = j10 ^ (j10 >>> 33);
/* 425 */           long j12 = (j8 ^ (j8 >>> 33)) + j11;
/* 426 */           oI0illOo0iI0000Il00O2.I0000O = j12;
/* 429 */           oI0illOo0iI0000Il00O2.I0000oI00 = j11 + j12;
/* 453 */           byte[] bArrArray = ByteBuffer.wrap(new byte[16]).order(byteOrder).putLong(oI0illOo0iI0000Il00O2.I0000O).putLong(oI0illOo0iI0000Il00O2.I0000oI00).array();
/* 457 */           bArrArray.getClass();
/* 470 */           return ((I1oIIooI) l1il1ilioi1l.I00iOIl).I00000oIO((byte[]) bArrArray.clone());
                }

                public String toString() {
                    switch (this.I00iOIl) {
                        case 9:
/* 15 */                    StringBuilder sb = new StringBuilder(32);
/* 20 */                    sb.append("FaceMeshDetectorOptions{");
/* 29 */                    iil11iIo iil11iio = (iil11iIo) ((Oo1ol1ll) this.I00iiI).I00iio;
/* 31 */                    String str = "";
/* 33 */                    while (iil11iio != null) {
/* 37 */                        String str2 = (String) iil11iio.I00iiO;
/* 39 */                        sb.append(str);
/* 44 */                        String str3 = (String) iil11iio.I00iiI;
/* 46 */                        if (str3 != null) {
/* 48 */                            sb.append(str3);
/* 53 */                            sb.append('=');
                                }
/* 56 */                        if (str2 == null || !str2.getClass().isArray()) {
/* 87 */                            sb.append((Object) str2);
                                } else {
/* 83 */                            sb.append((CharSequence) Arrays.deepToString(new Object[]{str2}), 1, r1.length() - 1);
                                }
/* 92 */                        iil11iio = (iil11iIo) iil11iio.I00iio;
/* 94 */                        str = ", ";
                            }
/* 99 */                    sb.append('}');
/* 102 */                   return sb.toString();
                        default:
/* 6 */                     return super.toString();
                    }
                }

                @Override
                public boolean zza() {
/* 6 */             o01iIOoOi o01iioooi = (o01iIOoOi) this.I00iiI;
/* 11 */            o01oIol1O o01oiol1o = (o01oIol1O) this.I00iiO;
/* 13 */            i0OI1l1Oo i0oi1l1oo = o01iioooi.I0000O;
/* 21 */            String str = o01iioooi.I0000oI00;
/* 23 */            I0i0io0oOOi i0i0io0oOOi = o01iioooi.I00000oIO;
/* 25 */            i0i0io0oOOi.getClass();
/* 40 */            String strI001IIilI0O = Oi010OO0.I001IIilI0O(str, "/projects/722550545529/installations/", ((o01Il0IOli) o01iioooi.I0000Il00O.I00000oOI).I00000oIO, "/authTokens:generate");
/* 48 */            ArrayList arrayList = new ArrayList(20);
/* 63 */            String strConcat = "FIS_v2 ".concat(String.valueOf((String) o01iioooi.I0000Il00O.I0000Il00O));
/* 69 */            illliIoo1l0O.I00000oIO("authorization");
/* 72 */            illliIoo1l0O.I00000oOI(strConcat, "authorization");
/* 75 */            arrayList.add("authorization");
/* 86 */            arrayList.add(OlOoOIi0o.I00OIo(strConcat).toString());
/* 89 */            String str2 = i0i0io0oOOi.I00iiI;
/* 93 */            illliIoo1l0O.I00000oIO("x-goog-api-key");
/* 96 */            illliIoo1l0O.I00000oOI(str2, "x-goog-api-key");
/* 99 */            arrayList.add("x-goog-api-key");
/* 110 */           arrayList.add(OlOoOIi0o.I00OIo(str2).toString());
/* 115 */           boolean z = false;
/* 124 */           Io1Io0OOi011 io1Io0OOi011 = new Io1Io0OOi011((String[]) arrayList.toArray(new String[0]));
/* 127 */           long jCurrentTimeMillis = System.currentTimeMillis();
/* 133 */           o01oIol1O o01oiol1o2 = new o01oIol1O();
/* 136 */           o01oiol1o2.I0000Il00O();
/* 141 */           String strI00000oIO = o01iioooi.I00000oIO(io1Io0OOi011, strI001IIilI0O, "{installation:{sdkVersion:'o:a:mlkit:1.0.0'}}", o01oiol1o, o01oiol1o2);
/* 145 */           o01oiol1o2.I00000oOI();
/* 148 */           if (strI00000oIO != null) {
                        try {
                            try {
/* 156 */                       il0oiOo1loi1 il0oioo1loi1I00000oOI = lilloiiOo.I00000oOI(strI00000oIO).I00000oOI();
                                try {
/* 166 */                           String strI0001Ioi1lo = il0oioo1loi1I00000oOI.I0000oI00("token").I0001Ioi1lo();
/* 196 */                           long j = (Long.parseLong(il0oioo1loi1I00000oOI.I0000oI00("expiresIn").I0001Ioi1lo().replaceFirst("s$", "")) * 1000) + jCurrentTimeMillis;
/* 200 */                           IioiI0IIIIO iioiI0IIIIO = o01iioooi.I0000Il00O;
/* 217 */                           o01iioooi.I0000Il00O = new IioiI0IIIIO(j, (o01Il0IOli) iioiI0IIIIO.I00000oOI, (String) iioiI0IIIIO.I0000Il00O, strI0001Ioi1lo);
/* 219 */                           z = true;
                                } catch (ClassCastException | IllegalStateException | NullPointerException e) {
/* 224 */                           loOill110Ol looill110ol = loOill110Ol.RPC_RETURNED_INVALID_RESULT;
/* 226 */                           o01oiol1o2.I00000oIO(looill110ol);
/* 231 */                           o01oiol1o.I0000oI00.I000l1(looill110ol);
/* 266 */                           Log.e("MLKitFbInstsRestClient", "Error traversing JSON object returned from <" + strI001IIilI0O + ">:\nraw json:\n" + strI00000oIO + "\nparsed json:\n" + il0oioo1loi1I00000oOI.toString(), e);
                                }
                            } catch (il1ilOI0IIlo e2) {
/* 291 */                       Log.e("MLKitFbInstsRestClient", "Error parsing JSON object returned from <" + strI001IIilI0O + ">:\n" + strI00000oIO, e2);
/* 294 */                       loOill110Ol looill110ol2 = loOill110Ol.RPC_RETURNED_MALFORMED_RESULT;
/* 296 */                       o01oiol1o2.I00000oIO(looill110ol2);
/* 301 */                       o01oiol1o.I0000oI00.I000l1(looill110ol2);
                            }
                        } finally {
/* 312 */                   i0oi1l1oo.I0001Ioi1lo(lioiiIOoil.INSTALLATION_ID_FIS_GENERATE_AUTH_TOKEN, o01oiol1o2);
                        }
                    }
/* 309 */           return z;
                }

/* 15 */        public OoOlO1O0o(OillOo0 oillOo0, String str) {
                    this.I00iOIl = 7;
                    this.I00iiI = oillOo0;
                    this.I00iiO = str;
                }

/* 16 */        public OoOlO1O0o(int i) {
/* 17 */            this.I00iOIl = i;
                }
            }
