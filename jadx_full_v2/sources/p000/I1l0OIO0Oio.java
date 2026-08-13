            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class I1l0OIO0Oio {
                public static final I1l0OIO0Oio I0001Ioi1lo;
                public long I00000oIO;
                public int I00000oOI;
                public int I0000Il00O;
                public long I0000O;
                public int I0000oI00;

                static {
/* 4 */             Long l = 10485760L;
/* 10 */            Integer num = 200;
/* 16 */            Integer num2 = 10000;
/* 23 */            Long l2 = 604800000L;
/* 30 */            Integer num3 = 81920;
/* 40 */            if (!"".isEmpty()) {
/* 89 */                I000II.I001IO000("Missing required properties:".concat(""));
/* 110 */               return;
                    }
/* 44 */            long jLongValue = l.longValue();
/* 48 */            int iIntValue = num.intValue();
/* 52 */            int iIntValue2 = num2.intValue();
/* 56 */            long jLongValue2 = l2.longValue();
/* 60 */            int iIntValue3 = num3.intValue();
/* 64 */            I1l0OIO0Oio i1l0OIO0Oio = new I1l0OIO0Oio();
/* 67 */            i1l0OIO0Oio.I00000oIO = jLongValue;
/* 69 */            i1l0OIO0Oio.I00000oOI = iIntValue;
/* 71 */            i1l0OIO0Oio.I0000Il00O = iIntValue2;
/* 73 */            i1l0OIO0Oio.I0000O = jLongValue2;
/* 75 */            i1l0OIO0Oio.I0000oI00 = iIntValue3;
/* 77 */            VarHandle.storeStoreFence();
/* 80 */            I0001Ioi1lo = i1l0OIO0Oio;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (obj == this) {
/* 1 */                 return true;
                    }
/* 8 */             if (obj instanceof I1l0OIO0Oio) {
/* 10 */                I1l0OIO0Oio i1l0OIO0Oio = (I1l0OIO0Oio) obj;
/* 18 */                if (this.I00000oIO == i1l0OIO0Oio.I00000oIO && this.I00000oOI == i1l0OIO0Oio.I00000oOI && this.I0000Il00O == i1l0OIO0Oio.I0000Il00O && this.I0000O == i1l0OIO0Oio.I0000O && this.I0000oI00 == i1l0OIO0Oio.I0000oI00) {
/* 1 */                     return true;
                        }
                    }
/* 7 */             return false;
                }

                public final int hashCode() {
/* 1 */             long j = this.I00000oIO;
/* 21 */            int i = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.I00000oOI) * 1000003) ^ this.I0000Il00O) * 1000003;
/* 22 */            long j2 = this.I0000O;
/* 33 */            return this.I0000oI00 ^ ((i ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003);
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("EventStoreConfig{maxStorageSizeInBytes=");
/* 10 */            sb.append(this.I00000oIO);
/* 15 */            sb.append(", loadBatchSize=");
/* 20 */            sb.append(this.I00000oOI);
/* 25 */            sb.append(", criticalSectionEnterTimeoutMs=");
/* 30 */            sb.append(this.I0000Il00O);
/* 35 */            sb.append(", eventCleanUpAge=");
/* 40 */            sb.append(this.I0000O);
/* 45 */            sb.append(", maxBlobByteSizePerRow=");
/* 52 */            return IIl001iO0Io.I000lI(this.I0000oI00, "}", sb);
                }
            }
