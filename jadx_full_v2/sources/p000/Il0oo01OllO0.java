            package p000;

            import java.util.Arrays;
            import java.util.List;
            
/* 47 */    public final class Il0oo01OllO0 extends Ol0O0iI0l0O {
                public final OoOIOoO1I I00iiI;
                public final Il0ol1 I00iiO;
                public final Il0ooO1IO I00iio;
                public final List I00ilI0I1;
                public final boolean I00ilO0;
                public final String[] I00io1l;
                public final String I00ioIO;

                public Il0oo01OllO0(OoOIOoO1I ooOIOoO1I, Il0ol1 il0ol1, Il0ooO1IO il0ooO1IO, List list, boolean z, String... strArr) {
/* 4 */             this.I00iiI = ooOIOoO1I;
/* 6 */             this.I00iiO = il0ol1;
/* 8 */             this.I00iio = il0ooO1IO;
/* 10 */            this.I00ilI0I1 = list;
/* 12 */            this.I00ilO0 = z;
/* 14 */            this.I00io1l = strArr;
/* 16 */            String str = il0ooO1IO.I00iOIl;
/* 19 */            Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length);
/* 32 */            this.I00ioIO = String.format(str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
                }

                @Override
                public final O1iil1I01o I00IoiI() {
/* 1 */             return this.I00iiO;
                }

                @Override
                public final List I00OIl() {
/* 1 */             return this.I00ilI0I1;
                }

                @Override
                public final OoOI1i1i I00OloOo() {
/* 3 */             OoOI1i1i.I00iiI.getClass();
/* 6 */             return OoOI1i1i.I00iiO;
                }

                @Override
                public final OoOIOoO1I I00iOIl() {
/* 1 */             return this.I00iiI;
                }

                @Override
                public final boolean I00iiI() {
/* 1 */             return this.I00ilO0;
                }

                @Override
                public final Ol0O0iI0l0O I00li1OI(boolean z) {
/* 3 */             String[] strArr = this.I00io1l;
/* 22 */            return new Il0oo01OllO0(this.I00iiI, this.I00iiO, this.I00iio, this.I00ilI0I1, z, (String[]) Arrays.copyOf(strArr, strArr.length));
                }

                @Override
/* 48 */        public final O0iIl1 I00ll1(O0iIoIOO0O0 o0iIoIOO0O0) {
/* 49 */            return this;
                }

                @Override
/* 48 */        public final Ooioo0o1l0 I00ll1(O0iIoIOO0O0 o0iIoIOO0O0) {
/* 49 */            return this;
                }

                @Override
/* 48 */        public final Ooioo0o1l0 I00lli11(OoOI1i1i ooOI1i1i) {
/* 49 */            return this;
                }

                @Override
/* 48 */        public final Ol0O0iI0l0O I00lli11(OoOI1i1i ooOI1i1i) {
/* 49 */            return this;
                }
            }
