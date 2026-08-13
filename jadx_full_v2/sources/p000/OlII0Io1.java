            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class OlII0Io1 {
                public CharSequence I00000oIO;
                public OlIIOI0o I00000oOI;

                public static OlII0Io1 I00000oIO(CharSequence charSequence, OlIIOI0o olIIOI0o) {
/* 3 */             OlII0Io1 olII0Io1 = new OlII0Io1();
/* 6 */             if (charSequence == null) {
/* 18 */                IOOlIIilOl0.I000II("content must not be null");
/* 21 */                return null;
                    }
/* 8 */             olII0Io1.I00000oIO = charSequence;
/* 10 */            olII0Io1.I00000oOI = olIIOI0o;
/* 12 */            VarHandle.storeStoreFence();
/* 15 */            return olII0Io1;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final OlII0Io1 I00000oOI(int i, int i2) {
                    OlIIOI0o olIIOI0oI00000oIO;
/* 3 */             CharSequence charSequenceSubSequence = this.I00000oIO.subSequence(i, i2);
/* 7 */             OlIIOI0o olIIOI0o = this.I00000oOI;
/* 9 */             if (olIIOI0o != null) {
/* 14 */                int i3 = i2 - i;
/* 24 */                olIIOI0oI00000oIO = i3 != 0 ? OlIIOI0o.I00000oIO(olIIOI0o.I00000oIO, olIIOI0o.I00000oOI + i, i3) : null;
                    }
/* 25 */            return I00000oIO(charSequenceSubSequence, olIIOI0oI00000oIO);
                }
            }
