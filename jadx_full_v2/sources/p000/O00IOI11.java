            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.Collections;
            import java.util.IdentityHashMap;
            import java.util.LinkedHashMap;
            import java.util.Locale;
            import java.util.Map;
            import java.util.concurrent.atomic.AtomicBoolean;
            import java.util.concurrent.locks.ReentrantLock;
            import kotlin.jvm.functions.Function1;
            
            public final class O00IOI11 {
                public final Oi1oIiOiIi0 I00000oIO;
                public final OoIlIoo1oiOo I00000oOI;
                public final LinkedHashMap I0000Il00O;
                public final ReentrantLock I0000O;
                public final Iloi111 I0000oI00;
                public final Iloi111 I0001Ioi1lo;
                public final IIlio101Io I000II;
                public final Object I000O01llI0;

                public O00IOI11(Oi1oIiOiIi0 oi1oIiOiIi0, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, String... strArr) {
/* 4 */             this.I00000oIO = oi1oIiOiIi0;
/* 8 */             boolean z = oi1oIiOiIi0.I000iOII;
/* 23 */            I00oII i00oII = new I00oII(1, this, O00IOI11.class, "notifyInvalidatedObservers", "notifyInvalidatedObservers(Ljava/util/Set;)V", 0, 9);
/* 26 */            int i = 0;
/* 27 */            OoIlIoo1oiOo ooIlIoo1oiOo = new OoIlIoo1oiOo(i);
/* 30 */            ooIlIoo1oiOo.I00iiO = oi1oIiOiIi0;
/* 32 */            ooIlIoo1oiOo.I00iio = linkedHashMap2;
/* 34 */            ooIlIoo1oiOo.I00iiI = z;
/* 36 */            ooIlIoo1oiOo.I00ilO0 = i00oII;
/* 43 */            ooIlIoo1oiOo.I00l0OO0IO = new AtomicBoolean(false);
/* 52 */            ooIlIoo1oiOo.I00li1OI = new OlOiIoII(14);
/* 56 */            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
/* 59 */            ooIlIoo1oiOo.I00ilI0I1 = linkedHashMap3;
/* 61 */            int length = strArr.length;
/* 62 */            String[] strArr2 = new String[length];
/* 64 */            while (i < length) {
/* 66 */                String str = strArr[i];
/* 68 */                Locale locale = Locale.ROOT;
/* 70 */                String lowerCase = str.toLowerCase(locale);
/* 78 */                linkedHashMap3.put(lowerCase, Integer.valueOf(i));
/* 87 */                String str2 = (String) linkedHashMap.get(strArr[i]);
/* 96 */                String lowerCase2 = str2 != null ? str2.toLowerCase(locale) : null;
/* 97 */                if (lowerCase2 != null) {
/* 100 */                   lowerCase = lowerCase2;
                        }
/* 101 */               strArr2[i] = lowerCase;
/* 103 */               i++;
                    }
/* 106 */           ooIlIoo1oiOo.I00io1l = strArr2;
/* 120 */           for (Map.Entry entry : linkedHashMap.entrySet()) {
/* 132 */               String str3 = (String) entry.getValue();
/* 134 */               Locale locale2 = Locale.ROOT;
/* 136 */               String lowerCase3 = str3.toLowerCase(locale2);
/* 144 */               if (linkedHashMap3.containsKey(lowerCase3)) {
/* 160 */                   linkedHashMap3.put(((String) entry.getKey()).toLowerCase(locale2), O1Oii0O0loo.I00000oOI(lowerCase3, linkedHashMap3));
                        }
                    }
/* 166 */           int length2 = strArr2.length;
/* 167 */           OIOiiiloOio oIOiiiloOio = new OIOiiiloOio();
/* 175 */           oIOiiiloOio.I00000oIO = new ReentrantLock();
/* 179 */           oIOiiiloOio.I00000oOI = new long[length2];
/* 183 */           oIOiiiloOio.I0000Il00O = new boolean[length2];
/* 190 */           oIOiiiloOio.I0000oI00 = new ReentrantLock();
/* 192 */           VarHandle.storeStoreFence();
/* 195 */           ooIlIoo1oiOo.I00ioIO = oIOiiiloOio;
/* 199 */           int length3 = strArr2.length;
/* 200 */           Ii1OIo10 ii1OIo10 = new Ii1OIo10();
/* 209 */           ii1OIo10.I00000oIO = OlO0iOl0il.I00000oIO(new int[length3]);
/* 211 */           VarHandle.storeStoreFence();
/* 214 */           ooIlIoo1oiOo.I00l0I0l0lO1 = ii1OIo10;
/* 216 */           VarHandle.storeStoreFence();
/* 219 */           this.I00000oOI = ooIlIoo1oiOo;
/* 226 */           this.I0000Il00O = new LinkedHashMap();
/* 233 */           this.I0000O = new ReentrantLock();
/* 239 */           Iloi111 iloi111 = new Iloi111(19);
/* 242 */           VarHandle.storeStoreFence();
/* 245 */           this.I0000oI00 = iloi111;
/* 251 */           Iloi111 iloi1112 = new Iloi111(20);
/* 254 */           VarHandle.storeStoreFence();
/* 257 */           this.I0001Ioi1lo = iloi1112;
/* 261 */           Oi1oIiOiIi0 oi1oIiOiIi02 = this.I00000oIO;
/* 265 */           IIlio101Io iIlio101Io = new IIlio101Io(15);
/* 268 */           iIlio101Io.I00iiI = oi1oIiOiIi02;
/* 279 */           iIlio101Io.I00iiO = Collections.newSetFromMap(new IdentityHashMap());
/* 281 */           VarHandle.storeStoreFence();
/* 284 */           this.I000II = iIlio101Io;
/* 291 */           this.I000O01llI0 = new Object();
/* 296 */           IlIi0Il ilIi0Il = new IlIi0Il(6);
/* 299 */           ilIi0Il.I00iiI = this;
/* 301 */           VarHandle.storeStoreFence();
/* 304 */           ooIlIoo1oiOo.I00li1OI = ilIi0Il;
                }

                public final Oi1oO0Iooi1o I00000oIO(String[] strArr, boolean z, Function1 function1) {
                    Ii00l101O ii00l101OI000O01llI0;
/* 3 */             this.I00000oOI.I00100l0(strArr);
/* 8 */             IIlio101Io iIlio101Io = this.I000II;
/* 12 */            Oi1oIiOiIi0 oi1oIiOiIi0 = (Oi1oIiOiIi0) iIlio101Io.I00iiI;
/* 14 */            Oi1oO0Iooi1o oi1oO0Iooi1o = new Oi1oO0Iooi1o();
/* 17 */            oi1oO0Iooi1o.I000l1 = oi1oIiOiIi0;
/* 19 */            oi1oO0Iooi1o.I000lI = iIlio101Io;
/* 21 */            oi1oO0Iooi1o.I000o00OoI0I = z;
/* 28 */            oi1oO0Iooi1o.I000oI1ioi = new Oi1oO1(strArr, oi1oO0Iooi1o);
/* 36 */            oi1oO0Iooi1o.I00100l0 = new AtomicBoolean(true);
/* 44 */            oi1oO0Iooi1o.I00100o1O0lo = new AtomicBoolean(false);
/* 51 */            oi1oO0Iooi1o.I0010I0i = new AtomicBoolean(false);
/* 57 */            if (!oi1oIiOiIi0.I000iOII()) {
/* 78 */                ii00l101OI000O01llI0 = Il00o11.I00iOIl;
                    } else if (z) {
/* 61 */                ii00l101OI000O01llI0 = oi1oIiOiIi0.I00000oOI;
/* 63 */                if (ii00l101OI000O01llI0 == null) {
/* 68 */                    O0000Ioio00.I000OOo1O("transactionContext");
/* 72 */                    throw null;
                        }
                    } else {
/* 73 */                ii00l101OI000O01llI0 = oi1oIiOiIi0.I000O01llI0();
                    }
/* 80 */            oi1oO0Iooi1o.I0010o = ii00l101OI000O01llI0;
/* 82 */            oi1oO0Iooi1o.I00111O = function1;
/* 84 */            VarHandle.storeStoreFence();
/* 98 */            return oi1oO0Iooi1o;
                }
            }
