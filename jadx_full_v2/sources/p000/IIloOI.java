            package p000;

            import android.graphics.Region;
            import android.os.Handler;
            import android.os.Looper;
            import android.util.Log;
            import android.widget.Magnifier;
            import com.google.mlkit.vision.pose.PoseLandmark;
            import java.lang.invoke.VarHandle;
            import java.security.GeneralSecurityException;
            import java.security.Provider;
            import java.security.Security;
            import java.util.ArrayList;
            import java.util.BitSet;
            import java.util.Collection;
            import java.util.Collections;
            import java.util.HashMap;
            import java.util.HashSet;
            import java.util.Iterator;
            import java.util.LinkedHashMap;
            import java.util.LinkedHashSet;
            import java.util.List;
            import java.util.Map;
            import java.util.Objects;
            import java.util.Set;
            import java.util.concurrent.CopyOnWriteArrayList;
            import java.util.concurrent.CountDownLatch;
            import java.util.concurrent.TimeUnit;
            
/* 7 */     public class IIloOI implements OOlOIoII, IOIO1OOOO0, Il0O1OllI, I0IIOlio, Illo1O0O10l, O0iI0IlO0iI, Ii01l1Ii0i, OIi0Oi1lOoo {
                public static final OIiOOiO1O I00iiO = new OIiOOiO1O();
                public static final OIiOO01O01 I00iio = new OIiOO01O01();
                public final int I00iOIl;
                public Object I00iiI;

                public IIloOI(Object obj, int i) {
/* 1 */             this.I00iOIl = i;
/* 3 */             this.I00iiI = obj;
                }

                public static O1OIll00i I00IOO() {
/* 9 */             return new O1OIll00i(new BitSet(), 3);
                }

                /* JADX WARN: Removed duplicated region for block: B:61:0x00c0  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static IlIIOlio00io I00IoIO0lI(Io1100oIo io1100oIo, List list) {
                    boolean z;
                    boolean z2;
                    boolean z3;
                    String string;
/* 1 */             List<Ool10o> list2 = list;
/* 3 */             boolean z4 = list2 instanceof Collection;
/* 6 */             boolean z5 = false;
/* 7 */             if (z4 && list2.isEmpty()) {
/* 18 */                z = false;
                    } else {
/* 20 */                Iterator it = list2.iterator();
/* 28 */                while (it.hasNext()) {
/* 38 */                    if (((Ool10o) it.next()) instanceof Ioi1Io1o) {
/* 40 */                        z = true;
                                break;
                            }
                        }
/* 18 */                z = false;
                    }
/* 41 */            if (z4 && list2.isEmpty()) {
/* 52 */                z2 = false;
                    } else {
/* 62 */                for (Ool10o ool10o : list2) {
/* 72 */                    if ((ool10o instanceof OOIIOiolI) || li0IooIlo10.I00000oOI(ool10o)) {
/* 80 */                        z2 = true;
                                break;
                            }
                        }
/* 52 */                z2 = false;
                    }
/* 81 */            if (z4 && list2.isEmpty()) {
/* 92 */                z3 = false;
                    } else {
/* 102 */               for (Ool10o ool10o2 : list2) {
/* 112 */                   if ((ool10o2 instanceof OOIIOiolI) || (ool10o2 instanceof Ioi01I0) || li0IooIlo10.I00000oOI(ool10o2)) {
/* 124 */                       z3 = true;
                                break;
                            }
                        }
/* 92 */                z3 = false;
                    }
/* 125 */           if (!z4 || !list2.isEmpty()) {
/* 137 */               Iterator it2 = list2.iterator();
                        while (true) {
/* 145 */                   if (!it2.hasNext()) {
                                break;
                            }
/* 157 */                   if (li0IooIlo10.I00000oOI((Ool10o) it2.next())) {
/* 159 */                       z5 = true;
                                break;
                            }
                        }
                    }
/* 164 */           int iOrdinal = io1100oIo.I00000oIO().ordinal();
/* 171 */           if (iOrdinal == 0) {
/* 262 */               string = OolOiI0I.I00iiO + " or " + OolOiI0I.I00ilO0;
/* 266 */               if (z2) {
                        }
                    } else if (iOrdinal == 1) {
/* 237 */               string = OolOiI0I.I00iiO + " or " + OolOiI0I.I00ilO0 + " or " + OolOiI0I.I00ilI0I1;
/* 241 */               if (z3) {
                        }
                    } else {
/* 176 */               if (iOrdinal == 2) {
/* 210 */                   throw null;
                        }
/* 179 */               if (iOrdinal == 3) {
/* 201 */                   string = OolOiI0I.I00iio.toString();
/* 205 */                   if (z) {
                            }
                        } else {
/* 182 */                   if (iOrdinal != 4) {
/* 195 */                       I000II.I00000oIO();
/* 170 */                       return null;
                            }
/* 186 */                   string = OolOiI0I.I00ilO0.toString();
/* 190 */                   if (z5) {
/* 193 */                       string = null;
                            }
                        }
                    }
/* 268 */           if (string == null) {
/* 170 */               return null;
                    }
/* 272 */           IlIIOlio00io ilIIOlio00io = new IlIIOlio00io();
/* 275 */           ilIIOlio00io.I00000oIO = string;
/* 277 */           ilIIOlio00io.I00000oOI = io1100oIo;
/* 279 */           VarHandle.storeStoreFence();
/* 282 */           return ilIIOlio00io;
                }

                @Override
                public void I0001Ioi1lo(Object obj) {
                    switch (this.I00iOIl) {
                        case PoseLandmark.LEFT_INDEX:
                            break;
                        default:
/* 12 */                    ((i0Ii1l) this.I00iiI).mo17f();
                            break;
                    }
                }

                @Override
                public void I000iOII(Object obj) {
/* 1 */             I0IIOOO1O i0iiooo1o = (I0IIOOO1O) obj;
/* 5 */             Ill1OlOOl ill1OlOOl = (Ill1OlOOl) this.I00iiI;
/* 13 */            Ill1IIIIO ill1IIIIO = (Ill1IIIIO) ill1OlOOl.I001lloI.pollFirst();
/* 17 */            if (ill1IIIIO == null) {
/* 33 */                Log.w("FragmentManager", "No Activities were started for result for " + this);
/* 36 */                return;
                    }
/* 37 */            String str = ill1IIIIO.I00iOIl;
/* 39 */            int i = ill1IIIIO.I00iiI;
/* 43 */            Ill0l1 ill0l1I0010o = ill1OlOOl.I0000Il00O.I0010o(str);
/* 47 */            if (ill0l1I0010o != null) {
/* 71 */                ill0l1I0010o.I001IIilI0O(i, i0iiooo1o.I00iOIl, i0iiooo1o.I00iiI);
/* 77 */                return;
                    }
/* 63 */            Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
                }

                @Override
                public IOlOo1ll1l1 I000l1() {
/* 3 */             return (IOlOo1ll1l1) this.I00iiI;
                }

                @Override
                public void I000lI(OI1Iio0ii1 oI1Iio0ii1, Object obj) {
/* 3 */             OOlIll1 oOlIll1 = (OOlIll1) this.I00iiI;
/* 5 */             String strI00000oOI = oI1Iio0ii1.I00000oOI();
/* 15 */            if ("version".equals(strI00000oOI)) {
/* 19 */                if (obj instanceof int[]) {
/* 23 */                    oOlIll1.I00iOIl = (int[]) obj;
                        }
                    } else if ("multifileClassName".equals(strI00000oOI)) {
/* 42 */                oOlIll1.I00iiI = obj instanceof String ? (String) obj : null;
                    }
                }

                @Override
                public Object I0010I0i(Ii01i1 ii01i1) {
/* 5 */             return ((O00lIli0) this.I00iiI).invoke(ii01i1);
                }

                @Override
                public O0iI1ol I001i1lo1io(OI1Iio0ii1 oI1Iio0ii1) {
/* 1 */             String strI00000oOI = oI1Iio0ii1.I00000oOI();
/* 11 */            if ("data".equals(strI00000oOI) || "filePartClassNames".equals(strI00000oOI)) {
/* 42 */                return new OOlIlO(this, 0);
                    }
/* 28 */            if ("strings".equals(strI00000oOI)) {
/* 33 */                return new OOlIlO(this, 1);
                    }
/* 37 */            return null;
                }

                @Override
                public IOIO1OO1l10l I001lIiIIo1O(IOIOill iOIOill) {
                    IOIO1OO1l10l iOIO1OO1l10lI001lIiIIo1O;
/* 3 */             OIo0loI111I1 oIo0loI111I1 = (OIo0loI111I1) this.I00iiI;
/* 5 */             Ill0IO ill0IO = iOIOill.I00000oIO;
/* 9 */             ArrayList arrayList = new ArrayList();
/* 12 */            oIo0loI111I1.I00000oOI(ill0IO, arrayList);
/* 15 */            Iterator it = arrayList.iterator();
/* 23 */            while (it.hasNext()) {
/* 29 */                OIo0il oIo0il = (OIo0il) it.next();
/* 33 */                if ((oIo0il instanceof IIIOiol) && (iOIO1OO1l10lI001lIiIIo1O = ((IIIOiol) oIo0il).I00l0I0l0lO1.I001lIiIIo1O(iOIOill)) != null) {
/* 45 */                    return iOIO1OO1l10lI001lIiIIo1O;
                        }
                    }
/* 46 */            return null;
                }

                public synchronized void I00II0Ol1O0l(O0OIIIoOilol o0OIIIoOilol) {
                    O0OOlOII0l0 o0OOlOII0l0I00IioO0OiOi;
                    synchronized (this) {
/* 11 */                o0OOlOII0l0I00IioO0OiOi = I00IioO0OiOi(OOoiolOO0i.I0000O(o0OIIIoOilol), o0OIIIoOilol.I001l0I00());
                    }
/* 18 */            O0OO1oo o0OO1oo = (O0OO1oo) this.I00iiI;
/* 20 */            o0OO1oo.I0000oI00();
/* 27 */            ((O0OOo0iol0I) o0OO1oo.I00iiI).I001iOo1i0O(o0OOlOII0l0I00IioO0OiOi);
                }

                @Override
                public void I00II0oii1o(Throwable th) throws SecurityException, IllegalArgumentException {
                    Object obj;
/* 3 */             IOiOol0 iOiOol0 = (IOiOol0) this.I00iiI;
/* 5 */             iOiOol0.getClass();
/* 12 */            I0100i i0100i = new I0100i(24);
/* 15 */            i0100i.I00iiI = iOiOol0;
/* 17 */            VarHandle.storeStoreFence();
/* 24 */            int i = 23;
/* 27 */            if (lOllIO.I00000oOI()) {
/* 29 */                i0100i.run();
                    } else {
/* 35 */                CountDownLatch countDownLatch = new CountDownLatch(1);
/* 44 */                Handler handler = new Handler(Looper.getMainLooper());
/* 49 */                Io11iII11ll io11iII11ll = new Io11iII11ll(i);
/* 52 */                io11iII11ll.I00iiI = i0100i;
/* 54 */                io11iII11ll.I00iiO = countDownLatch;
/* 56 */                VarHandle.storeStoreFence();
/* 65 */                lII1OI11o1I.I0000oI00("Unable to post to main thread", handler.post(io11iII11ll));
                        try {
/* 76 */                    if (!countDownLatch.await(30000L, TimeUnit.MILLISECONDS)) {
/* 217 */                       throw new IllegalStateException("Timeout to wait main thread execution");
                            }
                        } catch (InterruptedException e) {
/* 437 */                   throw new IOiIIo1l(e, 4);
                        }
                    }
/* 80 */            IIoIloi0 iIoIloi0 = (IIoIloi0) iOiOol0.I00io1l;
/* 82 */            if (iIoIloi0 != null) {
/* 86 */                CopyOnWriteArrayList copyOnWriteArrayList = iIoIloi0.I000o00OoI0I.I000o00OoI0I;
/* 90 */                IIOIlOoI111 iIOIlOoI111 = new IIOIlOoI111(i);
/* 93 */                iIOIlOoI111.I00iiI = iOiOol0;
/* 95 */                VarHandle.storeStoreFence();
/* 98 */                IOOii0O10Io0.I0010I0i(copyOnWriteArrayList, iIOIlOoI111);
/* 103 */               IIoIloi0 iIoIloi02 = (IIoIloi0) iOiOol0.I00io1l;
                        synchronized (iIoIloi02.I00000oOI) {
                            try {
/* 112 */                       iIoIloi02.I0000oI00.removeCallbacksAndMessages("retry_token");
/* 117 */                       int iI001lIiIIo1O = IIlIOloOOO.I001lIiIIo1O(iIoIloi02.I00100l0);
/* 122 */                       if (iI001lIiIIo1O == 0) {
/* 170 */                           iIoIloi02.I00100l0 = 5;
/* 172 */                           obj = Ioil1IIo.I00iiO;
                                } else {
/* 124 */                           if (iI001lIiIIo1O == 1) {
/* 169 */                               throw new IllegalStateException("CameraX could not be shutdown when it is initializing.");
                                    }
/* 126 */                           int i2 = 2;
/* 127 */                           if (iI001lIiIIo1O == 2 || iI001lIiIIo1O == 3) {
/* 133 */                               iIoIloi02.I00100l0 = 5;
/* 137 */                               IIoIloi0.I00000oIO(iIoIloi02.I0010I0i);
/* 142 */                               I0IOIlIOIII i0IOIlIOIII = new I0IOIlIOIII(i2);
/* 145 */                               i0IOIlIOIII.I00iiI = iIoIloi02;
/* 147 */                               VarHandle.storeStoreFence();
/* 154 */                               iIoIloi02.I00100o1O0lo = iOiiloIII0O.I00000oIO(i0IOIlIOIII);
                                    }
/* 156 */                           obj = iIoIloi02.I00100o1O0lo;
                                }
                            } finally {
                            }
                        }
                    } else {
/* 178 */               obj = Ioil1IIo.I00iiO;
                    }
                    synchronized (iOiOol0.I00iiO) {
/* 184 */               iOiOol0.I00iio = null;
/* 186 */               iOiOol0.I00ilO0 = obj;
/* 192 */               ((HashMap) iOiOol0.I00iiI).clear();
/* 199 */               ((HashSet) iOiOol0.I00ilI0I1).clear();
                    }
/* 203 */           iOiOol0.I00111O(null, null);
                }

                @Override
                public O0iI0IlO0iI I00IO1(IOIOill iOIOill, OI1Iio0ii1 oI1Iio0ii1) {
/* 1 */             return null;
                }

                @Override
                public Object I00IO1oi11O(String str) throws GeneralSecurityException {
/* 7 */             String[] strArr = {"GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt"};
/* 13 */            ArrayList arrayList = new ArrayList();
/* 18 */            for (int i = 0; i < 3; i++) {
/* 22 */                Provider provider = Security.getProvider(strArr[i]);
/* 26 */                if (provider != null) {
/* 28 */                    arrayList.add(provider);
                        }
                    }
/* 34 */            Iterator it = arrayList.iterator();
/* 38 */            Exception exc = null;
/* 43 */            while (it.hasNext()) {
                        try {
/* 55 */                    return ((Il0OlI) this.I00iiI).I0000oI00(str, (Provider) it.next());
                        } catch (Exception e) {
/* 61 */                    if (exc == null) {
/* 63 */                        exc = e;
                            }
                        }
                    }
/* 77 */            throw new GeneralSecurityException("No good Provider found.", exc);
                }

                public synchronized O0OOlOII0l0 I00IioO0OiOi(O0O1ioi11l0 o0O1ioi11l0, OIl1lli oIl1lli) {
                    int iI00000oIO;
                    synchronized (this) {
/* 3 */                 iI00000oIO = Ooll0Ooo1.I00000oIO();
/* 11 */                while (I00IoiI(iI00000oIO)) {
/* 13 */                    iI00000oIO = Ooll0Ooo1.I00000oIO();
                        }
                    }
/* 73 */            return (O0OOlOII0l0) o0OOII1oI00II0Ol1O0l.I00000oOI();
/* 23 */            if (oIl1lli == OIl1lli.UNKNOWN_PREFIX) {
/* 86 */                throw new GeneralSecurityException("unknown output prefix type");
                    }
/* 25 */            O0OOII1o o0OOII1oI00II0Ol1O0l = O0OOlOII0l0.I00II0Ol1O0l();
/* 29 */            o0OOII1oI00II0Ol1O0l.I0000oI00();
/* 36 */            ((O0OOlOII0l0) o0OOII1oI00II0Ol1O0l.I00iiI).I00II0oii1o(o0O1ioi11l0);
/* 39 */            o0OOII1oI00II0Ol1O0l.I0000oI00();
/* 46 */            ((O0OOlOII0l0) o0OOII1oI00II0Ol1O0l.I00iiI).I00IO1(iI00000oIO);
/* 49 */            o0OOII1oI00II0Ol1O0l.I0000oI00();
/* 56 */            ((O0OOlOII0l0) o0OOII1oI00II0Ol1O0l.I00iiI).I00IOO();
/* 59 */            o0OOII1oI00II0Ol1O0l.I0000oI00();
/* 66 */            ((O0OOlOII0l0) o0OOII1oI00II0Ol1O0l.I00iiI).I00IO1oi11O(oIl1lli);
/* 73 */            return (O0OOlOII0l0) o0OOII1oI00II0Ol1O0l.I00000oOI();
                }

                public void I00IlilI0i0i() {
/* 5 */             ((IOl1ool0) this.I00iiI).getClass();
                }

                public IlIIiO I00Io1lO(IOiOol0 iOiOol0, ArrayList arrayList, int i, List list) {
/* 5 */             if (i < arrayList.size()) {
/* 195 */               int i2 = i + 1;
/* 208 */               IlIIiO ilIIiOI00Io1lO = I00Io1lO(iOiOol0, arrayList, i2, IOOi0Ool1i.I00OI1(list, arrayList.get(i)));
                        return ilIIiOI00Io1lO instanceof IlIIO0I0l11 ? ilIIiOI00Io1lO : I00Io1lO(iOiOol0, arrayList, i2, list);
                    }
/* 13 */            LinkedHashSet linkedHashSetI0000oI00 = Oio0lI.I0000oI00((Set) iOiOol0.I00iio, list);
/* 17 */            linkedHashSetI0000oI00.toString();
/* 24 */            Objects.toString((List) iOiOol0.I00ilO0);
/* 30 */            l11I11lO.I0000O(3, "DefaultFeatureGroupResolver");
/* 41 */            ArrayList arrayList2 = new ArrayList(IOOi1I.I0000O(linkedHashSetI0000oI00, 10));
/* 44 */            Iterator it = linkedHashSetI0000oI00.iterator();
/* 52 */            while (it.hasNext()) {
/* 64 */                arrayList2.add(((Io1100oIo) it.next()).I00000oIO());
                    }
/* 74 */            Iterator it2 = IOOi0Ool1i.I001i1lo1io(arrayList2).iterator();
                    while (true) {
/* 82 */                if (it2.hasNext()) {
/* 88 */                    IlIIii1oO1IO ilIIii1oO1IO = (IlIIii1oO1IO) it2.next();
/* 92 */                    ArrayList arrayList3 = new ArrayList();
/* 103 */                   for (Object obj : linkedHashSetI0000oI00) {
/* 116 */                       if (((Io1100oIo) obj).I00000oIO() == ilIIii1oO1IO) {
/* 118 */                           arrayList3.add(obj);
                                }
                            }
/* 127 */                   if (arrayList3.size() > 1) {
                                break;
                            }
                        } else {
/* 132 */                   IIllOioOlolI iIllOioOlolI = (IIllOioOlolI) this.I00iiI;
/* 136 */                   Oi0Oooi oi0Oooi = new Oi0Oooi(linkedHashSetI0000oI00);
/* 139 */                   Iterator it3 = linkedHashSetI0000oI00.iterator();
                            while (true) {
/* 149 */                       if (it3.hasNext()) {
/* 155 */                           Io1100oIo io1100oIo = (Io1100oIo) it3.next();
/* 161 */                           if (!io1100oIo.I00000oOI(iIllOioOlolI, iOiOol0)) {
/* 163 */                               io1100oIo.toString();
/* 166 */                               l11I11lO.I0000O(3, "CameraInfoInternal");
                                        break;
                                    }
                                } else {
                                    try {
/* 170 */                               li0IolOol.I00000oIO(iIllOioOlolI, iOiOol0, oi0Oooi);
/* 177 */                               Oi0Oooi oi0Oooi2 = new Oi0Oooi(linkedHashSetI0000oI00);
/* 180 */                               IlIIO0I0l11 ilIIO0I0l11 = new IlIIO0I0l11();
/* 183 */                               ilIIO0I0l11.I00000oIO = oi0Oooi2;
/* 185 */                               VarHandle.storeStoreFence();
/* 188 */                               return ilIIO0I0l11;
                                    } catch (IIoIIOI0l1 | IllegalArgumentException unused) {
/* 189 */                               l11I11lO.I0000O(3, "CameraInfoInternal");
                                    }
                                }
                            }
                        }
                    }
/* 192 */           return IlIIO1OiIO.I00000oIO;
                }

                public synchronized IoIlOo1o0IIl I00Io1o110i() {
/* 12 */            return IoIlOo1o0IIl.I00111O((O0OOo0iol0I) ((O0OO1oo) this.I00iiI).I00000oOI());
                }

                public long I00IoO0() {
/* 3 */             Magnifier magnifier = (Magnifier) this.I00iiI;
/* 24 */            return (magnifier.getWidth() << 32) | (magnifier.getHeight() & 4294967295L);
                }

                public synchronized boolean I00IoiI(int i) {
/* 18 */            Iterator it = Collections.unmodifiableList(((O0OOo0iol0I) ((O0OO1oo) this.I00iiI).I00iiI).I001lllioOl()).iterator();
/* 26 */            while (it.hasNext()) {
/* 38 */                if (((O0OOlOII0l0) it.next()).I001l0I00() == i) {
/* 41 */                    return true;
                        }
                    }
/* 46 */            return false;
                }

                public O1OIll00i I00Iooi00oi() {
/* 14 */            return new O1OIll00i((BitSet) ((BitSet) this.I00iiI).clone(), 3);
                }

                public OlO0000lIOII I00O0i0ii(i01IIlI i01iili) {
/* 9 */             return (OlO0000lIOII) ((LinkedHashMap) this.I00iiI).remove(i01iili);
                }

                public List I00O0o1oo(String str) {
/* 3 */             LinkedHashMap linkedHashMap = (LinkedHashMap) this.I00iiI;
/* 7 */             LinkedHashMap linkedHashMap2 = new LinkedHashMap();
/* 22 */            for (Map.Entry entry : linkedHashMap.entrySet()) {
/* 42 */                if (O0000Ioio00.I0000O(((i01IIlI) entry.getKey()).I00000oIO, str)) {
/* 52 */                    linkedHashMap2.put(entry.getKey(), entry.getValue());
                        }
                    }
/* 62 */            Iterator it = linkedHashMap2.keySet().iterator();
/* 70 */            while (it.hasNext()) {
/* 78 */                linkedHashMap.remove((i01IIlI) it.next());
                    }
/* 88 */            return IOOi0Ool1i.I00iIi0i1o(linkedHashMap2.values());
                }

                /* JADX WARN: Removed duplicated region for block: B:35:0x00c0  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public Object I00O10llo(IO1010 io1010, IllOOo00lI illOOo00lI) {
                    Ol0OoiI1ioO ol0OoiI1ioO;
                    Oil1IOoo1lI oil1IOoo1lI;
/* 9 */             if (((I01O1lIi) this.I00iiI) == null) {
/* 14 */                OO1oio00IO.I00000oOI("Called runAndWatch on a manager that has been disposed of");
                    }
/* 19 */            I01O1lIi i01O1lIi = (I01O1lIi) this.I00iiI;
/* 23 */            if ((i01O1lIi instanceof Ol0OoiI1ioO) && (oil1IOoo1lI = (ol0OoiI1ioO = (Ol0OoiI1ioO) i01O1lIi).I00ilO0) != null && !oil1IOoo1lI.equals(io1010)) {
/* 40 */                OI0i0O1IiiIO oI0i0O1IiiIO = new OI0i0O1IiiIO(5);
/* 47 */                oI0i0O1IiiIO.I00iiI = lO0oOIoolo.I00000oOI();
/* 54 */                oI0i0O1IiiIO.I00iiO = new ArrayList();
/* 61 */                oI0i0O1IiiIO.I00iio = new OI10I1IoI0Ol();
/* 67 */                O1IIii o1IIii = new O1IIii(12);
/* 70 */                o1IIii.I00iiI = oI0i0O1IiiIO;
/* 72 */                VarHandle.storeStoreFence();
/* 77 */                Ol1l1lI1Ili.I00000oOI(Ol1l1lI1Ili.I00000oIO);
                        synchronized (Ol1l1lI1Ili.I0000Il00O) {
/* 91 */                    Ol1l1lI1Ili.I000O01llI0 = IOOi0Ool1i.I00OI1(Ol1l1lI1Ili.I000O01llI0, o1IIii);
                        }
/* 98 */                I0IOIlIOIII i0IOIlIOIII = new I0IOIlIOIII(27);
/* 101 */               i0IOIlIOIII.I00iiI = o1IIii;
/* 103 */               VarHandle.storeStoreFence();
/* 106 */               oI0i0O1IiiIO.I00ilI0I1 = i0IOIlIOIII;
/* 108 */               VarHandle.storeStoreFence();
/* 111 */               Oil1IOoo1lI oil1IOoo1lI2 = ol0OoiI1ioO.I00ilO0;
/* 113 */               if (oil1IOoo1lI2 == null) {
/* 118 */                   OO1oio00IO.I00000oOI("promote must only be called when a manager is managing subscriptions for one channel and needs to start managing them for a second");
                        }
/* 121 */               OI10IIO oi10iio = ol0OoiI1ioO.I00iio;
/* 123 */               if (oi10iio == null) {
/* 127 */                   oI0i0O1IiiIO.I010OIo1l(oil1IOoo1lI2, ol0OoiI1ioO.I00iiI);
                        } else {
/* 131 */                   Object[] objArr = oi10iio.I00000oOI;
/* 133 */                   long[] jArr = oi10iio.I00000oIO;
                            int length = jArr.length - 2;
/* 138 */                   if (length >= 0) {
/* 141 */                       int i = 0;
                                while (true) {
/* 142 */                           long j = jArr[i];
/* 156 */                           if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
/* 165 */                               int i2 = 8 - ((~(i - length)) >>> 31);
/* 168 */                               for (int i3 = 0; i3 < i2; i3++) {
/* 177 */                                   if ((255 & j) < 128) {
/* 184 */                                       oI0i0O1IiiIO.I010OIo1l(oil1IOoo1lI2, objArr[(i << 3) + i3]);
                                            }
/* 187 */                                   j >>= 8;
                                        }
/* 191 */                               if (i2 != 8) {
                                            break;
                                        }
/* 193 */                               if (i == length) {
                                            break;
                                        }
/* 195 */                               i++;
                                    }
                                }
                            }
                        }
/* 198 */               oI0i0O1IiiIO.I00o0l1o1o0();
/* 201 */               ol0OoiI1ioO.I00o101lO();
/* 204 */               this.I00iiI = oI0i0O1IiiIO;
                    }
/* 212 */           I01O1lIi i01O1lIi2 = (I01O1lIi) this.I00iiI;
/* 222 */           Ol1il1o1 ol1il1o1I001IIilI0O = Ol1l1lI1Ili.I000O01llI0().I001IIilI0O(i01O1lIi2.I00oo1iO0ll(io1010));
/* 226 */           i01O1lIi2.I00o0iI0io1(io1010);
                    try {
/* 229 */               Ol1il1o1 ol1il1o1I000OiO = ol1il1o1I001IIilI0O.I000OiO();
                        try {
/* 233 */                   Object objInvoke = illOOo00lI.invoke();
/* 240 */                   ol1il1o1I001IIilI0O.I0000Il00O();
/* 243 */                   i01O1lIi2.I00o0l1o1o0();
/* 246 */                   return objInvoke;
                        } finally {
/* 250 */                   Ol1il1o1.I00100o1O0lo(ol1il1o1I000OiO);
                        }
                    } catch (Throwable th) {
/* 254 */               ol1il1o1I001IIilI0O.I0000Il00O();
/* 332 */               throw th;
                    }
                }

                public void I00OI1(IooO1IOlo iooO1IOlo) {
/* 13 */            ((Region) this.I00iiI).set(iooO1IOlo.I00000oIO, iooO1IOlo.I00000oOI, iooO1IOlo.I0000Il00O, iooO1IOlo.I0000O);
                }

                public OlO0000lIOII I00OIO1(i01IIlI i01iili) {
/* 3 */             LinkedHashMap linkedHashMap = (LinkedHashMap) this.I00iiI;
/* 5 */             Object olO0000lIOII = linkedHashMap.get(i01iili);
/* 9 */             if (olO0000lIOII == null) {
/* 13 */                olO0000lIOII = new OlO0000lIOII(i01iili);
/* 16 */                linkedHashMap.put(i01iili, olO0000lIOII);
                    }
/* 19 */            return (OlO0000lIOII) olO0000lIOII;
                }

                public void I00OIl() {
/* 3 */             Ioi1Io1o ioi1Io1o = (Ioi1Io1o) this.I00iiI;
                    synchronized (ioi1Io1o.I0010o) {
                        try {
/* 15 */                    Integer num = (Integer) ioi1Io1o.I0010o.getAndSet(null);
/* 17 */                    if (num == null) {
/* 20 */                        return;
                            }
/* 31 */                    if (num.intValue() != ioi1Io1o.I00IOO()) {
/* 33 */                        ioi1Io1o.I00Io1lO();
                            }
                        } catch (Throwable th) {
/* 55 */                    throw th;
                        }
                    }
                }

                public String toString() {
                    switch (this.I00iOIl) {
                        case PoseLandmark.RIGHT_INDEX:
/* 15 */                    StringBuilder sb = new StringBuilder("{ FamilyKind = ");
/* 20 */                    byte[] bArr = (byte[]) this.I00iiI;
/* 25 */                    sb.append((int) bArr[0]);
/* 30 */                    sb.append(", SerifStyle = ");
/* 36 */                    sb.append((int) bArr[1]);
/* 41 */                    sb.append(", Weight = ");
/* 47 */                    sb.append((int) bArr[2]);
/* 52 */                    sb.append(", Proportion = ");
/* 58 */                    sb.append((int) bArr[3]);
/* 63 */                    sb.append(", Contrast = ");
/* 69 */                    sb.append((int) bArr[4]);
/* 74 */                    sb.append(", StrokeVariation = ");
/* 80 */                    sb.append((int) bArr[5]);
/* 85 */                    sb.append(", ArmStyle = ");
/* 91 */                    sb.append((int) bArr[6]);
/* 96 */                    sb.append(", Letterform = ");
/* 102 */                   sb.append((int) bArr[7]);
/* 107 */                   sb.append(", Midline = ");
/* 114 */                   sb.append((int) bArr[8]);
/* 119 */                   sb.append(", XHeight = ");
/* 128 */                   return IIl001iO0Io.I000lI(bArr[9], "}", sb);
                        default:
/* 6 */                     return super.toString();
                    }
                }

/* 8 */         public IIloOI(int i) {
/* 9 */             this.I00iOIl = i;
                }

                @Override
/* 19 */        public void I000OOo1O() {
                }

                @Override
/* 36 */        public void I001IO000(OI1Iio0ii1 oI1Iio0ii1, IOIOo1o iOIOo1o) {
                }

                @Override
/* 97 */        public void I001iOo1i0O(OI1Iio0ii1 oI1Iio0ii1, IOIOill iOIOill, OI1Iio0ii1 oI1Iio0ii12) {
                }
            }
