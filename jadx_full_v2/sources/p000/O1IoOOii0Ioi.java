            package p000;

            import java.util.ArrayList;
            
/* 26 */    public class O1IoOOii0Ioi {
                public static final IIlOoolol0ll I000O01llI0 = new IIlOoolol0ll();
                public O1IoiiO0o1 I00000oIO;
                public String I00000oOI;
                public O1IooO I0000Il00O;
                public O1IooO I0000O;
                public O1Ill10 I0000oI00;
                public final ArrayList I0001Ioi1lo;
                public OI1IO0IiiI I000II;

                public O1IoOOii0Ioi(O1IoiiO0o1 o1IoiiO0o1, String str) {
/* 4 */             this.I00000oIO = o1IoiiO0o1;
/* 6 */             this.I00000oOI = str;
/* 10 */            this.I0000oI00 = O1Ill10.I00iOIl;
/* 17 */            this.I0001Ioi1lo = new ArrayList();
/* 25 */            this.I000II = new OI1IO0IiiI(0, 0);
                }

                public O1IoOOii0Ioi I00000oIO() throws O1Ooo1IIioo {
/* 7 */             O1IoOOii0Ioi o1IoOOii0Ioi = new O1IoOOii0Ioi(this.I00000oIO, this.I00000oOI);
/* 10 */            I00000oOI(o1IoOOii0Ioi);
/* 29 */            return o1IoOOii0Ioi;
                }

                public final void I00000oOI(O1IoOOii0Ioi o1IoOOii0Ioi) throws O1Ooo1IIioo {
/* 1 */             O1IooO o1IooO = this.I0000O;
/* 3 */             if (o1IooO != null) {
/* 9 */                 o1IoOOii0Ioi.I000II(o1IooO.I00000oOI());
                    }
/* 12 */            O1IooO o1IooO2 = this.I0000Il00O;
/* 14 */            if (o1IooO2 != null) {
/* 20 */                o1IoOOii0Ioi.I000O01llI0(o1IooO2.I00000oOI());
                    }
/* 29 */            if (!o1IoOOii0Ioi.I0001Ioi1lo.isEmpty()) {
/* 46 */                I000II.I000iOII("Failed requirement.");
                    } else {
/* 33 */                o1IoOOii0Ioi.I0000oI00 = this.I0000oI00;
/* 41 */                o1IoOOii0Ioi.I000II = OI1IO0IiiI.I00000oIO(this.I000II);
                    }
                }

                public O1IoOOii0Ioi I0000Il00O() throws O1Ooo1IIioo {
/* 1 */             O1IoOOii0Ioi o1IoOOii0IoiI00000oIO = I00000oIO();
/* 5 */             I0000O(o1IoOOii0IoiI00000oIO);
/* 29 */            return o1IoOOii0IoiI00000oIO;
                }

                public final void I0000O(O1IoOOii0Ioi o1IoOOii0Ioi) throws O1Ooo1IIioo {
/* 4 */             if (this.I0000Il00O != null) {
/* 6 */                 O1IooO o1IooO = o1IoOOii0Ioi.I0000Il00O;
/* 16 */                o1IoOOii0Ioi.I000O01llI0(o1IooO != null ? o1IooO.I0000Il00O() : null);
                    }
/* 21 */            if (this.I0000O != null) {
/* 23 */                O1IooO o1IooO2 = o1IoOOii0Ioi.I0000O;
/* 31 */                o1IoOOii0Ioi.I000II(o1IooO2 != null ? o1IooO2.I0000Il00O() : null);
                    }
/* 36 */            o1IoOOii0Ioi.I0000oI00 = this.I0000oI00;
/* 44 */            o1IoOOii0Ioi.I000II = OI1IO0IiiI.I00000oIO(this.I000II);
                }

                public final void I0000oI00(O1IoOOii0Ioi o1IoOOii0Ioi) throws O1Ooo1IIioo {
/* 1 */             ArrayList arrayList = o1IoOOii0Ioi.I0001Ioi1lo;
/* 5 */             if (this.I0000O != null) {
/* 120 */               IoOOl0iOl1io.I001iOo1i0O("Cannot fuse into an atom which has a subscript: ", this);
/* 186 */               return;
                    }
/* 9 */             if (this.I0000Il00O != null) {
/* 114 */               IoOOl0iOl1io.I001iOo1i0O("Cannot fuse into an atom which has a superscript: ", this);
/* 117 */               return;
                    }
/* 15 */            if (this.I00000oIO != o1IoOOii0Ioi.I00000oIO) {
/* 111 */               throw new O1Ooo1IIioo("Only atoms of the same type can be fused: " + this + " " + o1IoOOii0Ioi);
                    }
/* 17 */            ArrayList arrayList2 = this.I0001Ioi1lo;
/* 23 */            if (arrayList2.isEmpty()) {
/* 29 */                arrayList2.add(I00000oIO());
                    }
/* 36 */            if (arrayList.isEmpty()) {
/* 49 */                arrayList2.add(o1IoOOii0Ioi);
                    } else {
/* 45 */                IOOii0O10Io0.I00100o1O0lo(arrayList2, arrayList.toArray(new O1IoOOii0Ioi[0]));
                    }
/* 60 */            this.I00000oOI = Oi010OO0.I00111O(this.I00000oOI, o1IoOOii0Ioi.I00000oOI);
                    this.I000II.I00000oOI += o1IoOOii0Ioi.I000II.I00000oOI;
/* 75 */            I000II(o1IoOOii0Ioi.I0000O);
/* 80 */            I000O01llI0(o1IoOOii0Ioi.I0000Il00O);
                }

                public final boolean I0001Ioi1lo() {
                    return this.I00000oIO.compareTo(O1IoiiO0o1.I00oII) < 0;
                }

                public final void I000II(O1IooO o1IooO) throws O1Ooo1IIioo {
/* 5 */             if (I0001Ioi1lo()) {
/* 7 */                 this.I0000O = o1IooO;
                    } else {
/* 12 */                IoOOl0iOl1io.I001iOo1i0O("Subscripts not allowed for atom ", this);
                    }
                }

                public final void I000O01llI0(O1IooO o1IooO) throws O1Ooo1IIioo {
/* 5 */             if (I0001Ioi1lo()) {
/* 7 */                 this.I0000Il00O = o1IooO;
                    } else {
/* 12 */                IoOOl0iOl1io.I001iOo1i0O("Superscripts not allowed for atom ", this);
                    }
                }

/* 27 */        public O1IoOOii0Ioi(O1IoiiO0o1 o1IoiiO0o1, char c) {
/* 28 */            this(o1IoiiO0o1, String.valueOf(c));
                }
            }
