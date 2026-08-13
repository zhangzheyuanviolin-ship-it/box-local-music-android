            package p000;

            import java.util.ArrayList;
            import java.util.Collection;
            import java.util.Iterator;
            
            public class Ooo00oi0O extends Ooo0IOOIl0 implements OIoioOli1I {
                public final int I00ilO0;
                public final boolean I00io1l;
                public final boolean I00ioIO;
                public final boolean I00l0I0l0lO1;
                public final O0iIl1 I00l0OO0IO;
                public final Ooo00oi0O I00li1OI;

                public Ooo00oi0O(IIiIoIl11IO iIiIoIl11IO, Ooo00oi0O ooo00oi0O, int i, I11IlOOO i11IlOOO, OI1Iio0ii1 oI1Iio0ii1, O0iIl1 o0iIl1, boolean z, boolean z2, boolean z3, O0iIl1 o0iIl12, OlI1o0ooI olI1o0ooI) {
/* 8 */             super(iIiIoIl11IO, i11IlOOO, oI1Iio0ii1, o0iIl1, olI1o0ooI);
/* 11 */            this.I00ilO0 = i;
/* 13 */            this.I00io1l = z;
/* 15 */            this.I00ioIO = z2;
/* 17 */            this.I00l0I0l0lO1 = z3;
/* 21 */            this.I00l0OO0IO = o0iIl12;
/* 26 */            this.I00li1OI = ooo00oi0O == null ? this : ooo00oi0O;
                }

                @Override
                public final Ii1i01oO10 I0000oI00(OoOilII0 ooOilII0) {
/* 7 */             if (ooOilII0.I00000oIO.I0000oI00()) {
/* 9 */                 return this;
                    }
/* 10 */            OIiilo1Ool0o.I000lI();
/* 13 */            return null;
                }

                @Override
                public final IiOiOloo0 I000OiO() {
/* 1 */             return IiOiioI.I0001Ioi1lo;
                }

                @Override
                public final Ii1Ool1 I000lI() {
/* 5 */             return (IIiIoIl11IO) super.I000lI();
                }

                @Override
                public final Collection I000o00OoI0I() {
/* 7 */             Collection collectionI000o00OoI0I = ((IIiIoIl11IO) super.I000lI()).I000o00OoI0I();
/* 21 */            ArrayList arrayList = new ArrayList(IOOi1I.I0000O(collectionI000o00OoI0I, 10));
/* 24 */            Iterator it = collectionI000o00OoI0I.iterator();
/* 32 */            while (it.hasNext()) {
/* 52 */                arrayList.add((Ooo00oi0O) ((IIiIoIl11IO) it.next()).I00Iooi00oi().get(this.I00ilO0));
                    }
/* 113 */           return arrayList;
                }

                @Override
                public final IOo0i1 I00Io1lO() {
/* 1 */             return null;
                }

                @Override
                public final Object I00IoIO0lI(Ii1i0IloI1 ii1i0IloI1, Object obj) {
/* 1 */             return ii1i0IloI1.I000O01llI0(this, obj);
                }

                @Override
                public final boolean I00OIo() {
/* 1 */             return false;
                }

                public Ooo00oi0O I010iIIOlo(Illlll00 illlll00, OI1Iio0ii1 oI1Iio0ii1, int i) {
/* 27 */            return new Ooo00oi0O(illlll00, null, i, getAnnotations(), oI1Iio0ii1, getType(), I010ioo(), this.I00ioIO, this.I00l0I0l0lO1, this.I00l0OO0IO, OlI1o0ooI.I00IO1);
                }

                public final boolean I010ioo() {
                    return this.I00io1l && ((IIiO00o1o) ((IIiIoIl11IO) super.I000lI())).I000oI1ioi() != 2;
                }

                public final IIiIoIl11IO I010l10O() {
/* 5 */             return (IIiIoIl11IO) super.I000lI();
                }

                @Override
                public final Ooo00oi0O I010i10l() {
/* 1 */             Ooo00oi0O ooo00oi0O = this.I00li1OI;
                    return ooo00oi0O == this ? this : ooo00oi0O.I010i10l();
                }
            }
