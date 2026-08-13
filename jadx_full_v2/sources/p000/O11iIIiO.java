            package p000;

            import com.google.ai.edge.litertlm.Contents;
            import java.util.ArrayList;
            import java.util.LinkedHashMap;
            import java.util.List;
            
            public final class O11iIIiO extends Oll0io implements IlliIl1l11O {
                public int I00iOIl;
                public final O11iO00I1o I00iiI;
                public final O1oIOiI11o0 I00iiO;
                public final boolean I00iio;
                public final boolean I00ilI0I1;
                public final Contents I00ilO0;
                public final List I00io1l;
                public final boolean I00ioIO;
                public final IllOOo00lI I00l0I0l0lO1;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public O11iIIiO(O11iO00I1o o11iO00I1o, O1oIOiI11o0 o1oIOiI11o0, boolean z, boolean z2, Contents contents, List list, boolean z3, IllOOo00lI illOOo00lI, IOoil1iiIilo iOoil1iiIilo) {
/* 18 */            super(2, iOoil1iiIilo);
/* 1 */             this.I00iiI = o11iO00I1o;
/* 3 */             this.I00iiO = o1oIOiI11o0;
/* 5 */             this.I00iio = z;
/* 7 */             this.I00ilI0I1 = z2;
/* 9 */             this.I00ilO0 = contents;
/* 11 */            this.I00io1l = list;
/* 13 */            this.I00ioIO = z3;
/* 15 */            this.I00l0I0l0lO1 = illOOo00lI;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 20 */            return new O11iIIiO(this.I00iiI, this.I00iiO, this.I00iio, this.I00ilI0I1, this.I00ilO0, this.I00io1l, this.I00ioIO, this.I00l0I0l0lO1, iOoil1iiIilo);
                }

                @Override
                public final Object invoke(Object obj, Object obj2) {
/* 13 */            return ((O11iIIiO) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(OoiIlOl1iI.I00000oIO);
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
                    Object value;
/* 3 */             Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 5 */             int i = this.I00iOIl;
/* 10 */            O1oIOiI11o0 o1oIOiI11o0 = this.I00iiO;
/* 12 */            O11iO00I1o o11iO00I1o = this.I00iiI;
/* 14 */            if (i == 0) {
/* 28 */                lIoii1l01l0i.I00000oOI(obj);
/* 31 */                o11iO00I1o.I000l1(true);
/* 34 */                o11iO00I1o.I0001Ioi1lo = null;
/* 40 */                o11iO00I1o.I000O01llI0.remove(o1oIOiI11o0.I00000oIO);
/* 43 */                OlO0OIIl1 olO0OIIl1 = o11iO00I1o.I00000oOI;
/* 55 */                LinkedHashMap linkedHashMap = new LinkedHashMap(((IO1looOIi) olO0OIIl1.getValue()).I0000O);
/* 65 */                linkedHashMap.put(o1oIOiI11o0.I00000oIO, new ArrayList());
/* 94 */                do {
/* 68 */                    value = olO0OIIl1.getValue();
/* 94 */                } while (!olO0OIIl1.I000iOII(value, IO1looOIi.I00000oIO((IO1looOIi) olO0OIIl1.getValue(), false, false, false, linkedHashMap, 23)));
/* 102 */               if (o11iO00I1o.I0001Ioi1lo(o1oIOiI11o0) instanceof IO1i11) {
/* 104 */                   o11iO00I1o.I000OOo1O(o1oIOiI11o0);
                        }
/* 107 */               o11iO00I1o.I000iOII(false);
/* 114 */               l1Oo0iIiO1i.I00000oIO(o1oIOiI11o0).I0000oI00(o1oIOiI11o0);
                    } else {
/* 16 */                if (i != 1) {
/* 24 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 7 */                     return null;
                        }
/* 18 */                lIoii1l01l0i.I00000oOI(obj);
                    }
/* 157 */           do {
                        try {
/* 135 */                   O11il1ilio1o.I000O01llI0(l1Oo0iIiO1i.I00000oIO(o1oIOiI11o0), this.I00iiO, this.I00iio, this.I00ilI0I1, this.I00ilO0, this.I00io1l, this.I00ioIO, 64);
/* 138 */                   o11iO00I1o.I000l1(false);
/* 143 */                   this.I00l0I0l0lO1.invoke();
/* 146 */                   return OoiIlOl1iI.I00000oIO;
                        } catch (Exception unused) {
/* 149 */                   this.I00iOIl = 1;
                        }
/* 157 */           } while (il0l1o1l.I00000oOI(200L, this) != ii0111o);
/* 168 */           return ii0111o;
                }
            }
