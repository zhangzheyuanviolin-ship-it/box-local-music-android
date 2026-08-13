            package p000;

            import kotlin.jvm.functions.Function1;
            
/* 100 */   public final class I10i01 {
                public final OoIoOiiO1 I00000oIO;
                public final Object I00000oOI;
                public final I110IiI1I1 I0000Il00O;
                public final OIooliIO0 I0000O;
                public final OIooliIO0 I0000oI00;
                public final OI11i1OO I0001Ioi1lo;
                public final OlIOiI1iI1 I000II;
                public final I110ooool I000O01llI0;
                public final I110ooool I000OOo1O;
                public I110ooool I000OiO;
                public I110ooool I000iOII;

                public I10i01(Object obj, OoIoOiiO1 ooIoOiiO1, Object obj2) {
/* 4 */             this.I00000oIO = ooIoOiiO1;
/* 6 */             this.I00000oOI = obj2;
/* 13 */            I110IiI1I1 i110IiI1I1 = new I110IiI1I1(ooIoOiiO1, obj, null, 60);
/* 16 */            this.I0000Il00O = i110IiI1I1;
/* 24 */            this.I0000O = lOO00IiI0li.I00000oIO(Boolean.FALSE);
/* 30 */            this.I0000oI00 = lOO00IiI0li.I00000oIO(obj);
/* 37 */            this.I0001Ioi1lo = new OI11i1OO();
/* 45 */            this.I000II = new OlIOiI1iI1(obj2, 3);
/* 47 */            I110ooool i110ooool = i110IiI1I1.I00iiO;
/* 49 */            boolean z = i110ooool instanceof I110iOiOllO;
/* 70 */            I110ooool i110ooool2 = z ? O1OI1ll1Il0i.I0001Ioi1lo : i110ooool instanceof I110ilOOl0io ? O1OI1ll1Il0i.I000II : i110ooool instanceof I110io ? O1OI1ll1Il0i.I000O01llI0 : O1OI1ll1Il0i.I000OOo1O;
/* 72 */            this.I000O01llI0 = i110ooool2;
/* 93 */            I110ooool i110ooool3 = z ? O1OI1ll1Il0i.I00000oOI : i110ooool instanceof I110ilOOl0io ? O1OI1ll1Il0i.I0000Il00O : i110ooool instanceof I110io ? O1OI1ll1Il0i.I0000O : O1OI1ll1Il0i.I0000oI00;
/* 95 */            this.I000OOo1O = i110ooool3;
/* 97 */            this.I000OiO = i110ooool2;
/* 99 */            this.I000iOII = i110ooool3;
                }

                public static Object I00000oIO(I10i01 i10i01, Object obj, I110IiI0o1Il i110IiI0o1Il, Float f, Function1 function1, IOoil1iiIilo iOoil1iiIilo, int i) {
/* 3 */             if ((i & 2) != 0) {
/* 5 */                 i110IiI0o1Il = i10i01.I000II;
                    }
/* 7 */             I110IiI0o1Il i110IiI0o1Il2 = i110IiI0o1Il;
                    Object objInvoke = f;
/* 10 */            if ((i & 4) != 0) {
/* 20 */                objInvoke = i10i01.I00000oIO.I00000oOI.invoke(i10i01.I0000Il00O.I00iiO);
                    }
/* 26 */            if ((i & 8) != 0) {
/* 28 */                function1 = null;
                    }
/* 30 */            Object objI0000O = i10i01.I0000O();
/* 34 */            OoIoOiiO1 ooIoOiiO1 = i10i01.I00000oIO;
/* 66 */            return OI11i1OO.I00000oIO(i10i01.I0001Ioi1lo, new I10Ol0iIoi(i10i01, objInvoke, new OloIIOlO(i110IiI0o1Il2, ooIoOiiO1, objI0000O, obj, (I110ooool) ooIoOiiO1.I00000oIO.invoke(objInvoke)), i10i01.I0000Il00O.I00iio, function1, null), iOoil1iiIilo);
                }

                public final Object I00000oOI(Object obj) {
/* 9 */             if (!O0000Ioio00.I0000O(this.I000OiO, this.I000O01llI0) || !O0000Ioio00.I0000O(this.I000iOII, this.I000OOo1O)) {
/* 22 */                OoIoOiiO1 ooIoOiiO1 = this.I00000oIO;
/* 30 */                I110ooool i110ooool = (I110ooool) ooIoOiiO1.I00000oIO.invoke(obj);
/* 32 */                int iI00000oOI = i110ooool.I00000oOI();
/* 37 */                boolean z = false;
/* 38 */                for (int i = 0; i < iI00000oOI; i++) {
/* 52 */                    if (i110ooool.I00000oIO(i) < this.I000OiO.I00000oIO(i) || i110ooool.I00000oIO(i) > this.I000iOII.I00000oIO(i)) {
/* 88 */                        i110ooool.I0000oI00(i, lIiioliIlo.I00000oOI(i110ooool.I00000oIO(i), this.I000OiO.I00000oIO(i), this.I000iOII.I00000oIO(i)));
/* 91 */                        z = true;
                            }
                        }
/* 95 */                if (z) {
/* 99 */                    return ooIoOiiO1.I00000oOI.invoke(i110ooool);
                        }
                    }
/* 168 */           return obj;
                }

                public final void I0000Il00O() {
/* 1 */             I110IiI1I1 i110IiI1I1 = this.I0000Il00O;
/* 5 */             i110IiI1I1.I00iiO.I0000O();
/* 10 */            i110IiI1I1.I00iio = Long.MIN_VALUE;
/* 16 */            this.I0000O.setValue(Boolean.FALSE);
                }

                public final Object I0000O() {
/* 5 */             return this.I0000Il00O.I00iiI.getValue();
                }

                public final boolean I0000oI00() {
/* 9 */             return ((Boolean) this.I0000O.getValue()).booleanValue();
                }

                public final Object I0001Ioi1lo(IOoil1iiIilo iOoil1iiIilo, Object obj) {
/* 10 */            Object objI00000oIO = OI11i1OO.I00000oIO(this.I0001Ioi1lo, new I10OloIi(this, obj, null, 0), iOoil1iiIilo);
                    return objI00000oIO == Ii0111o.I00iOIl ? objI00000oIO : OoiIlOl1iI.I00000oIO;
                }

                public final Object I000II(Oll0io oll0io) {
/* 10 */            Object objI00000oIO = OI11i1OO.I00000oIO(this.I0001Ioi1lo, new I10OoO(this, null, 0), oll0io);
                    return objI00000oIO == Ii0111o.I00iOIl ? objI00000oIO : OoiIlOl1iI.I00000oIO;
                }

/* 101 */       public I10i01(Object obj, OoIoOiiO1 ooIoOiiO1, Object obj2, int i) {
/* 102 */           this(obj, ooIoOiiO1, (i & 4) != 0 ? null : obj2);
                }
            }
