            package p000;

            import androidx.work.impl.model.WorkSpec;
            
            public final class I1ool0o implements IOo0i1o {
                public final I1oolIoOllO I00000oIO;
                public final int I00000oOI;

                public I1ool0o(I1oolIoOllO i1oolIoOllO, int i) {
/* 1 */             this.I00000oOI = i;
/* 6 */             this.I00000oIO = i1oolIoOllO;
                }

                @Override
                public final IIiOO0o I00000oIO(IOo0o10i1IO iOo0o10i1IO) {
/* 9 */             return ilOl0O00Il0i.I00000oIO(new I00oI0i(this, (IOoil1iiIilo) null, 9));
                }

                @Override
                public final boolean I00000oOI(WorkSpec workSpec) {
                    switch (this.I00000oOI) {
                        case 0:
/* 18 */                    return workSpec.constraints.I0000Il00O;
                        case 1:
/* 13 */                    return workSpec.constraints.I0000oI00;
                        default:
/* 8 */                     return workSpec.constraints.I0001Ioi1lo;
                    }
                }
            }
