            package p000;

            import android.content.ComponentName;
            import android.content.Context;
            import android.os.Handler;
            import android.os.Parcel;
            import android.os.RemoteException;
            import android.os.SystemClock;
            import android.util.Base64;
            import android.util.Log;
            import com.google.common.util.concurrent.ListenableFuture;
            import java.lang.invoke.VarHandle;
            import java.lang.reflect.Type;
            import java.nio.ByteBuffer;
            import java.security.GeneralSecurityException;
            import java.security.InvalidAlgorithmParameterException;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Collections;
            import java.util.HashMap;
            import java.util.Iterator;
            import java.util.LinkedHashMap;
            import java.util.LinkedHashSet;
            import java.util.List;
            import java.util.concurrent.ConcurrentHashMap;
            import java.util.concurrent.Executor;
            import javax.crypto.Cipher;
            import javax.crypto.spec.SecretKeySpec;
            
/* 151 */   public final class iOliil implements OlOO0oIio01, O0iI1ol, IIiOOIoi0, I1OlOl11O0 {
                public static iOliil I00ilO0;
                public final int I00iOIl;
                public Object I00iiI;
                public Object I00iiO;
                public Object I00iio;
                public Object I00ilI0I1;

                public iOliil(Context context, IliIlOOIoIo iliIlOOIoIo) {
/* 2 */             this.I00iOIl = 0;
/* 13 */            Oioo1I0o oioo1I0o = new Oioo1I0o(context);
/* 24 */            byte b = (byte) (((byte) (0 | 1)) | 2);
/* 26 */            int i = 3;
/* 27 */            if (b != 3) {
/* 118 */               StringBuilder sb = new StringBuilder();
/* 123 */               if ((b & 1) == 0) {
/* 127 */                   sb.append(" enableFirelog");
                        }
/* 132 */               if ((b & 2) == 0) {
/* 136 */                   sb.append(" firelogEventType");
                        }
/* 149 */               I000II.I001IO000("Missing required properties:".concat(sb.toString()));
/* 332 */               throw null;
                    }
/* 31 */            iOll1Io1o111 ioll1io1o111 = new iOll1Io1o111();
/* 36 */            ioll1io1o111.I00000oIO = "shared-installation-id";
/* 38 */            ioll1io1o111.I00000oOI = 1;
/* 40 */            VarHandle.storeStoreFence();
/* 46 */            iOllO10O iollo10o = new iOllO10O(context, oioo1I0o, new iOllIooOOl(context, ioll1io1o111), "shared-installation-id");
/* 49 */            i11I1Ili i11i1ili = new i11I1Ili(i);
/* 52 */            i11i1ili.I00iiI = iollo10o;
/* 54 */            VarHandle.storeStoreFence();
/* 57 */            this.I00iio = i11i1ili;
/* 64 */            this.I00iiO = new iOliloiooo(context);
/* 68 */            iOliiiI1 ioliiii1 = new iOliiiI1();
/* 73 */            OIOlo00i oIOlo00i = new OIOlo00i();
/* 76 */            OollIoI001lo.I00000oOI();
/* 81 */            oIOlo00i.I0010I0i = 10000;
/* 83 */            OollIoI001lo.I00000oOI();
/* 86 */            oIOlo00i.I0010o = 10000;
/* 88 */            OollIoI001lo.I00000oOI();
/* 91 */            oIOlo00i.I00111O = 10000;
/* 98 */            ioliiii1.I00000oOI = new OIOlo0OloOi(oIOlo00i);
/* 100 */           ioliiii1.I00000oIO = iliIlOOIoIo;
/* 102 */           ioliiii1.I0000O = i11i1ili;
/* 104 */           ioliiii1.I0000Il00O = null;
/* 108 */           ioliiii1.I0000oI00 = "https://firebaseinstallations.googleapis.com/v1";
/* 110 */           VarHandle.storeStoreFence();
/* 113 */           this.I00iiI = ioliiii1;
                }

                public static void I000O01llI0(iOliil ioliil, OII0l01IIOi oII0l01IIOi) {
/* 1 */             ioliil.getClass();
/* 12 */            if (((LinkedHashSet) ioliil.I00iio).add(oII0l01IIOi)) {
/* 16 */                OII111OO1 oii111oo1 = (OII111OO1) ioliil.I00iiO;
/* 18 */                oii111oo1.getClass();
/* 23 */                if (oII0l01IIOi.I000II != null) {
/* 40 */                    OIiilo1Ool0o.I0010o(oII0l01IIOi, "Handler '", "' is already registered with a dispatcher");
/* 106 */                   return;
                        }
/* 27 */                oii111oo1.I0000oI00.addFirst(oII0l01IIOi);
/* 30 */                oII0l01IIOi.I000II = ioliil;
/* 32 */                oii111oo1.I00000oOI();
                    }
                }

                @Override
                public O0iI0IlO0iI I00000oIO(IOIOill iOIOill) {
/* 3 */             ArrayList arrayList = new ArrayList();
/* 12 */            IOiOol0 iOiOol0I00II0oii1o = ((I0Oi111ii) this.I00iiO).I00II0oii1o(iOIOill, OlI1o0ooI.I00IO1, arrayList);
/* 19 */            OillOo0 oillOo0 = new OillOo0(3);
/* 22 */            oillOo0.I00iiO = iOiOol0I00II0oii1o;
/* 24 */            oillOo0.I00iio = this;
/* 26 */            oillOo0.I00ilI0I1 = arrayList;
/* 28 */            oillOo0.I00iiI = iOiOol0I00II0oii1o;
/* 30 */            VarHandle.storeStoreFence();
/* 77 */            return oillOo0;
                }

                @Override
                public void I00000oOI(Object obj) {
/* 17 */            ((ArrayList) this.I00iiI).add(((I0Oi111ii) this.I00iiO).I0010I0i((OI1Iio0ii1) this.I00iio, obj));
                }

                @Override
                public void I0000Il00O(IOIOill iOIOill, OI1Iio0ii1 oI1Iio0ii1) {
/* 10 */            ((ArrayList) this.I00iiI).add(new Il0o0Oii0I(iOIOill, oI1Iio0ii1));
                }

                @Override
                public synchronized void I0000O(ByteBuffer byteBuffer, byte[] bArr) {
/* 14 */            if (byteBuffer.remaining() != ((I0OoI1) this.I00ilI0I1).I0000oI00()) {
/* 109 */               throw new InvalidAlgorithmParameterException("Invalid header length");
                    }
/* 28 */            if (byteBuffer.get() != ((I0OoI1) this.I00ilI0I1).I0000oI00()) {
/* 101 */               throw new GeneralSecurityException("Invalid ciphertext");
                    }
/* 33 */            this.I00iio = new byte[7];
/* 41 */            byte[] bArr2 = new byte[((I0OoI1) this.I00ilI0I1).I00000oIO];
/* 43 */            byteBuffer.get(bArr2);
/* 50 */            byteBuffer.get((byte[]) this.I00iio);
/* 55 */            I0OoI1 i0OoI1 = (I0OoI1) this.I00ilI0I1;
/* 74 */            this.I00iiI = new SecretKeySpec(iloIiOoiI.I00000oIO(i0OoI1.I0000O, i0OoI1.I0000oI00, bArr2, bArr, i0OoI1.I00000oIO), "AES");
/* 88 */            this.I00iiO = (Cipher) Il0O1l0i.I00000oOI.I00000oIO.I00IO1oi11O("AES/GCM/NoPadding");
                }

                @Override
                public void I0000oI00(IOIOo1o iOIOo1o) {
/* 10 */            ((ArrayList) this.I00iiI).add(new O0IiIOO(iOIOo1o));
                }

                @Override
                public synchronized void I0001Ioi1lo(ByteBuffer byteBuffer, int i, boolean z, ByteBuffer byteBuffer2) {
/* 20 */            ((Cipher) this.I00iiO).init(2, (SecretKeySpec) this.I00iiI, I0OoI1.I000OOo1O((byte[]) this.I00iio, i, z));
/* 27 */            ((Cipher) this.I00iiO).doFinal(byteBuffer, byteBuffer2);
                }

                public void I000II(Ill0l1 ill0l1) {
/* 9 */             if (((ArrayList) this.I00iiI).contains(ill0l1)) {
/* 33 */                IoOOl0iOl1io.I000OOo1O("Fragment already added: ", ill0l1);
/* 77 */                return;
                    }
                    synchronized (((ArrayList) this.I00iiI)) {
/* 20 */                ((ArrayList) this.I00iiI).add(ill0l1);
                    }
/* 25 */            ill0l1.I00li1OI = true;
                }

                @Override
                public void I000OOo1O() {
/* 3 */             IOiOol0 iOiOol0 = (IOiOol0) this.I00ilI0I1;
/* 7 */             OI1Iio0ii1 oI1Iio0ii1 = (OI1Iio0ii1) this.I00iio;
/* 11 */            ArrayList arrayList = (ArrayList) this.I00iiI;
/* 17 */            Ooo00oi0O ooo00oi0OI00000oOI = il10lII0iIi.I00000oOI(oI1Iio0ii1, (OI000ilOol) iOiOol0.I00ilI0I1);
/* 21 */            if (ooo00oi0OI00000oOI != null) {
/* 40 */                ((HashMap) iOiOol0.I00iiI).put(oI1Iio0ii1, new OoOl0o110(iiIiiol0.I00000oOI(arrayList), ooo00oi0OI00000oOI.getType()));
/* 43 */                return;
                    }
/* 56 */            if (((I0Oi111ii) iOiOol0.I00iio).I00II0Ol1O0l((IOIOill) iOiOol0.I00ilO0) && O0000Ioio00.I0000O(oI1Iio0ii1.I00000oOI(), "value")) {
/* 72 */                ArrayList arrayList2 = new ArrayList();
/* 75 */                Iterator it = arrayList.iterator();
/* 83 */                while (it.hasNext()) {
/* 85 */                    Object next = it.next();
/* 91 */                    if (next instanceof I11IOOl1IolO) {
/* 93 */                        arrayList2.add(next);
                            }
                        }
/* 99 */                List list = (List) iOiOol0.I00io1l;
/* 103 */               Iterator it2 = arrayList2.iterator();
/* 111 */               while (it2.hasNext()) {
/* 123 */                   list.add((I111oOiIiO0) ((I11IOOl1IolO) it2.next()).I00000oIO);
                        }
                    }
                }

                public void I000OiO(OII10o1l1IO oII10o1l1IO) {
/* 9 */             if (((LinkedHashSet) this.I00ilI0I1).add(oII10o1l1IO)) {
/* 16 */                ((OII111OO1) this.I00iiO).I00000oIO(this, oII10o1l1IO, -1);
                    }
                }

                public void I000iOII(OIOo00o oIOo00o, int i) {
/* 2 */             if (i != 1 && i != 0) {
/* 13 */                I000II.I0010I0i(Oi010OO0.I000oI1ioi(i, "Unsupported priority value: "));
                    } else if (((LinkedHashSet) this.I00ilI0I1).add(oIOo00o)) {
/* 31 */                ((OII111OO1) this.I00iiO).I00000oIO(this, oIOo00o, i);
                    }
                }

                public void I000l1(Object obj, Object obj2, O0OOlOII0l0 o0OOlOII0l0, boolean z) throws GeneralSecurityException {
                    byte[] bArrArray;
/* 5 */             if (((ConcurrentHashMap) this.I00iiO) == null) {
/* 280 */               I000II.I001IO000("addPrimitive cannot be called after build");
/* 1182 */              return;
                    }
/* 7 */             if (obj == null && obj2 == null) {
/* 14 */                IioIoO10iOiI.I000oI1ioi("at least one of the `fullPrimitive` or `primitive` must be set");
/* 17 */                return;
                    }
/* 24 */            if (o0OOlOII0l0.I001lllioOl() != O0OIII11.ENABLED) {
/* 274 */               IioIoO10iOiI.I000oI1ioi("only ENABLED key is allowed");
/* 277 */               return;
                    }
/* 28 */            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.I00iiO;
/* 34 */            Integer numValueOf = Integer.valueOf(o0OOlOII0l0.I001l0I00());
/* 44 */            if (o0OOlOII0l0.I001lIiIIo1O() == OIl1lli.RAW) {
/* 46 */                numValueOf = null;
                    }
/* 81 */            l0il1i0011O l0il1i0011oI00000oIO = OI10IIoI.I00000oOI.I00000oIO(OOi1OoI0loOi.I00000oIO(o0OOlOII0l0.I001iOo1i0O().I001lIiIIo1O(), o0OOlOII0l0.I001iOo1i0O().I001lllioOl(), o0OOlOII0l0.I001iOo1i0O().I001l0I00(), o0OOlOII0l0.I001lIiIIo1O(), numValueOf));
/* 91 */            int iOrdinal = o0OOlOII0l0.I001lIiIIo1O().ordinal();
/* 97 */            if (iOrdinal == 1) {
/* 156 */               bArrArray = ByteBuffer.allocate(5).put((byte) 1).putInt(o0OOlOII0l0.I001l0I00()).array();
                    } else if (iOrdinal == 2) {
/* 135 */               bArrArray = ByteBuffer.allocate(5).put((byte) 0).putInt(o0OOlOII0l0.I001l0I00()).array();
                    } else if (iOrdinal != 3) {
/* 106 */               if (iOrdinal != 4) {
/* 111 */                   IioIoO10iOiI.I000oI1ioi("unknown output prefix type");
/* 114 */                   return;
                        }
/* 135 */               bArrArray = ByteBuffer.allocate(5).put((byte) 0).putInt(o0OOlOII0l0.I001l0I00()).array();
                    } else {
/* 115 */               bArrArray = iIIl1o1Iiol.I00000oIO;
                    }
/* 160 */           O0OIII11 o0oiii11I001lllioOl = o0OOlOII0l0.I001lllioOl();
/* 164 */           OIl1lli oIl1lliI001lIiIIo1O = o0OOlOII0l0.I001lIiIIo1O();
/* 168 */           int iI001l0I00 = o0OOlOII0l0.I001l0I00();
/* 176 */           String strI001lIiIIo1O = o0OOlOII0l0.I001iOo1i0O().I001lIiIIo1O();
/* 180 */           OOIiiiO oOIiiiO = new OOIiiiO();
/* 183 */           oOIiiiO.I00000oIO = obj;
/* 185 */           oOIiiiO.I00000oOI = obj2;
/* 188 */           byte[] bArrCopyOf = Arrays.copyOf(bArrArray, bArrArray.length);
/* 192 */           oOIiiiO.I0000Il00O = bArrCopyOf;
/* 194 */           oOIiiiO.I0000O = o0oiii11I001lllioOl;
/* 196 */           oOIiiiO.I0000oI00 = oIl1lliI001lIiIIo1O;
/* 198 */           oOIiiiO.I0001Ioi1lo = iI001l0I00;
/* 200 */           oOIiiiO.I000II = strI001lIiIIo1O;
/* 202 */           oOIiiiO.I000O01llI0 = l0il1i0011oI00000oIO;
/* 204 */           VarHandle.storeStoreFence();
/* 209 */           ArrayList arrayList = new ArrayList();
/* 212 */           arrayList.add(oOIiiiO);
/* 222 */           OOIiilIiOo oOIiilIiOo = new OOIiilIiOo(Arrays.copyOf(bArrCopyOf, bArrCopyOf.length));
/* 233 */           List list = (List) concurrentHashMap.put(oOIiilIiOo, Collections.unmodifiableList(arrayList));
/* 235 */           if (list != null) {
/* 239 */               ArrayList arrayList2 = new ArrayList();
/* 242 */               arrayList2.addAll(list);
/* 245 */               arrayList2.add(oOIiiiO);
/* 252 */               concurrentHashMap.put(oOIiilIiOo, Collections.unmodifiableList(arrayList2));
                    }
/* 255 */           if (z) {
/* 261 */               if (((OOIiiiO) this.I00iio) == null) {
/* 263 */                   this.I00iio = oOIiiiO;
                        } else {
/* 268 */                   I000II.I001IO000("you cannot set two primary primitives");
                        }
                    }
                }

                public I1lI11l11OIo I000lI() {
                    String str;
                    String str2;
                    String str3;
/* 3 */             String str4 = (String) this.I00iiI;
/* 5 */             if (str4 != null && (str = (String) this.I00iiO) != null && (str2 = (String) this.I00iio) != null && (str3 = (String) this.I00ilI0I1) != null) {
/* 28 */                I1lI11l11OIo i1lI11l11OIo = new I1lI11l11OIo();
/* 31 */                i1lI11l11OIo.I00000oIO = str4;
/* 33 */                i1lI11l11OIo.I00000oOI = str;
/* 35 */                i1lI11l11OIo.I0000Il00O = str2;
/* 37 */                i1lI11l11OIo.I0000O = str3;
/* 39 */                VarHandle.storeStoreFence();
/* 42 */                return i1lI11l11OIo;
                    }
/* 45 */            StringBuilder sb = new StringBuilder();
/* 52 */            if (((String) this.I00iiI) == null) {
/* 56 */                sb.append(" namespace");
                    }
/* 63 */            if (((String) this.I00iiO) == null) {
/* 67 */                sb.append(" name");
                    }
/* 74 */            if (((String) this.I00iio) == null) {
/* 78 */                sb.append(" clientLibraryName");
                    }
/* 85 */            if (((String) this.I00ilI0I1) == null) {
/* 89 */                sb.append(" clientLibraryVersion");
                    }
/* 102 */           I000II.I001IO000("Missing required properties:".concat(sb.toString()));
/* 105 */           return null;
                }

                public void I000o00OoI0I(OlO0000lIOII olO0000lIOII) {
                    Runnable runnable;
                    synchronized (this.I00iio) {
/* 12 */                runnable = (Runnable) ((LinkedHashMap) this.I00ilI0I1).remove(olO0000lIOII);
                    }
/* 15 */            if (runnable != null) {
/* 25 */                ((Handler) ((Oi00IilOloo0) this.I00iiI).I00iOIl).removeCallbacks(runnable);
                    }
                }

                public void I000oI1ioi(Throwable th) {
/* 3 */             I1Il0loi i1Il0loi = (I1Il0loi) this.I00ilI0I1;
/* 7 */             IIIII1OI1 iiiii1oi1 = (IIIII1OI1) this.I00iio;
/* 14 */            if (iiiii1oi1.I0000Il00O(false, th)) {
/* 22 */                for (Object objI0000oI00 = iiiii1oi1.I0000oI00(); !(objI0000oI00 instanceof IO10l0l0); objI0000oI00 = iiiii1oi1.I0000oI00()) {
/* 24 */                    IO10lIoiO.I0000O(objI0000oI00);
/* 27 */                    i1Il0loi.addLast(objI0000oI00);
                        }
/* 39 */                if (i1Il0loi.isEmpty()) {
/* 77 */                    return;
                        }
/* 43 */                new ArrayList(i1Il0loi);
/* 46 */                i1Il0loi.clear();
                    }
                }

                /* JADX WARN: Code restructure failed: missing block: B:68:0x016c, code lost:
                
                    if (r6 != null) goto L69;
                 */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:61:0x0151  */
                /* JADX WARN: Removed duplicated region for block: B:67:0x0168  */
                /* JADX WARN: Removed duplicated region for block: B:81:0x01bd A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:82:0x01be  */
                /* JADX WARN: Type inference failed for: r12v1, types: [java.util.List] */
                /* JADX WARN: Type inference failed for: r12v5, types: [java.util.List] */
                /* JADX WARN: Type inference failed for: r12v6, types: [java.util.List] */
                /* JADX WARN: Type inference failed for: r12v7, types: [java.util.ArrayList] */
                /* JADX WARN: Type inference failed for: r17v0 */
                /* JADX WARN: Type inference failed for: r17v2, types: [Ol0O0iI0l0O] */
                /* JADX WARN: Type inference failed for: r17v24 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public Ol0O0iI0l0O I00100l0(OOoI10lllo oOoI10lllo, O00oiI0oo0ol o00oiI0oo0ol, Ol0O0iI0l0O ol0O0iI0l0O) throws Throwable {
                    OoOI1i1i ooOI1i1iI00000oOI;
                    boolean z;
                    boolean z2;
                    ?? r17;
                    boolean z3;
                    OoOIOoO1I ooOIOoO1I;
                    OoOIOoO1I ooOIOoO1II000OOo1O;
                    ?? I00iIi0i1o;
                    Iterator it;
                    List list;
                    boolean z4;
                    Object olIo1I;
                    Object next;
                    I11IlOOO i11IlOOO;
                    OoOi1Ol ooOi1OlI000l1;
                    Throwable th;
                    Throwable th2;
                    OI000ilOol oI000ilOolI000OiO;
                    Ooo0Ioii0o0 ooo0Ioii0o0I000l1;
/* 5 */             O00oiI0oo0ol o00oiI0oo0ol2 = o00oiI0oo0ol;
/* 9 */             OoOilOl1 ooOilOl1 = o00oiI0oo0ol2.I00000oIO;
/* 11 */            O00oiIoOo1o o00oiIoOo1o = o00oiI0oo0ol2.I00000oOI;
/* 13 */            boolean z5 = o00oiI0oo0ol2.I0000O;
/* 17 */            o01l1ioOo0 o01l1iooo0 = (o01l1ioOo0) this.I00iiI;
/* 21 */            I0l1OOl1l10 i0l1OOl1l10 = (I0l1OOl1l10) o01l1iooo0.I00iOIl;
/* 24 */            if (ol0O0iI0l0O == null || (ooOI1i1iI00000oOI = ol0O0iI0l0O.I00OloOo()) == null) {
/* 37 */                ooOI1i1iI00000oOI = lOoOoloI01i0.I00000oOI(new O0l1Ol1o(o01l1iooo0, oOoI10lllo, false));
                    }
/* 41 */            O00lI00ll o00lI00ll = oOoI10lllo.I00000oOI;
/* 47 */            if (o00lI00ll instanceof OOo1oliI) {
/* 50 */                OOo1oliI oOo1oliI = (OOo1oliI) o00lI00ll;
/* 52 */                z2 = false;
/* 54 */                Ill0IO ill0IOI0000Il00O = oOo1oliI.I0000Il00O();
/* 58 */                if (ill0IOI0000Il00O == null) {
/* 412 */                   throw new AssertionError("Class type should have a FQ name: " + o00lI00ll);
                        }
/* 60 */                if (z5 && ill0IOI0000Il00O.equals(O0100Ii1OoI1.I00000oIO)) {
/* 72 */                    OOoiOi oOoiOi = (OOoiOi) i0l1OOl1l10.I000OOo1O;
/* 74 */                    loIOiIO1O1 loioiio1o1 = oOoiOi.I0000Il00O;
/* 78 */                    O0O00I1Ili o0O00I1Ili = OOoiOi.I0000oI00[0];
/* 80 */                    loioiio1o1.getClass();
/* 91 */                    OI1Iio0ii1 oI1Iio0ii1I0000oI00 = OI1Iio0ii1.I0000oI00(iOl0l0o0o.I00000oIO(o0O00I1Ili.getName()));
/* 95 */                    th2 = null;
/* 95 */                    th2 = null;
/* 105 */                   z3 = true;
/* 109 */                   IOIiO1lIl0l iOIiO1lIl0lI0000oI00 = ((O1iil1I01o) oOoiOi.I00000oOI.getValue()).I0000oI00(oI1Iio0ii1I0000oI00, OIIl0iOOlo.I00iiI);
/* 120 */                   OI000ilOol oI000ilOol = iOIiO1lIl0lI0000oI00 instanceof OI000ilOol ? (OI000ilOol) iOIiO1lIl0lI0000oI00 : null;
/* 122 */                   if (oI000ilOol == null) {
/* 141 */                       oI000ilOolI000OiO = oOoiOi.I00000oIO.I000iOII(new IOIOill(OlIlllOI1.I000OOo1O, oI1Iio0ii1I0000oI00), Collections.singletonList(1));
/* 145 */                       z = z5;
/* 336 */                       if (oI000ilOolI000OiO == null) {
                                }
/* 359 */                       if (oI000ilOolI000OiO != null) {
                                }
/* 392 */                       throw new UnsupportedOperationException("Type not found: " + oOoI10lllo.I00000oIO);
                            }
/* 149 */                   z = z5;
/* 151 */                   oI000ilOolI000OiO = oI000ilOol;
/* 336 */                   if (oI000ilOolI000OiO == null) {
                            }
/* 359 */                   if (oI000ilOolI000OiO != null) {
                            }
/* 392 */                   throw new UnsupportedOperationException("Type not found: " + oOoI10lllo.I00000oIO);
                        }
/* 154 */               th2 = null;
/* 154 */               th2 = null;
/* 154 */               th2 = null;
/* 154 */               th2 = null;
/* 154 */               th2 = null;
/* 154 */               th2 = null;
/* 154 */               th2 = null;
/* 154 */               th2 = null;
/* 154 */               th2 = null;
/* 156 */               z3 = true;
/* 162 */               O0i1lI0o1io o0i1lI0o1io = ((OI0011) i0l1OOl1l10.I000O01llI0).I00iio;
/* 164 */               IOIOill iOIOillI000II = O00oO0liO11.I000II(ill0IOI0000Il00O);
/* 179 */               oI000ilOolI000OiO = iOIOillI000II != null ? o0i1lI0o1io.I000OiO(iOIOillI000II.I00000oIO()) : null;
/* 181 */               if (oI000ilOolI000OiO == null) {
/* 183 */                   z = z5;
/* 185 */                   oI000ilOolI000OiO = null;
                        } else if (O00oO0liO11.I000iOII.containsKey(IiOiIO0i1Oil.I0001Ioi1lo(oI000ilOolI000OiO))) {
/* 207 */                   if (o00oiIoOo1o == O00oiIoOo1o.I00iiO || ooOilOl1 == OoOilOl1.I00iOIl) {
/* 310 */                       z = z5;
                            } else {
/* 221 */                       OOoIlii oOoIlii = (OOoIlii) IOOi0Ool1i.I00IoIO0lI(oOoI10lllo.I0000Il00O());
/* 223 */                       z = z5;
/* 233 */                       OOoOI01iOoI oOoOI01iOoI = oOoIlii instanceof OOoOI01iOoI ? (OOoOI01iOoI) oOoIlii : null;
/* 235 */                       if (oOoOI01iOoI != null && oOoOI01iOoI.I0000Il00O() != null && O0000Ioio00.I0000O(I1IoiO1l.I001i1O0Ol(oOoOI01iOoI.I00000oIO.getUpperBounds()), Object.class)) {
/* 259 */                           Ill0OI0lo ill0OI0loI0001Ioi1lo = IiOiIO0i1Oil.I0001Ioi1lo(oI000ilOolI000OiO);
/* 263 */                           String str = O00oO0liO11.I00000oIO;
/* 265 */                           Ill0IO ill0IOI000OOo1O = O00oO0liO11.I000OOo1O(ill0OI0loI0001Ioi1lo);
/* 269 */                           if (ill0IOI000OOo1O == null) {
/* 306 */                               OoOil11Ol1o.I000OOo1O(oI000ilOolI000OiO, "Given class ", " is not a read-only collection");
/* 154 */                               return null;
                                    }
/* 291 */                           OoOOiO ooOOiO = (OoOOiO) IOOi0Ool1i.I00IoIO0lI(IiOiOOIo.I0000oI00(oI000ilOolI000OiO).I000OiO(ill0IOI000OOo1O).I000OOo1O().I000II());
/* 293 */                           if (ooOOiO != null && (ooo0Ioii0o0I000l1 = ooOOiO.I000l1()) != null && ooo0Ioii0o0I000l1 != Ooo0Ioii0o0.I00ilI0I1) {
                                    }
                                }
                            }
/* 316 */                   Ill0IO ill0IOI000OOo1O2 = O00oO0liO11.I000OOo1O(IiOiIO0i1Oil.I0001Ioi1lo(oI000ilOolI000OiO));
/* 320 */                   if (ill0IOI000OOo1O2 == null) {
/* 332 */                       OoOil11Ol1o.I000OOo1O(oI000ilOolI000OiO, "Given class ", " is not a read-only collection");
/* 154 */                       return null;
                            }
/* 326 */                   oI000ilOolI000OiO = IiOiOOIo.I0000oI00(oI000ilOolI000OiO).I000OiO(ill0IOI000OOo1O2);
                        } else {
/* 145 */                   z = z5;
                        }
/* 336 */               if (oI000ilOolI000OiO == null) {
/* 344 */                   IIOOoll iIOOoll = (IIOOoll) ((O1OIll00i) i0l1OOl1l10.I0001Ioi1lo).I00iiI;
/* 346 */                   if (iIOOoll == null) {
/* 355 */                       O0000Ioio00.I000OOo1O("resolver");
/* 358 */                       throw th2;
                            }
/* 348 */                   oI000ilOolI000OiO = iIOOoll.I00Ol1ll1(oOo1oliI);
                        }
/* 359 */               if (oI000ilOolI000OiO != null) {
/* 361 */                   ooOIOoO1II000OOo1O = oI000ilOolI000OiO.I000OOo1O();
                            th = th2;
                        }
/* 392 */               throw new UnsupportedOperationException("Type not found: " + oOoI10lllo.I00000oIO);
/* 444 */               if (ooOIOoO1I == null) {
/* 446 */                   return r17;
                        }
/* 460 */               boolean z6 = (o00oiIoOo1o == O00oiIoOo1o.I00iiO || z || ooOilOl1 == OoOilOl1.I00iOIl) ? z2 : z3;
/* 475 */               if (O0000Ioio00.I0000O(ol0O0iI0l0O != null ? ol0O0iI0l0O.I00iOIl() : r17, ooOIOoO1I) && !oOoI10lllo.I0000O() && z6) {
/* 487 */                   return ol0O0iI0l0O.I00li1OI(z3);
                        }
/* 526 */               boolean z7 = (oOoI10lllo.I0000O() || (oOoI10lllo.I0000Il00O().isEmpty() && !ooOIOoO1I.I000II().isEmpty())) ? z3 : z2;
/* 527 */               List listI000II = ooOIOoO1I.I000II();
/* 533 */               if (z7) {
/* 535 */                   List<OoOOiO> list2 = listI000II;
/* 543 */                   I00iIi0i1o = new ArrayList(IOOi1I.I0000O(list2, 10));
                            OoOIOoO1I ooOIOoO1I2 = r17;
/* 554 */                   for (OoOOiO ooOOiO2 : list2) {
/* 571 */                       if (lOoliOIOlIO0.I0001Ioi1lo(ooOOiO2, ooOIOoO1I2, o00oiI0oo0ol2.I0000oI00)) {
/* 573 */                           ooOi1OlI000l1 = OoOilo0Oliii.I000l1(ooOOiO2, o00oiI0oo0ol2);
                                } else {
/* 582 */                           O1I0OloI o1I0OloI = (O1I0OloI) i0l1OOl1l10.I00000oIO;
/* 587 */                           II000oliiIO iI000oliiIO = new II000oliiIO(3);
/* 590 */                           iI000oliiIO.I00iio = this;
/* 592 */                           iI000oliiIO.I00iiO = ooOOiO2;
/* 594 */                           iI000oliiIO.I00iiI = o00oiI0oo0ol2;
/* 596 */                           iI000oliiIO.I00ilI0I1 = ooOIOoO1I;
/* 598 */                           iI000oliiIO.I00ilO0 = oOoI10lllo;
/* 600 */                           VarHandle.storeStoreFence();
/* 603 */                           O0oI1IiI o0oI1IiI = new O0oI1IiI(o1I0OloI, iI000oliiIO);
/* 610 */                           iolOOiI iolooii = (iolOOiI) this.I00iio;
/* 621 */                           O00oiI0oo0ol o00oiI0oo0olI00000oIO = O00oiI0oo0ol.I00000oIO(o00oiI0oo0ol2, null, oOoI10lllo.I0000O(), null, null, 59);
/* 625 */                           iolooii.getClass();
/* 628 */                           ooOi1OlI000l1 = iolOOiI.I000l1(ooOOiO2, o00oiI0oo0olI00000oIO, o0oI1IiI);
                                }
/* 632 */                       I00iIi0i1o.add(ooOi1OlI000l1);
/* 635 */                       o00oiI0oo0ol2 = o00oiI0oo0ol;
/* 637 */                       ooOIOoO1I2 = null;
                            }
                        } else if (listI000II.size() == oOoI10lllo.I0000Il00O().size()) {
/* 718 */                   I1IollOi01 i1IollOi01I00ilI0I1 = IOOi0Ool1i.I00ilI0I1(oOoI10lllo.I0000Il00O());
/* 728 */                   ArrayList arrayList = new ArrayList(IOOi1I.I0000O(i1IollOi01I00ilI0I1, 10));
/* 731 */                   Iterator it2 = i1IollOi01I00ilI0I1.iterator();
                            while (true) {
/* 736 */                       Iio0IIOo iio0IIOo = (Iio0IIOo) it2;
/* 744 */                       if (!iio0IIOo.I00iiI.hasNext()) {
/* 1000 */                          I00iIi0i1o = IOOi0Ool1i.I00iIi0i1o(arrayList);
                                    break;
                                }
/* 750 */                       Iol0oIiIOI iol0oIiIOI = (Iol0oIiIOI) iio0IIOo.next();
/* 752 */                       int i = iol0oIiIOI.I00000oIO;
/* 756 */                       OOoIlii oOoIlii2 = (OOoIlii) iol0oIiIOI.I00000oOI;
/* 758 */                       listI000II.size();
/* 765 */                       OoOOiO ooOOiO3 = (OoOOiO) listI000II.get(i);
/* 773 */                       O00oiI0oo0ol o00oiI0oo0olI00000oIO2 = l01ill.I00000oIO(OoOilOl1.I00iiI, z2, null, 7);
/* 779 */                       if (oOoIlii2 instanceof OOoOI01iOoI) {
/* 781 */                           OOoOI01iOoI oOoOI01iOoI2 = (OOoOI01iOoI) oOoIlii2;
/* 783 */                           OOoIlii oOoIliiI0000Il00O = oOoOI01iOoI2.I0000Il00O();
/* 806 */                           Ooo0Ioii0o0 ooo0Ioii0o0 = !O0000Ioio00.I0000O(I1IoiO1l.I001i1O0Ol(oOoOI01iOoI2.I00000oIO.getUpperBounds()), Object.class) ? Ooo0Ioii0o0.I00ilI0I1 : Ooo0Ioii0o0.I00iio;
/* 808 */                           if (oOoIliiI0000Il00O == null || !(ooOOiO3.I000l1() == Ooo0Ioii0o0.I00iiO || ooo0Ioii0o0 == ooOOiO3.I000l1())) {
/* 825 */                               it = it2;
/* 827 */                               list = listI000II;
/* 829 */                               z4 = false;
/* 968 */                               olIo1I = OoOilo0Oliii.I000l1(ooOOiO3, o00oiI0oo0olI00000oIO2);
                                    } else {
/* 836 */                               if (oOoOI01iOoI2.I0000Il00O() == null) {
/* 962 */                                   I000II.I000iOII("Nullability annotations on unbounded wildcards aren't supported");
/* 965 */                                   return null;
                                        }
/* 844 */                               Iterator it3 = new O0l1Ol1o(o01l1iooo0, oOoOI01iOoI2, false).iterator();
                                        while (true) {
/* 849 */                                   IlIloII10O ilIloII10O = (IlIloII10O) it3;
/* 855 */                                   if (!ilIloII10O.hasNext()) {
/* 901 */                                       it = it2;
/* 903 */                                       list = listI000II;
/* 905 */                                       next = null;
                                                break;
                                            }
/* 857 */                                   next = ilIloII10O.next();
/* 862 */                                   I111oOiIiO0 i111oOiIiO0 = (I111oOiIiO0) next;
/* 864 */                                   Ill0IO[] ill0IOArr = O00o0lOioI.I00000oOI;
/* 866 */                                   it = it2;
/* 868 */                                   int length = ill0IOArr.length;
/* 869 */                                   list = listI000II;
/* 871 */                                   int i2 = 0;
/* 872 */                                   while (i2 < length) {
/* 874 */                                       int i3 = length;
/* 878 */                                       int i4 = i2;
/* 888 */                                       if (O0000Ioio00.I0000O(i111oOiIiO0.I0010o(), ill0IOArr[i2])) {
                                                    break;
                                                }
/* 891 */                                       i2 = i4 + 1;
/* 893 */                                       length = i3;
                                            }
/* 896 */                                   it2 = it;
/* 898 */                                   listI000II = list;
                                        }
/* 906 */                               I111oOiIiO0 i111oOiIiO02 = (I111oOiIiO0) next;
/* 912 */                               z4 = false;
/* 917 */                               O0iIl1 o0iIl1I001lloI = I001lloI(oOoIliiI0000Il00O, l01ill.I00000oIO(OoOilOl1.I00iiI, false, null, 7));
/* 921 */                               if (i111oOiIiO02 != null) {
/* 927 */                                   ArrayList arrayListI00O0o1oo = IOOi0Ool1i.I00O0o1oo(o0iIl1I001lloI.getAnnotations(), i111oOiIiO02);
/* 935 */                                   if (arrayListI00O0o1oo.isEmpty()) {
/* 937 */                                       i11IlOOO = i1i0olI.I00iiO;
                                            } else {
/* 942 */                                       I11Io0oil0i0 i11Io0oil0i0 = new I11Io0oil0i0();
/* 945 */                                       i11Io0oil0i0.I00iiI = arrayListI00O0o1oo;
/* 947 */                                       VarHandle.storeStoreFence();
/* 950 */                                       i11IlOOO = i11Io0oil0i0;
                                            }
/* 951 */                                   o0iIl1I001lloI = lOoliOIOlIO0.I000II(o0iIl1I001lloI, i11IlOOO);
                                        }
/* 955 */                               olIo1I = lOoliOIOlIO0.I00000oOI(o0iIl1I001lloI, ooo0Ioii0o0, ooOOiO3);
                                    }
                                } else {
/* 973 */                           it = it2;
/* 975 */                           list = listI000II;
/* 977 */                           z4 = false;
/* 986 */                           olIo1I = new OlIo1I(I001lloI(oOoIlii2, o00oiI0oo0olI00000oIO2), Ooo0Ioii0o0.I00iiO);
                                }
/* 989 */                       arrayList.add(olIo1I);
/* 992 */                       it2 = it;
/* 994 */                       listI000II = list;
/* 996 */                       z2 = z4;
                            }
                        } else {
/* 654 */                   List list3 = listI000II;
/* 662 */                   ArrayList arrayList2 = new ArrayList(IOOi1I.I0000O(list3, 10));
/* 665 */                   Iterator it4 = list3.iterator();
/* 673 */                   while (it4.hasNext()) {
/* 704 */                       arrayList2.add(new OlIo1I(Il0ooiloI.I00000oOI(Il0ooO1IO.I00oII, ((OoOOiO) it4.next()).getName().I00000oOI())));
                            }
/* 708 */                   I00iIi0i1o = IOOi0Ool1i.I00iIi0i1o(arrayList2);
                        }
/* 1004 */              return l0loOIIo0iOo.I0000Il00O(ooOI1i1iI00000oOI, ooOIOoO1I, I00iIi0i1o, z6);
                    }
/* 413 */           z = z5;
/* 415 */           z2 = false;
/* 417 */           r17 = 0;
/* 417 */           th = null;
/* 419 */           z3 = true;
/* 423 */           if (!(o00lI00ll instanceof OOoO0OoIIO)) {
/* 1011 */              IoOOl0iOl1io.I000OOo1O("Unknown classifier kind: ", o00lI00ll);
/* 965 */               return null;
                    }
/* 431 */           OoOOiO ooOOiOI00000oIO = ((OoOOol) this.I00iiO).I00000oIO((OOoO0OoIIO) o00lI00ll);
/* 435 */           if (ooOOiOI00000oIO != null) {
/* 437 */               ooOIOoO1II000OOo1O = ooOOiOI00000oIO.I000OOo1O();
                    } else {
/* 442 */               ooOIOoO1I = null;
/* 444 */               if (ooOIOoO1I == null) {
                        }
                    }
/* 367 */           ooOIOoO1I = ooOIOoO1II000OOo1O;
                    r17 = th;
/* 444 */           if (ooOIOoO1I == null) {
                    }
                }

                public void I00100o1O0lo(OII10o1l1IO oII10o1l1IO, OII0l0 oII0l0) {
/* 3 */             OII111OO1 oii111oo1 = (OII111OO1) this.I00iiO;
/* 7 */             if (oii111oo1.I000II != 0) {
/* 106 */               return;
                    }
/* 11 */            OII0l01IIOi oII0l01IIOiI0000Il00O = oii111oo1.I0000Il00O(-1);
/* 15 */            oii111oo1.I0001Ioi1lo = oII0l01IIOiI0000Il00O;
/* 17 */            oii111oo1.I000II = -1;
/* 19 */            oii111oo1.I000O01llI0 = oII10o1l1IO;
/* 21 */            if (oII0l0 != null) {
/* 23 */                if (oII0l01IIOiI0000Il00O != null) {
/* 30 */                    oII0l01IIOiI0000Il00O.I0000O = new OII11iIO(oII0l0, -1);
/* 32 */                    oII0l01IIOiI0000Il00O.I0000O(oII0l0);
                        }
/* 35 */                OlO0OIIl1 olO0OIIl1 = oii111oo1.I00000oIO;
/* 39 */                OII11iIO oII11iIO = new OII11iIO(oII0l0, -1);
/* 42 */                olO0OIIl1.getClass();
/* 46 */                olO0OIIl1.I000lI(null, oII11iIO);
                    }
                }

                public Ill0l1 I0010I0i(String str) {
/* 9 */             IllI0O1ol1lo illI0O1ol1lo = (IllI0O1ol1lo) ((HashMap) this.I00iiO).get(str);
/* 11 */            if (illI0O1ol1lo != null) {
/* 13 */                return illI0O1ol1lo.I0000Il00O;
                    }
/* 16 */            return null;
                }

                public Ill0l1 I0010o(String str) {
/* 17 */            for (IllI0O1ol1lo illI0O1ol1lo : ((HashMap) this.I00iiO).values()) {
/* 25 */                if (illI0O1ol1lo != null) {
/* 27 */                    Ill0l1 ill0l1I0010o = illI0O1ol1lo.I0000Il00O;
/* 35 */                    if (!str.equals(ill0l1I0010o.I00ilI0I1)) {
/* 42 */                        ill0l1I0010o = ill0l1I0010o.I00oIiI10.I0000Il00O.I0010o(str);
                            }
/* 46 */                    if (ill0l1I0010o != null) {
/* 48 */                        return ill0l1I0010o;
                            }
                        }
                    }
/* 49 */            return null;
                }

                public ArrayList I00111O() {
/* 3 */             ArrayList arrayList = new ArrayList();
/* 22 */            for (IllI0O1ol1lo illI0O1ol1lo : ((HashMap) this.I00iiO).values()) {
/* 30 */                if (illI0O1ol1lo != null) {
/* 32 */                    arrayList.add(illI0O1ol1lo);
                        }
                    }
/* 55 */            return arrayList;
                }

                public ArrayList I001IIilI0O() {
/* 3 */             ArrayList arrayList = new ArrayList();
/* 22 */            for (IllI0O1ol1lo illI0O1ol1lo : ((HashMap) this.I00iiO).values()) {
/* 30 */                if (illI0O1ol1lo != null) {
/* 34 */                    arrayList.add(illI0O1ol1lo.I0000Il00O);
                        } else {
/* 39 */                    arrayList.add(null);
                        }
                    }
/* 55 */            return arrayList;
                }

                public List I001IO000() {
                    ArrayList arrayList;
/* 9 */             if (((ArrayList) this.I00iiI).isEmpty()) {
/* 11 */                return Collections.EMPTY_LIST;
                    }
                    synchronized (((ArrayList) this.I00iiI)) {
/* 25 */                arrayList = new ArrayList((ArrayList) this.I00iiI);
                    }
/* 29 */            return arrayList;
                }

                public OooioIIoi0O I001i1O0Ol(O0IOli0o0 o0IOli0o0, String str) {
                    OooioIIoi0O oooioIIoi0O;
                    OooioIIoi0O oooioIIoi0OI00000oIO;
                    OiIol0o oiIol0o;
                    I01O1lIi i01O1lIi;
                    synchronized (((loilIl10Ii) this.I00ilI0I1)) {
                        try {
/* 16 */                    oooioIIoi0O = (OooioIIoi0O) ((Oool0l1iOIOl) this.I00iiI).I00000oIO.get(str);
/* 22 */                    if (o0IOli0o0.I001i1O0Ol(oooioIIoi0O)) {
/* 26 */                        Oool0IIIO0o oool0IIIO0o = (Oool0IIIO0o) this.I00iiO;
/* 30 */                        if ((oool0IIIO0o instanceof OiIol0o) && (i01O1lIi = (oiIol0o = (OiIol0o) oool0IIIO0o).I0000O) != null) {
/* 40 */                            l10IIo0ooIO.I00000oIO(oooioIIoi0O, oiIol0o.I0000oI00, i01O1lIi);
                                }
                            } else {
/* 52 */                        OI0l1OOllOo oI0l1OOllOo = new OI0l1OOllOo((Ii0OO1I1iOo) this.I00iio);
/* 57 */                        oI0l1OOllOo.I00000oOI(Oool0iOoooIo.I00000oOI, str);
/* 62 */                        Oool0IIIO0o oool0IIIO0o2 = (Oool0IIIO0o) this.I00iiO;
                                try {
                                    try {
/* 64 */                                oooioIIoi0OI00000oIO = oool0IIIO0o2.I0000Il00O(o0IOli0o0, oI0l1OOllOo);
                                    } catch (AbstractMethodError unused) {
/* 88 */                                oooioIIoi0OI00000oIO = oool0IIIO0o2.I00000oIO(((IOIO10iOi1) o0IOli0o0).I001l0I00());
                                    }
                                } catch (AbstractMethodError unused2) {
/* 77 */                            oooioIIoi0OI00000oIO = oool0IIIO0o2.I00000oOI(((IOIO10iOi1) o0IOli0o0).I001l0I00(), oI0l1OOllOo);
                                }
/* 68 */                        oooioIIoi0O = oooioIIoi0OI00000oIO;
/* 103 */                       OooioIIoi0O oooioIIoi0O2 = (OooioIIoi0O) ((Oool0l1iOIOl) this.I00iiI).I00000oIO.put(str, oooioIIoi0O);
/* 105 */                       if (oooioIIoi0O2 != null) {
/* 107 */                           oooioIIoi0O2.I00000oOI();
                                }
                            }
                        } catch (Throwable th) {
/* 332 */                   throw th;
                        }
                    }
/* 111 */           return oooioIIoi0O;
                }

                public boolean I001i1lo1io(IiOoI0oI iiOoI0oI) {
/* 9 */             if (((IiOoI0oI) this.I00iiO).equals(iiOoI0oI)) {
/* 28 */                return true;
                    }
/* 13 */            iOliil ioliil = (iOliil) this.I00iiI;
                    return ioliil != null ? ioliil.I001i1lo1io(iiOoI0oI) : false;
                }

                public void I001iOo1i0O(IllI0O1ol1lo illI0O1ol1lo) {
/* 1 */             Ill0l1 ill0l1 = illI0O1ol1lo.I0000Il00O;
/* 3 */             String str = ill0l1.I00ilI0I1;
/* 7 */             HashMap map = (HashMap) this.I00iiO;
/* 13 */            if (map.get(str) != null) {
/* 15 */                return;
                    }
/* 18 */            map.put(ill0l1.I00ilI0I1, illI0O1ol1lo);
/* 26 */            if (Ill1OlOOl.I00IOO(2)) {
/* 28 */                ill0l1.toString();
                    }
                }

                public void I001l0I00(IllI0O1ol1lo illI0O1ol1lo) {
/* 1 */             Ill0l1 ill0l1 = illI0O1ol1lo.I0000Il00O;
/* 5 */             if (ill0l1.I00oo1iO0ll) {
/* 11 */                ((Ill1io0lOI) this.I00ilI0I1).I0001Ioi1lo(ill0l1);
                    }
/* 27 */            if (((IllI0O1ol1lo) ((HashMap) this.I00iiO).put(ill0l1.I00ilI0I1, null)) != null && Ill1OlOOl.I00IOO(2)) {
/* 37 */                ill0l1.toString();
                    }
                }

                public void I001lIiIIo1O(OlO0000lIOII olO0000lIOII) {
/* 5 */             Io11iII11ll io11iII11ll = new Io11iII11ll(24);
/* 8 */             io11iII11ll.I00iiI = this;
/* 10 */            io11iII11ll.I00iiO = olO0000lIOII;
/* 12 */            VarHandle.storeStoreFence();
                    synchronized (this.I00iio) {
                    }
/* 40 */            ((Handler) ((Oi00IilOloo0) this.I00iiI).I00iOIl).postDelayed(io11iII11ll, 5400000L);
                }

                /* JADX WARN: Removed duplicated region for block: B:11:0x0030  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public Ooioo0o1l0 I001lllioOl(OOo1i1O01oI oOo1i1O01oI, O00oiI0oo0ol o00oiI0oo0ol, boolean z) throws Throwable {
                    OOIil01OI oOIil01OII0000Il00O;
/* 3 */             o01l1ioOo0 o01l1iooo0 = (o01l1ioOo0) this.I00iiI;
/* 7 */             I0l1OOl1l10 i0l1OOl1l10 = (I0l1OOl1l10) o01l1iooo0.I00iOIl;
/* 9 */             boolean z2 = o00oiI0oo0ol.I0000O;
/* 11 */            OOoIlii oOoIlii = oOo1i1O01oI.I00000oOI;
/* 22 */            OOoIiOOIIiII oOoIiOOIIiII = oOoIlii instanceof OOoIiOOIIiII ? (OOoIiOOIIiII) oOoIlii : null;
/* 23 */            if (oOoIiOOIIiII != null) {
/* 25 */                Class cls = oOoIiOOIIiII.I00000oIO;
/* 49 */                oOIil01OII0000Il00O = cls.equals(Void.TYPE) ? null : O0I1lo0l.I00000oOI(cls.getName()).I0000Il00O();
                    }
/* 53 */            O0l1Ol1o o0l1Ol1o = new O0l1Ol1o(o01l1iooo0, oOo1i1O01oI, true);
/* 56 */            if (oOIil01OII0000Il00O != null) {
/* 64 */                Ol0O0iI0l0O ol0O0iI0l0OI00100o1O0lo = ((OI0011) i0l1OOl1l10.I000O01llI0).I00iio.I00100o1O0lo(oOIil01OII0000Il00O);
/* 89 */                Ol0O0iI0l0O ol0O0iI0l0O = (Ol0O0iI0l0O) lOoliOIOlIO0.I000II(ol0O0iI0l0OI00100o1O0lo, new I11Io0oil0i0(new I11IlOOO[]{ol0O0iI0l0OI00100o1O0lo.getAnnotations(), o0l1Ol1o}));
                        return z2 ? ol0O0iI0l0O : l0loOIIo0iOo.I00000oIO(ol0O0iI0l0O, ol0O0iI0l0O.I00li1OI(true));
                    }
/* 110 */           O0iIl1 o0iIl1I001lloI = I001lloI(oOoIlii, l01ill.I00000oIO(OoOilOl1.I00iiI, z2, null, 6));
/* 114 */           if (z2) {
/* 129 */               return ((OI0011) i0l1OOl1l10.I000O01llI0).I00iio.I000OOo1O(z ? Ooo0Ioii0o0.I00ilI0I1 : Ooo0Ioii0o0.I00iiO, o0iIl1I001lloI, o0l1Ol1o);
                    }
/* 162 */           return l0loOIIo0iOo.I00000oIO(((OI0011) i0l1OOl1l10.I000O01llI0).I00iio.I000OOo1O(Ooo0Ioii0o0.I00iiO, o0iIl1I001lloI, o0l1Ol1o), ((OI0011) i0l1OOl1l10.I000O01llI0).I00iio.I000OOo1O(Ooo0Ioii0o0.I00ilI0I1, o0iIl1I001lloI, o0l1Ol1o).I00li1OI(true));
                }

                public O0iIl1 I001lloI(OOoIlii oOoIlii, O00oiI0oo0ol o00oiI0oo0ol) throws Throwable {
/* 7 */             I0l1OOl1l10 i0l1OOl1l10 = (I0l1OOl1l10) ((o01l1ioOo0) this.I00iiI).I00iOIl;
/* 12 */            if (oOoIlii instanceof OOoIiOOIIiII) {
/* 16 */                Class cls = ((OOoIiOOIIiII) oOoIlii).I00000oIO;
/* 35 */                OOIil01OI oOIil01OII0000Il00O = cls.equals(Void.TYPE) ? null : O0I1lo0l.I00000oOI(cls.getName()).I0000Il00O();
                        return oOIil01OII0000Il00O != null ? ((OI0011) i0l1OOl1l10.I000O01llI0).I00iio.I0010o(oOIil01OII0000Il00O) : ((OI0011) i0l1OOl1l10.I000O01llI0).I00iio.I001i1O0Ol();
                    }
/* 66 */            if (!(oOoIlii instanceof OOoI10lllo)) {
/* 184 */               if (oOoIlii instanceof OOo1i1O01oI) {
/* 188 */                   return I001lllioOl((OOo1i1O01oI) oOoIlii, o00oiI0oo0ol, false);
                        }
/* 195 */               if (oOoIlii instanceof OOoOI01iOoI) {
/* 199 */                   OOoIlii oOoIliiI0000Il00O = ((OOoOI01iOoI) oOoIlii).I0000Il00O();
                            return oOoIliiI0000Il00O != null ? I001lloI(oOoIliiI0000Il00O, o00oiI0oo0ol) : ((OI0011) i0l1OOl1l10.I000O01llI0).I00iio.I000oI1ioi();
                        }
/* 221 */               if (oOoIlii == null) {
/* 229 */                   return ((OI0011) i0l1OOl1l10.I000O01llI0).I00iio.I000oI1ioi();
                        }
/* 236 */               OoOil11Ol1o.I000iOII("Unsupported type: ", oOoIlii);
/* 11 */                return null;
                    }
/* 68 */            OOoI10lllo oOoI10lllo = (OOoI10lllo) oOoIlii;
/* 70 */            Type type = oOoI10lllo.I00000oIO;
/* 84 */            boolean z = (o00oiI0oo0ol.I0000O || o00oiI0oo0ol.I00000oIO == OoOilOl1.I00iOIl) ? false : true;
/* 85 */            boolean zI0000O = oOoI10lllo.I0000O();
/* 89 */            if (!zI0000O && !z) {
/* 93 */                Ol0O0iI0l0O ol0O0iI0l0OI00100l0 = I00100l0(oOoI10lllo, o00oiI0oo0ol, null);
                        return ol0O0iI0l0OI00100l0 != null ? ol0O0iI0l0OI00100l0 : Il0ooiloI.I00000oOI(Il0ooO1IO.I00iiO, type.toString());
                    }
/* 121 */           Ol0O0iI0l0O ol0O0iI0l0OI00100l02 = I00100l0(oOoI10lllo, o00oiI0oo0ol.I00000oOI(O00oiIoOo1o.I00iiO), null);
/* 125 */           if (ol0O0iI0l0OI00100l02 == null) {
/* 137 */               return Il0ooiloI.I00000oOI(Il0ooO1IO.I00iiO, type.toString());
                    }
/* 148 */           Ol0O0iI0l0O ol0O0iI0l0OI00100l03 = I00100l0(oOoI10lllo, o00oiI0oo0ol.I00000oOI(O00oiIoOo1o.I00iiI), ol0O0iI0l0OI00100l02);
                    return ol0O0iI0l0OI00100l03 == null ? Il0ooiloI.I00000oOI(Il0ooO1IO.I00iiO, type.toString()) : zI0000O ? new OOlIIOoli(ol0O0iI0l0OI00100l02, ol0O0iI0l0OI00100l03, 0) : l0loOIIo0iOo.I00000oIO(ol0O0iI0l0OI00100l02, ol0O0iI0l0OI00100l03);
                }

                public void I00II0Ol1O0l() {
/* 3 */             iOliiiI1 ioliiii1 = (iOliiiI1) this.I00iiI;
/* 7 */             iOliloiooo ioliloiooo = (iOliloiooo) this.I00iiO;
/* 11 */            i11I1Ili i11i1ili = (i11I1Ili) this.I00iio;
/* 15 */            i0O1001OIi i0o1001oii = new i0O1001OIi();
/* 22 */            i0o1001oii.I00000oIO = SystemClock.elapsedRealtime();
                    try {
/* 24 */                IioiI0IIIIO iioiI0IIIIOI00000oIO = ioliloiooo.I00000oIO(i0o1001oii);
/* 28 */                if (iioiI0IIIIOI00000oIO != null) {
/* 30 */                    this.I00ilI0I1 = iioiI0IIIIOI00000oIO;
                        } else {
/* 39 */                    i0O1001OIi i0o1001oii2 = new i0O1001OIi();
/* 44 */                    lIO0IIo lio0iio = (lIO0IIo) i0o1001oii2.I0000O;
/* 50 */                    i0o1001oii2.I00000oIO = SystemClock.elapsedRealtime();
                            try {
/* 56 */                        byte[] bArr = new byte[17];
/* 60 */                        iOlil0II0lI.I00000oIO.nextBytes(bArr);
/* 71 */                        bArr[0] = (byte) ((bArr[0] & 15) | 112);
/* 81 */                        String strSubstring = Base64.encodeToString(bArr, 11).substring(0, 22);
/* 87 */                        "Generated installation id: ".concat(strSubstring);
/* 90 */                        iOlii1iOOil iolii1iooil = new iOlii1iOOil(strSubstring);
/* 95 */                        OlilOlOiI olilOlOiI = new OlilOlOiI(11);
/* 98 */                        olilOlOiI.I00iiI = ioliiii1;
/* 100 */                       olilOlOiI.I00iiO = iolii1iooil;
/* 102 */                       olilOlOiI.I00iio = i0o1001oii2;
/* 104 */                       VarHandle.storeStoreFence();
/* 111 */                       if (iOlolo.I00000oIO(olilOlOiI)) {
/* 133 */                           IioiI0IIIIO iioiI0IIIIO = ioliiii1.I0000Il00O;
/* 135 */                           this.I00ilI0I1 = iioiI0IIIIO;
/* 137 */                           if (iioiI0IIIIO != null) {
/* 139 */                               ioliloiooo.I0000Il00O(iioiI0IIIIO, i0o1001oii2);
                                    }
/* 142 */                           i0o1001oii2.I00000oIO();
                                } else {
/* 115 */                           lio0iio.I000O01llI0(iOiooo0O1l.RPC_EXPONENTIAL_BACKOFF_FAILED);
/* 120 */                           lio0iio.I000O01llI0(iOiooo0O1l.RPC_ERROR);
/* 123 */                           i0o1001oii2.I00000oIO();
                                }
/* 127 */                       i11i1ili.I0000O(iOIo11i.INSTALLATION_ID_REGISTER_NEW_ID, i0o1001oii2);
                            } catch (Throwable th) {
/* 157 */                       i0o1001oii2.I00000oIO();
/* 162 */                       i11i1ili.I0000O(iOIo11i.INSTALLATION_ID_REGISTER_NEW_ID, i0o1001oii2);
/* 165 */                       throw th;
                            }
                        }
/* 148 */               i0o1001oii.I00000oIO();
/* 153 */               i11i1ili.I0000O(iOIo11i.INSTALLATION_ID_INIT, i0o1001oii);
                    } catch (Throwable th2) {
/* 166 */               i0o1001oii.I00000oIO();
/* 171 */               i11i1ili.I0000O(iOIo11i.INSTALLATION_ID_INIT, i0o1001oii);
/* 245 */               throw th2;
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r10v0 */
                /* JADX WARN: Type inference failed for: r10v1, types: [IIiOOI] */
                /* JADX WARN: Type inference failed for: r10v2 */
                /* JADX WARN: Type inference failed for: r10v3 */
                /* JADX WARN: Type inference failed for: r10v5 */
                /* JADX WARN: Type inference failed for: r10v8 */
                /* JADX WARN: Type inference failed for: r10v9 */
                @Override
                public Object attachCompleter(IIiOOI iIiOOI) {
                    ?? r10;
                    switch (this.I00iOIl) {
                        case 16:
/* 111 */                   il0I11I011 il0i11i011 = (il0I11I011) this.I00iiI;
/* 115 */                   iOo0lOoi ioo0looi = (iOo0lOoi) this.I00iiO;
/* 120 */                   iOioIII1i ioioiii1i = (iOioIII1i) this.I00iio;
/* 125 */                   ii0IiOii ii0iioii = (ii0IiOii) this.I00ilI0I1;
/* 127 */                   ComponentName componentName = il0I11I011.I00li1OI;
                            try {
/* 129 */                       l0IIolOoi0I l0iiolooi0i = ioo0looi.I00000oIO;
/* 132 */                       io100oIo io100oio = (io100oIo) l0iiolooi0i;
/* 138 */                       r10 = 11;
/* 140 */                       Parcel parcelI00O0i0ii = io100oio.I00O0i0ii(11, io100oio.I00Iooi00oi());
/* 144 */                       int i = parcelI00O0i0ii.readInt();
/* 148 */                       parcelI00O0i0ii.recycle();
                                try {
/* 152 */                           if (i > 0) {
/* 154 */                               il11O1OlI il11o1oliI00000oIO = ioioiii1i.I00000oIO();
/* 161 */                               IIiOOI iIiOOI2 = iIiOOI;
/* 162 */                               iioI0O10i iioi0o10i = new iioI0O10i(il0i11i011, ii0iioii, ioioiii1i, iIiOOI2, 0);
/* 165 */                               io100oIo io100oio2 = (io100oIo) l0iiolooi0i;
/* 167 */                               Parcel parcelI00Iooi00oi = io100oio2.I00Iooi00oi();
/* 171 */                               int i2 = iil0I01i.I00000oIO;
/* 173 */                               parcelI00Iooi00oi.writeInt(1);
/* 176 */                               il11o1oliI00000oIO.writeToParcel(parcelI00Iooi00oi, 0);
/* 179 */                               parcelI00Iooi00oi.writeStrongBinder(iioi0o10i);
/* 184 */                               Parcel parcelI00O0i0ii2 = io100oio2.I00O0i0ii(12, parcelI00Iooi00oi);
/* 188 */                               parcelI00O0i0ii2.readInt();
/* 191 */                               parcelI00O0i0ii2.recycle();
                                        r10 = iIiOOI2;
                                    } else {
/* 201 */                               IIiOOI iIiOOI3 = iIiOOI;
/* 205 */                               iioI0O10i iioi0o10i2 = new iioI0O10i(il0i11i011, ii0iioii, ioioiii1i, iIiOOI3, 1);
/* 208 */                               il11O1OlI il11o1oliI00000oIO2 = ioioiii1i.I00000oIO();
/* 212 */                               io100oIo io100oio3 = (io100oIo) l0iiolooi0i;
/* 214 */                               Parcel parcelI00Iooi00oi2 = io100oio3.I00Iooi00oi();
/* 218 */                               int i3 = iil0I01i.I00000oIO;
/* 220 */                               parcelI00Iooi00oi2.writeInt(1);
/* 223 */                               il11o1oliI00000oIO2.writeToParcel(parcelI00Iooi00oi2, 0);
/* 226 */                               parcelI00Iooi00oi2.writeStrongBinder(iioi0o10i2);
/* 230 */                               Parcel parcelI00O0i0ii3 = io100oio3.I00O0i0ii(7, parcelI00Iooi00oi2);
/* 234 */                               parcelI00O0i0ii3.readInt();
/* 237 */                               parcelI00O0i0ii3.recycle();
                                        r10 = iIiOOI3;
                                    }
                                } catch (RemoteException e) {
/* 195 */                           e = e;
/* 196 */                           RemoteException remoteException = e;
/* 252 */                           Log.e("il0I11I011", "AiCore service failed to download feature ".concat(((iOoOlIOOi) ioioiii1i).I00000oIO), remoteException);
/* 267 */                           r10.I0000O(iOiI1oOo1l.I00000oOI(6, "AICore service failed to download feature ".concat(((iOoOlIOOi) ioioiii1i).I00000oIO), remoteException));
/* 3 */                             return "requestDownloadableFeatureFuture";
                                }
                            } catch (RemoteException e2) {
/* 198 */                       e = e2;
/* 199 */                       r10 = iIiOOI;
                            }
                        default:
/* 16 */                    l00Iil l00iil = (l00Iil) this.I00iiI;
/* 20 */                    ilOi00IOiII iloi00ioiii = (ilOi00IOiII) this.I00iiO;
/* 24 */                    ilOiOOII0I0 iloiooii0i0 = (ilOiOOII0I0) this.I00iio;
/* 28 */                    ili0l0oo0 ili0l0oo0Var = (ili0l0oo0) this.I00ilI0I1;
/* 30 */                    l00iil.getClass();
                            try {
/* 48 */                        ((iIlI1O1liI0) iloi00ioiii.I00000oIO).I00OI1(iloiooii0i0.I00000oIO(), new ioll1i1llO(l00iil, ili0l0oo0Var, iloiooii0i0, iIiOOI));
                                break;
                            } catch (RemoteException e3) {
/* 91 */                        Log.e("l00Iil", "AiCore service failed to download feature ".concat(iloiooii0i0.I00000oIO), e3);
/* 104 */                       iIiOOI.I0000O(ilIoOl.I00000oIO(6, e3, "AICore service failed to download feature ".concat(iloiooii0i0.I00000oIO)));
                                break;
                            } catch (RuntimeException e4) {
/* 66 */                        Log.e("l00Iil", "AiCore service failed to download feature due to runtime error ".concat(iloiooii0i0.I00000oIO), e4);
/* 81 */                        iIiOOI.I0000O(ilIoOl.I00000oIO(0, e4, "AICore service failed to download feature due to runtime error ".concat(iloiooii0i0.I00000oIO)));
                                break;
                            }
                    }
/* 3 */             return "requestDownloadableFeatureFuture";
                }

                @Override
                public ListenableFuture call() {
/* 5 */             IIlOoolol0ll iIlOoolol0ll = (IIlOoolol0ll) this.I00iiI;
/* 7 */             int i = 0;
/* 8 */             lolliO01l lollio01l = new lolliO01l(i);
/* 11 */            lollio01l.I00000oOI = iIlOoolol0ll;
/* 13 */            VarHandle.storeStoreFence();
/* 18 */            ListenableFuture listenableFuture = (ListenableFuture) this.I00iiO;
/* 20 */            Iii11Ooi iii11Ooi = Iii11Ooi.I00iOIl;
/* 22 */            I01i1oI i01i1oII00100l0 = I01iIIO.I00100l0(listenableFuture, lollio01l, iii11Ooi);
/* 34 */            I01i1oI i01i1oII00100l02 = I01iIIO.I00100l0(i01i1oII00100l0, (I1Oll0OOO) this.I00iio, (Executor) this.I00ilI0I1);
/* 40 */            loloOo1OiO lolooo1oio = new loloOo1OiO(i);
/* 43 */            lolooo1oio.I00000oOI = iIlOoolol0ll;
/* 45 */            lolooo1oio.I0000Il00O = i01i1oII00100l0;
/* 47 */            lolooo1oio.I0000O = i01i1oII00100l02;
/* 49 */            VarHandle.storeStoreFence();
/* 56 */            return I01iIIO.I00100l0(i01i1oII00100l02, o0iOII1liI.I00000oOI(lolooo1oio), iii11Ooi);
                }

/* 152 */       public iOliil(int i) {
/* 153 */           this.I00iOIl = i;
                }
            }
