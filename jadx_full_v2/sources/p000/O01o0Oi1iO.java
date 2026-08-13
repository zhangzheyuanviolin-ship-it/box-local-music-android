            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.Iterator;
            import java.util.Map;
            import java.util.Set;
            import java.util.concurrent.ConcurrentHashMap;
            
/* 9 */     public class O01o0Oi1iO extends I011lO1liO1O {
                public final O01ioO1o0i11 I0001Ioi1lo;
                public final OilOloI I000II;
                public int I000O01llI0;
                public boolean I000OOo1O;

                public O01o0Oi1iO(O011OoiO1 o011OoiO1, O01ioO1o0i11 o01ioO1o0i11, String str, int i) {
/* 7 */             this(o011OoiO1, o01ioO1o0i11, (i & 4) != 0 ? null : str, (OilOloI) null);
                }

                @Override
                public final IOl1ii1loO I00000oOI(OilOloI oilOloI) {
/* 1 */             OilOloI oilOloI2 = this.I000II;
/* 3 */             if (oilOloI != oilOloI2) {
/* 113 */               return super.I00000oOI(oilOloI);
                    }
/* 7 */             O01O0o1iI o01O0o1iII00IO1oi11O = I00IO1oi11O();
/* 11 */            String strI00000oIO = oilOloI2.I00000oIO();
/* 15 */            boolean z = o01O0o1iII00IO1oi11O instanceof O01ioO1o0i11;
/* 17 */            O011OoiO1 o011OoiO1 = this.I0000Il00O;
/* 19 */            if (z) {
/* 109 */               return new O01o0Oi1iO(o011OoiO1, (O01ioO1o0i11) o01O0o1iII00IO1oi11O, this.I0000O, oilOloI2);
                    }
/* 25 */            StringBuilder sb = new StringBuilder("Expected ");
/* 28 */            OOoOl1001II oOoOl1001II = OOoOl0i.I00000oIO;
/* 40 */            sb.append(oOoOl1001II.I00000oOI(O01ioO1o0i11.class).I000oI1ioi());
/* 45 */            sb.append(", but had ");
/* 60 */            sb.append(oOoOl1001II.I00000oOI(o01O0o1iII00IO1oi11O.getClass()).I000oI1ioi());
/* 104 */           throw new O01Io1OOi(l0I0OO0.I00000oOI(-1, IIl001iO0Io.I00100l0(sb, " as the serialized body of ", strI00000oIO), I00OIl(), null, o011OoiO1.I00000oIO.I000OOo1O ? l0I0OO0.I0000oI00(-1, o01O0o1iII00IO1oi11O.toString()).toString() : null));
                }

                @Override
                public int I000II(OilOloI oilOloI) {
/* 7 */             while (this.I000O01llI0 < oilOloI.I0000oI00()) {
/* 9 */                 int i = this.I000O01llI0;
/* 13 */                this.I000O01llI0 = i + 1;
/* 15 */                String strI00O10llo = I00O10llo(oilOloI, i);
/* 22 */                int i2 = this.I000O01llI0 - 1;
/* 24 */                this.I000OOo1O = false;
/* 34 */                if (!I00OI1().containsKey(strI00O10llo)) {
/* 42 */                    boolean z = (this.I0000Il00O.I00000oIO.I0000O || oilOloI.I000OOo1O(i2) || !oilOloI.I000O01llI0(i2).I0000Il00O()) ? false : true;
/* 62 */                    this.I000OOo1O = z;
/* 64 */                    if (z) {
                            }
                        }
/* 66 */                return i2;
                    }
/* 67 */            return -1;
                }

                @Override
                public void I000oI1ioi(OilOloI oilOloI) {
                    Set setI0000oI00;
/* 1 */             O011OoiO1 o011OoiO1 = this.I0000Il00O;
/* 7 */             if (O01iI00o.I0000Il00O(o011OoiO1, oilOloI) || (oilOloI.I000oI1ioi() instanceof OO1l1i)) {
/* 186 */               return;
                    }
/* 19 */            O01iI00o.I0000O(o011OoiO1, oilOloI);
/* 27 */            if (this.I0000oI00.I000II) {
/* 34 */                Set setI00000oIO = iO0IO0O.I00000oIO(oilOloI);
/* 48 */                Map map = (Map) ((ConcurrentHashMap) o011OoiO1.I0000Il00O.I00iiI).get(oilOloI);
/* 59 */                Object obj = map != null ? map.get(O01iI00o.I00000oIO) : null;
/* 60 */                if (obj == null) {
/* 62 */                    obj = null;
                        }
/* 63 */                Map map2 = (Map) obj;
/* 72 */                Set setKeySet = map2 != null ? map2.keySet() : null;
/* 73 */                if (setKeySet == null) {
/* 75 */                    setKeySet = Il01llIol0.I00iOIl;
                        }
/* 79 */                setI0000oI00 = Oio0lI.I0000oI00(setI00000oIO, setKeySet);
                    } else {
/* 29 */                setI0000oI00 = iO0IO0O.I00000oIO(oilOloI);
                    }
/* 101 */           for (String str : I00OI1().I00iOIl.keySet()) {
/* 113 */               if (!setI0000oI00.contains(str) && !O0000Ioio00.I0000O(str, this.I0000O)) {
/* 169 */                   throw new O01Io1OOi(l0I0OO0.I00000oOI(-1, IIl001iO0Io.I000iOII('\'', "Encountered an unknown key '", str), I00OIl(), "Use 'ignoreUnknownKeys = true' in 'Json {}' builder or '@JsonIgnoreUnknownKeys' annotation to ignore unknown keys.", o011OoiO1.I00000oIO.I000OOo1O ? l0I0OO0.I0000oI00(-1, I00OI1().toString()).toString() : null));
                        }
                    }
                }

                @Override
                public final boolean I001IO000() {
                    return !this.I000OOo1O && super.I001IO000();
                }

                @Override
                public O01O0o1iI I00IO1(String str) {
/* 9 */             return (O01O0o1iI) O1Oii0O0loo.I00000oOI(str, I00OI1());
                }

                @Override
                public String I00O0o1oo(OilOloI oilOloI, int i) {
/* 1 */             O011OoiO1 o011OoiO1 = this.I0000Il00O;
/* 3 */             O01iI00o.I0000O(o011OoiO1, oilOloI);
/* 6 */             String strI0001Ioi1lo = oilOloI.I0001Ioi1lo(i);
/* 14 */            if (this.I0000oI00.I000II && !I00OI1().I00iOIl.keySet().contains(strI0001Ioi1lo)) {
/* 36 */                O1OIll00i o1OIll00i = o011OoiO1.I0000Il00O;
/* 42 */                IO1Io1IOOOIi iO1Io1IOOOIi = new IO1Io1IOOOIi(24);
/* 45 */                iO1Io1IOOOIi.I00iiI = oilOloI;
/* 47 */                iO1Io1IOOOIi.I00iiO = o011OoiO1;
/* 49 */                VarHandle.storeStoreFence();
/* 54 */                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) o1OIll00i.I00iiI;
/* 60 */                Map map = (Map) concurrentHashMap.get(oilOloI);
/* 62 */                Object obj = null;
/* 63 */                loilIl10Ii loilil10ii = O01iI00o.I00000oIO;
/* 72 */                Object objInvoke = map != null ? map.get(loilil10ii) : null;
/* 73 */                if (objInvoke == null) {
/* 75 */                    objInvoke = null;
                        }
/* 76 */                if (objInvoke == null) {
/* 79 */                    objInvoke = iO1Io1IOOOIi.invoke();
/* 83 */                    Object concurrentHashMap2 = concurrentHashMap.get(oilOloI);
/* 87 */                    if (concurrentHashMap2 == null) {
/* 92 */                        concurrentHashMap2 = new ConcurrentHashMap(2);
/* 95 */                        concurrentHashMap.put(oilOloI, concurrentHashMap2);
                            }
/* 100 */                   ((Map) concurrentHashMap2).put(loilil10ii, objInvoke);
                        }
/* 103 */               Map map2 = (Map) objInvoke;
/* 117 */               Iterator it = I00OI1().I00iOIl.keySet().iterator();
                        while (true) {
/* 125 */                   if (!it.hasNext()) {
                                break;
                            }
/* 127 */                   Object next = it.next();
/* 138 */                   Integer num = (Integer) map2.get((String) next);
/* 140 */                   if (num != null && num.intValue() == i) {
/* 149 */                       obj = next;
                                break;
                            }
                        }
/* 150 */               String str = (String) obj;
/* 152 */               if (str != null) {
/* 154 */                   return str;
                        }
                    }
/* 551 */           return strI0001Ioi1lo;
                }

                @Override
                public O01ioO1o0i11 I00OI1() {
/* 1 */             return this.I0001Ioi1lo;
                }

/* 10 */        public O01o0Oi1iO(O011OoiO1 o011OoiO1, O01ioO1o0i11 o01ioO1o0i11, String str, OilOloI oilOloI) {
/* 11 */            super(o011OoiO1, str);
/* 12 */            this.I0001Ioi1lo = o01ioO1o0i11;
/* 13 */            this.I000II = oilOloI;
                }
            }
