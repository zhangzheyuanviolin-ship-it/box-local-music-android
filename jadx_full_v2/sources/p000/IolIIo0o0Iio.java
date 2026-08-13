            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class IolIIo0o0Iio {
                public boolean I00000oIO;
                public int I00000oOI;
                public Object I0000Il00O;
                public Object I0000O;

                public i0OloII1 I00000oIO() {
/* 5 */             boolean z = false;
/* 14 */            lII0I0I000I.I00000oIO("execute parameter required", ((OOooilOIIl0I) this.I0000Il00O) != null);
/* 21 */            IlIII1l[] ilIII1lArr = (IlIII1l[]) this.I0000O;
/* 23 */            boolean z2 = this.I00000oIO;
/* 25 */            int i = this.I00000oOI;
/* 27 */            i0OloII1 i0oloii1 = new i0OloII1(z);
/* 30 */            i0oloii1.I0001Ioi1lo = this;
/* 32 */            i0oloii1.I00000oOI = ilIII1lArr;
/* 34 */            if (ilIII1lArr != null && z2) {
/* 38 */                z = true;
                    }
/* 39 */            i0oloii1.I0000O = z;
/* 41 */            i0oloii1.I0000Il00O = i;
/* 43 */            VarHandle.storeStoreFence();
/* 55 */            return i0oloii1;
                }
            }
