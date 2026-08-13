            package p000;

            import java.util.LinkedHashMap;
            
            public final class IIl0l10l {
                public Object I00000oIO;
                public LinkedHashMap I00000oOI;

                public final void I00000oIO(boolean z, String str, int i) {
                    OoooIIOo10 ooooIIOo10;
                    synchronized (this.I00000oIO) {
/* 14 */                ooooIIOo10 = (OoooIIOo10) this.I00000oOI.get(IIllI0o.I00000oIO(str));
                    }
/* 17 */            if (ooooIIOo10 == null) {
/* 19 */                return;
                    }
/* 27 */            ooooIIOo10.I00000oOI.I00000oIO(new Io0oll10il(i, z));
                }
            }
