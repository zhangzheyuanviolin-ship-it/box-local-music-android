            package p000;

            import android.content.Context;
            import com.google.ai.edge.gallery.data.ModelDownloadStatusType;
            import java.io.File;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.List;
            import java.util.ListIterator;
            import java.util.concurrent.atomic.AtomicLong;
            import kotlin.Metadata;
            import kotlin.jvm.functions.Function1;
            
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LOOl1OlI0;", "LOooioIIoi0O;", "app"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
            public final class OOl1OlI0 extends OooioIIoi0O {
                public Context I00000oOI;
                public OOiool1 I0000Il00O;
                public Oo0oIo00ioo I0000O;
                public OOl0lo I0000oI00;
                public OOli1O I0001Ioi1lo;
                public OlO0OIIl1 I000II;
                public OOli1O I000O01llI0;
                public OlO0OIIl1 I000OOo1O;
                public OOli1O I000OiO;
                public OlO0OIIl1 I000iOII;
                public OOli1O I000l1;
                public OlO0OIIl1 I000lI;
                public OOli1O I000o00OoI0I;
                public OlO0OIIl1 I000oI1ioi;
                public OOli1O I00100l0;
                public AtomicLong I00100o1O0lo;
                public OlIl0i I0010I0i;
                public I1I0i0Ilo1Oi I0010o;

                @Override
                public final void I0000O() {
/* 1 */             OlIl0i olIl0i = this.I0010I0i;
/* 4 */             if (olIl0i != null) {
/* 6 */                 olIl0i.I000II(null);
                    }
/* 9 */             I1I0i0Ilo1Oi i1I0i0Ilo1Oi = this.I0010o;
/* 11 */            if (i1I0i0Ilo1Oi != null) {
/* 13 */                i1I0i0Ilo1Oi.I00IO1();
                    }
/* 16 */            this.I0010o = null;
                }

                public final void I0000oI00(String str, O1ol100o0O o1ol100o0O) {
                    Object value;
                    Object value2;
/* 1 */             OlO0OIIl1 olO0OIIl1 = this.I000iOII;
/* 3 */             AtomicLong atomicLong = this.I00100o1O0lo;
/* 9 */             if (OlOoOIi0o.I001l0I00(str) || ((Boolean) this.I000lI.getValue()).booleanValue()) {
/* 332 */               return;
                    }
/* 33 */            OOl1IO oOl1IO = (OOl1IO) this.I000OOo1O.getValue();
/* 37 */            if (oOl1IO instanceof OOl11i0l) {
/* 41 */                String str2 = ((OOl11i0l) oOl1IO).I00000oIO;
/* 45 */                OOio11 oOio11 = new OOio11();
/* 48 */                oOio11.I00000oIO = str2;
/* 50 */                VarHandle.storeStoreFence();
/* 53 */                OlO0OIIl1 olO0OIIl12 = this.I000oI1ioi;
/* 55 */                I1I0i0Ilo1Oi i1I0i0Ilo1Oi = this.I0010o;
/* 58 */                if (i1I0i0Ilo1Oi == null) {
/* 64 */                    OloIl1l1oOii oloIl1l1oOiiI001i1O0Ol = o1ol100o0O.I001i1O0Ol("llm_chat");
/* 68 */                    if (oloIl1l1oOiiI001i1O0Ol == null) {
/* 70 */                        i1I0i0Ilo1Oi = null;
                            } else {
/* 77 */                        String str3 = (String) olO0OIIl12.getValue();
/* 79 */                        ArrayList arrayList = oloIl1l1oOiiI001i1O0Ol.I000OiO;
/* 84 */                        II1liooilI iI1liooilI = new II1liooilI(5);
/* 87 */                        iI1liooilI.I00iiI = str3;
/* 89 */                        VarHandle.storeStoreFence();
/* 104 */                       for (O1oIOiI11o0 o1oIOiI11o0 : IOOi0Ool1i.I00Ol1ll1(arrayList, iI1liooilI)) {
/* 130 */                           O1oIo0iI00 o1oIo0iI00 = (O1oIo0iI00) ((O1oiOloOo) o1ol100o0O.I000OOo1O.I00iOIl.getValue()).I0000Il00O.get(o1oIOiI11o0.I00000oIO);
/* 140 */                           if ((o1oIo0iI00 != null ? o1oIo0iI00.I00000oIO : null) == ModelDownloadStatusType.SUCCEEDED) {
/* 146 */                               String strI00000oOI = o1oIOiI11o0.I00000oOI(this.I00000oOI, o1oIOiI11o0.I000OiO);
/* 159 */                               if (new File(strI00000oOI).exists()) {
/* 163 */                                   olO0OIIl12.I000l1(o1oIOiI11o0.I00000oIO);
/* 169 */                                   i1I0i0Ilo1Oi = new I1I0i0Ilo1Oi(4);
/* 172 */                                   i1I0i0Ilo1Oi.I00iiI = strI00000oOI;
/* 178 */                                   I0OIOO00l0O i0OIOO00l0O = new I0OIOO00l0O(10);
/* 181 */                                   i0OIOO00l0O.I00iiI = i1I0i0Ilo1Oi;
/* 183 */                                   VarHandle.storeStoreFence();
/* 191 */                                   i1I0i0Ilo1Oi.I00iiO = new OllO00oiil(i0OIOO00l0O);
/* 193 */                                   VarHandle.storeStoreFence();
/* 196 */                                   this.I0010o = i1I0i0Ilo1Oi;
                                            break;
                                        }
                                    }
                                }
/* 70 */                        i1I0i0Ilo1Oi = null;
                            }
                        }
/* 199 */               if (i1I0i0Ilo1Oi == null) {
/* 201 */                   long andIncrement = atomicLong.getAndIncrement();
/* 229 */                   do {
/* 205 */                       value2 = olO0OIIl1.getValue();
/* 229 */                   } while (!olO0OIIl1.I000iOII(value2, IOOi0Ool1i.I00OI1((List) value2, new OOio00(false, "No AI model found. Download a model in AI Chat first, then return here.", andIncrement))));
/* 332 */                   return;
                        }
/* 232 */               OlIl0i olIl0i = this.I0010I0i;
/* 234 */               if (olIl0i != null) {
/* 236 */                   olIl0i.I000II(null);
                        }
/* 246 */               OOio00 oOio00 = new OOio00(true, str, atomicLong.getAndIncrement());
/* 257 */               OOio00 oOio002 = new OOio00(false, "", atomicLong.getAndIncrement());
/* 281 */               do {
/* 260 */                   value = olO0OIIl1.getValue();
/* 281 */               } while (!olO0OIIl1.I000iOII(value, IOOi0Ool1i.I00OI1(IOOi0Ool1i.I00OI1((List) value, oOio00), oOio002)));
/* 285 */               Oo0oIo00ioo oo0oIo00ioo = this.I0000O;
/* 287 */               OOl0lo oOl0lo = this.I0000oI00;
/* 291 */               IOO000ilo iOO000ilo = new IOO000ilo(26);
/* 294 */               iOO000ilo.I00iiI = oo0oIo00ioo;
/* 296 */               iOO000ilo.I00iiO = oOl0lo;
/* 298 */               iOO000ilo.I00iio = i1I0i0Ilo1Oi;
/* 300 */               VarHandle.storeStoreFence();
/* 321 */               this.I0010I0i = iOi1II01i0.I0000O(OooiooIOO.I00000oIO(this), null, null, new O1o1iI(iOO000ilo, str, oOio11, this, (IOoil1iiIilo) null, 6), 3);
                    }
                }

                public final void I0001Ioi1lo(Function1 function1) {
                    Object value;
                    List list;
                    int iNextIndex;
/* 1 */             OlO0OIIl1 olO0OIIl1 = this.I000iOII;
/* 66 */            do {
/* 3 */                 value = olO0OIIl1.getValue();
/* 8 */                 list = (List) value;
/* 14 */                ListIterator listIterator = list.listIterator(list.size());
                        while (true) {
/* 22 */                    if (!listIterator.hasPrevious()) {
/* 39 */                        iNextIndex = -1;
                                break;
                            } else if (!((OOio00) listIterator.previous()).I00000oOI) {
/* 34 */                        iNextIndex = listIterator.nextIndex();
                                break;
                            }
                        }
/* 40 */                if (iNextIndex >= 0) {
/* 47 */                    ArrayList arrayList = new ArrayList(list);
/* 58 */                    arrayList.set(iNextIndex, function1.invoke(arrayList.get(iNextIndex)));
/* 61 */                    list = arrayList;
                        }
/* 66 */            } while (!olO0OIIl1.I000iOII(value, list));
                }
            }
