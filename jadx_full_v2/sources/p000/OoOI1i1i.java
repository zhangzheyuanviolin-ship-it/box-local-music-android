            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Map;
            import java.util.concurrent.ConcurrentHashMap;
            import java.util.concurrent.atomic.AtomicInteger;
            
            public final class OoOI1i1i implements Iterable, O0IlIoi {
                public static final IIlio101Io I00iiI;
                public static final OoOI1i1i I00iiO;
                public final I1IlollII1lI I00iOIl;

                static {
/* 5 */             IIlio101Io iIlio101Io = new IIlio101Io(29);
/* 13 */            iIlio101Io.I00iiI = new ConcurrentHashMap();
/* 21 */            iIlio101Io.I00iiO = new AtomicInteger(0);
/* 23 */            VarHandle.storeStoreFence();
/* 26 */            I00iiI = iIlio101Io;
/* 35 */            I00iiO = new OoOI1i1i(Il01100l.I00iOIl);
                }

                public OoOI1i1i(List list) {
/* 6 */             this.I00iOIl = Il00Ill.I00iOIl;
/* 8 */             Iterator it = list.iterator();
/* 16 */            while (it.hasNext()) {
/* 22 */                I11O0Ol i11O0Ol = (I11O0Ol) it.next();
/* 24 */                i11O0Ol.getClass();
/* 41 */                int iI00oI0i = I00iiI.I00oI0i(OOoOl0i.I00000oIO.I00000oOI(I11O0Ol.class).I000O01llI0());
/* 47 */                int iI00000oOI = this.I00iOIl.I00000oOI();
/* 53 */                if (iI00000oOI != 0) {
/* 56 */                    if (iI00000oOI == 1) {
/* 59 */                        I1IlollII1lI i1IlollII1lI = this.I00iOIl;
                                try {
/* 61 */                            OIi0Oio oIi0Oio = (OIi0Oio) i1IlollII1lI;
/* 63 */                            int i = oIi0Oio.I00iiI;
/* 65 */                            if (i == iI00oI0i) {
/* 72 */                                this.I00iOIl = new OIi0Oio(iI00oI0i, i11O0Ol);
                                    } else {
/* 81 */                                I1Io0li1Ol1I i1Io0li1Ol1I = new I1Io0li1Ol1I();
/* 84 */                                i1Io0li1Ol1I.I00iOIl = new Object[20];
/* 86 */                                i1Io0li1Ol1I.I00iiI = 0;
/* 90 */                                i1Io0li1Ol1I.I0000O(i, oIi0Oio.I00iOIl);
/* 93 */                                this.I00iOIl = i1Io0li1Ol1I;
                                    }
                                } catch (ClassCastException e) {
/* 108 */                           IoOOl0iOl1io.I000l1(I00000oOI(i1IlollII1lI, 1, "OneElementArrayMap"), e);
/* 111 */                           throw null;
                                }
                            }
/* 97 */                    this.I00iOIl.I0000O(iI00oI0i, i11O0Ol);
                        } else {
/* 112 */                   I1IlollII1lI i1IlollII1lI2 = this.I00iOIl;
/* 116 */                   if (!(i1IlollII1lI2 instanceof Il00Ill)) {
/* 132 */                       I000II.I001IO000(I00000oOI(i1IlollII1lI2, 0, "EmptyArrayMap"));
/* 135 */                       throw null;
                            }
/* 123 */                   this.I00iOIl = new OIi0Oio(iI00oI0i, i11O0Ol);
                        }
                    }
                }

                public static String I00000oOI(I1IlollII1lI i1IlollII1lI, int i, String str) {
/* 30 */            StringBuilder sb = new StringBuilder("Race condition happened, the size of ArrayMap is " + i + " but it isn't an `" + str + '`');
/* 35 */            sb.append('\n');
/* 42 */            StringBuilder sb2 = new StringBuilder("Type: ");
/* 49 */            sb2.append(i1IlollII1lI.getClass());
/* 56 */            sb.append(sb2.toString());
/* 59 */            sb.append('\n');
/* 64 */            StringBuilder sb3 = new StringBuilder();
/* 71 */            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) I00iiI.I00iiI;
/* 75 */            sb3.append("[\n");
/* 84 */            ArrayList arrayList = new ArrayList(IOOi1I.I0000O(i1IlollII1lI, 10));
/* 91 */            int i2 = 0;
/* 96 */            for (Object obj : i1IlollII1lI) {
/* 102 */               int i3 = i2 + 1;
/* 104 */               Object obj2 = null;
/* 105 */               if (i2 < 0) {
/* 186 */                   IOOi1I.I000lI();
/* 189 */                   throw null;
                        }
/* 113 */               Iterator it = concurrentHashMap.entrySet().iterator();
                        while (true) {
/* 121 */                   if (it.hasNext()) {
/* 123 */                       Object next = it.next();
/* 140 */                       if (((Number) ((Map.Entry) next).getValue()).intValue() == i2) {
/* 142 */                           obj2 = next;
                                    break;
                                }
                            }
                        }
/* 175 */               sb3.append("  " + ((Map.Entry) obj2) + '[' + i2 + "]: " + obj);
/* 178 */               sb3.append('\n');
/* 181 */               arrayList.add(sb3);
/* 184 */               i2 = i3;
                    }
/* 192 */           sb3.append("]");
/* 195 */           sb3.append('\n');
/* 208 */           sb.append("Content: ".concat(sb3.toString()));
/* 211 */           sb.append('\n');
/* 214 */           return sb.toString();
                }

                public final boolean isEmpty() {
                    return this.I00iOIl.I00000oOI() == 0;
                }

                @Override
                public final Iterator iterator() {
/* 3 */             return this.I00iOIl.iterator();
                }
            }
