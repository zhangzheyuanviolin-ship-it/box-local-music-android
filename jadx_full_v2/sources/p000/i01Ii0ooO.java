            package p000;

            import java.util.HashSet;
            import java.util.UUID;
            
            public final class i01Ii0ooO {
                public final UUID I00000oIO;
                public final i01IOiO1lO I00000oOI;
                public final HashSet I0000Il00O;
                public final Ii11I1OOII1 I0000O;
                public final Ii11I1OOII1 I0000oI00;
                public final int I0001Ioi1lo;
                public final int I000II;
                public final IOo0o10i1IO I000O01llI0;
                public final long I000OOo1O;
                public final i01IOOI I000OiO;
                public final long I000iOII;
                public final int I000l1;

                public i01Ii0ooO(UUID uuid, i01IOiO1lO i01ioio1lo, HashSet hashSet, Ii11I1OOII1 ii11I1OOII1, Ii11I1OOII1 ii11I1OOII12, int i, int i2, IOo0o10i1IO iOo0o10i1IO, long j, i01IOOI i01iooi, long j2, int i3) {
/* 4 */             this.I00000oIO = uuid;
/* 6 */             this.I00000oOI = i01ioio1lo;
/* 8 */             this.I0000Il00O = hashSet;
/* 10 */            this.I0000O = ii11I1OOII1;
/* 12 */            this.I0000oI00 = ii11I1OOII12;
/* 14 */            this.I0001Ioi1lo = i;
/* 16 */            this.I000II = i2;
/* 18 */            this.I000O01llI0 = iOo0o10i1IO;
/* 20 */            this.I000OOo1O = j;
/* 22 */            this.I000OiO = i01iooi;
/* 24 */            this.I000iOII = j2;
/* 26 */            this.I000l1 = i3;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 3 */                 return true;
                    }
/* 5 */             if (obj == null || !i01Ii0ooO.class.equals(obj.getClass())) {
/* 134 */               return false;
                    }
/* 21 */            i01Ii0ooO i01ii0ooo = (i01Ii0ooO) obj;
/* 27 */            if (this.I0001Ioi1lo == i01ii0ooo.I0001Ioi1lo && this.I000II == i01ii0ooo.I000II && O0000Ioio00.I0000O(this.I00000oIO, i01ii0ooo.I00000oIO) && this.I00000oOI == i01ii0ooo.I00000oOI && O0000Ioio00.I0000O(this.I0000O, i01ii0ooo.I0000O) && this.I000O01llI0.equals(i01ii0ooo.I000O01llI0) && this.I000OOo1O == i01ii0ooo.I000OOo1O && O0000Ioio00.I0000O(this.I000OiO, i01ii0ooo.I000OiO) && this.I000iOII == i01ii0ooo.I000iOII && this.I000l1 == i01ii0ooo.I000l1 && this.I0000Il00O.equals(i01ii0ooo.I0000Il00O)) {
/* 129 */               return O0000Ioio00.I0000O(this.I0000oI00, i01ii0ooo.I0000oI00);
                    }
/* 134 */           return false;
                }

                public final int hashCode() {
/* 60 */            int iI0000O = IIlIOloOOO.I0000O(this.I000OOo1O, (this.I000O01llI0.hashCode() + ((((((this.I0000oI00.hashCode() + ((this.I0000Il00O.hashCode() + ((this.I0000O.hashCode() + ((this.I00000oOI.hashCode() + (this.I00000oIO.hashCode() * 31)) * 31)) * 31)) * 31)) * 31) + this.I0001Ioi1lo) * 31) + this.I000II) * 31)) * 31, 31);
/* 64 */            i01IOOI i01iooi = this.I000OiO;
/* 88 */            return Integer.hashCode(this.I000l1) + IIlIOloOOO.I0000O(this.I000iOII, (iI0000O + (i01iooi != null ? i01iooi.hashCode() : 0)) * 31, 31);
                }

                public final String toString() {
/* 123 */           return "WorkInfo{id='" + this.I00000oIO + "', state=" + this.I00000oOI + ", outputData=" + this.I0000O + ", tags=" + this.I0000Il00O + ", progress=" + this.I0000oI00 + ", runAttemptCount=" + this.I0001Ioi1lo + ", generation=" + this.I000II + ", constraints=" + this.I000O01llI0 + ", initialDelayMillis=" + this.I000OOo1O + ", periodicityInfo=" + this.I000OiO + ", nextScheduleTimeMillis=" + this.I000iOII + "}, stopReason=" + this.I000l1;
                }
            }
