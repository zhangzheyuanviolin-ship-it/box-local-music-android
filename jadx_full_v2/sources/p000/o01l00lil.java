            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.UUID;
            
            public final class o01l00lil {
                public OOol0l1I1 I00000oIO;
                public OOol0l1I1 I00000oOI;
                public UUID I0000Il00O;
                public long I0000O;
                public byte I0000oI00;

                public final o01l1oO11i I00000oIO() {
                    OOol0l1I1 oOol0l1I1;
                    OOol0l1I1 oOol0l1I12;
                    UUID uuid;
/* 4 */             if (this.I0000oI00 == 1 && (oOol0l1I1 = this.I00000oIO) != null && (oOol0l1I12 = this.I00000oOI) != null && (uuid = this.I0000Il00O) != null) {
/* 21 */                long j = this.I0000O;
/* 23 */                o01l1oO11i o01l1oo11i = new o01l1oO11i();
/* 26 */                o01l1oo11i.I00000oIO = oOol0l1I1;
/* 28 */                o01l1oo11i.I00000oOI = oOol0l1I12;
/* 30 */                o01l1oo11i.I0000Il00O = uuid;
/* 32 */                o01l1oo11i.I0000O = j;
/* 34 */                VarHandle.storeStoreFence();
/* 37 */                return o01l1oo11i;
                    }
/* 40 */            StringBuilder sb = new StringBuilder();
/* 45 */            if (this.I00000oIO == null) {
/* 49 */                sb.append(" spansNames");
                    }
/* 54 */            if (this.I00000oOI == null) {
/* 58 */                sb.append(" extras");
                    }
/* 63 */            if (this.I0000Il00O == null) {
/* 67 */                sb.append(" rootTraceId");
                    }
/* 72 */            if (this.I0000oI00 == 0) {
/* 76 */                sb.append(" rootDurationMs");
                    }
/* 89 */            I000II.I001IO000("Missing required properties:".concat(sb.toString()));
/* 92 */            return null;
                }
            }
