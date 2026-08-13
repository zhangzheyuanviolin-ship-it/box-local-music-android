            package p000;

            import androidx.work.impl.model.WorkSpec;
            import java.util.HashSet;
            import java.util.List;
            import java.util.UUID;
            
            public final class i01Ol11 {
                public final String I00000oIO;
                public final i01IOiO1lO I00000oOI;
                public final Ii11I1OOII1 I0000Il00O;
                public final long I0000O;
                public final long I0000oI00;
                public final long I0001Ioi1lo;
                public final IOo0o10i1IO I000II;
                public final int I000O01llI0;
                public final I1o1O1Ii1l0l I000OOo1O;
                public final long I000OiO;
                public final long I000iOII;
                public final int I000l1;
                public final int I000lI;
                public final long I000o00OoI0I;
                public final int I000oI1ioi;
                public final List I00100l0;
                public final List I00100o1O0lo;

                public i01Ol11(String str, i01IOiO1lO i01ioio1lo, Ii11I1OOII1 ii11I1OOII1, long j, long j2, long j3, IOo0o10i1IO iOo0o10i1IO, int i, I1o1O1Ii1l0l i1o1O1Ii1l0l, long j4, long j5, int i2, int i3, long j6, int i4, List list, List list2) {
/* 2 */             this.I00000oIO = str;
/* 3 */             this.I00000oOI = i01ioio1lo;
/* 4 */             this.I0000Il00O = ii11I1OOII1;
/* 5 */             this.I0000O = j;
/* 6 */             this.I0000oI00 = j2;
/* 7 */             this.I0001Ioi1lo = j3;
/* 8 */             this.I000II = iOo0o10i1IO;
/* 9 */             this.I000O01llI0 = i;
/* 10 */            this.I000OOo1O = i1o1O1Ii1l0l;
/* 11 */            this.I000OiO = j4;
/* 12 */            this.I000iOII = j5;
/* 13 */            this.I000l1 = i2;
/* 14 */            this.I000lI = i3;
/* 15 */            this.I000o00OoI0I = j6;
/* 16 */            this.I000oI1ioi = i4;
/* 17 */            this.I00100l0 = list;
/* 18 */            this.I00100o1O0lo = list2;
                }

                public final i01Ii0ooO I00000oIO() {
                    int i;
                    long j;
                    long jI00000oIO;
/* 3 */             List list = this.I00100o1O0lo;
/* 23 */            Ii11I1OOII1 ii11I1OOII1 = !list.isEmpty() ? (Ii11I1OOII1) list.get(0) : Ii11I1OOII1.I00000oOI;
/* 30 */            UUID uuidFromString = UUID.fromString(this.I00000oIO);
/* 40 */            HashSet hashSet = new HashSet(this.I00100l0);
/* 43 */            long j2 = this.I0000oI00;
/* 59 */            i01IOOI i01iooi = j2 != 0 ? new i01IOOI(j2, this.I0001Ioi1lo) : null;
/* 60 */            i01IOiO1lO i01ioio1lo = i01IOiO1lO.I00iOIl;
/* 63 */            i01IOiO1lO i01ioio1lo2 = this.I00000oOI;
/* 66 */            int i2 = this.I000O01llI0;
/* 68 */            long j3 = this.I0000O;
/* 70 */            if (i01ioio1lo2 == i01ioio1lo) {
/* 72 */                i01OiOoi i01oiooi = WorkSpec.Companion;
/* 83 */                boolean z = i01ioio1lo2 == i01ioio1lo && i2 > 0;
/* 89 */                boolean z2 = j2 != 0;
/* 91 */                i01oiooi.getClass();
/* 96 */                j = j3;
/* 117 */               jI00000oIO = i01OiOoi.I00000oIO(z, i2, this.I000OOo1O, this.I000OiO, this.I000iOII, this.I000l1, z2, j, this.I0001Ioi1lo, j2, this.I000o00OoI0I);
/* 121 */               i = i2;
                    } else {
/* 125 */               i = i2;
/* 126 */               j = j3;
/* 128 */               jI00000oIO = Long.MAX_VALUE;
                    }
/* 147 */           return new i01Ii0ooO(uuidFromString, i01ioio1lo2, hashSet, this.I0000Il00O, ii11I1OOII1, i, this.I000lI, this.I000II, j, i01iooi, jI00000oIO, this.I000oI1ioi);
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 171 */               return true;
                    }
/* 7 */             if (!(obj instanceof i01Ol11)) {
/* 169 */               return false;
                    }
/* 11 */            i01Ol11 i01ol11 = (i01Ol11) obj;
                    return O0000Ioio00.I0000O(this.I00000oIO, i01ol11.I00000oIO) && this.I00000oOI == i01ol11.I00000oOI && O0000Ioio00.I0000O(this.I0000Il00O, i01ol11.I0000Il00O) && this.I0000O == i01ol11.I0000O && this.I0000oI00 == i01ol11.I0000oI00 && this.I0001Ioi1lo == i01ol11.I0001Ioi1lo && this.I000II.equals(i01ol11.I000II) && this.I000O01llI0 == i01ol11.I000O01llI0 && this.I000OOo1O == i01ol11.I000OOo1O && this.I000OiO == i01ol11.I000OiO && this.I000iOII == i01ol11.I000iOII && this.I000l1 == i01ol11.I000l1 && this.I000lI == i01ol11.I000lI && this.I000o00OoI0I == i01ol11.I000o00OoI0I && this.I000oI1ioi == i01ol11.I000oI1ioi && this.I00100l0.equals(i01ol11.I00100l0) && this.I00100o1O0lo.equals(i01ol11.I00100o1O0lo);
                }

                public final int hashCode() {
/* 114 */           return this.I00100o1O0lo.hashCode() + IIl001iO0Io.I0000oI00(IIl001iO0Io.I0000O(this.I000oI1ioi, IIlIOloOOO.I0000O(this.I000o00OoI0I, IIl001iO0Io.I0000O(this.I000lI, IIl001iO0Io.I0000O(this.I000l1, IIlIOloOOO.I0000O(this.I000iOII, IIlIOloOOO.I0000O(this.I000OiO, (this.I000OOo1O.hashCode() + IIl001iO0Io.I0000O(this.I000O01llI0, (this.I000II.hashCode() + IIlIOloOOO.I0000O(this.I0001Ioi1lo, IIlIOloOOO.I0000O(this.I0000oI00, IIlIOloOOO.I0000O(this.I0000O, (this.I0000Il00O.hashCode() + ((this.I00000oOI.hashCode() + (this.I00000oIO.hashCode() * 31)) * 31)) * 31, 31), 31), 31)) * 31, 31)) * 31, 31), 31), 31), 31), 31), 31), 31, this.I00100l0);
                }

                public final String toString() {
/* 178 */           return "WorkInfoPojo(id=" + this.I00000oIO + ", state=" + this.I00000oOI + ", output=" + this.I0000Il00O + ", initialDelay=" + this.I0000O + ", intervalDuration=" + this.I0000oI00 + ", flexDuration=" + this.I0001Ioi1lo + ", constraints=" + this.I000II + ", runAttemptCount=" + this.I000O01llI0 + ", backoffPolicy=" + this.I000OOo1O + ", backoffDelayDuration=" + this.I000OiO + ", lastEnqueueTime=" + this.I000iOII + ", periodCount=" + this.I000l1 + ", generation=" + this.I000lI + ", nextScheduleTimeOverride=" + this.I000o00OoI0I + ", stopReason=" + this.I000oI1ioi + ", tags=" + this.I00100l0 + ", progress=" + this.I00100o1O0lo + ')';
                }
            }
