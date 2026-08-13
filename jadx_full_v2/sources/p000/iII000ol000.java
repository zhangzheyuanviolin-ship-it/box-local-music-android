            package p000;

            import android.os.Parcel;
            import android.os.Parcelable;
            
/* 50 */    public final class iII000ol000 extends I01OlIoIl {
                public static final Parcelable.Creator<iII000ol000> CREATOR = new i1I1lI001Io0(19);
                public String I00iOIl;
                public String I00iiI;
                public lio0llOI0 I00iiO;
                public long I00iio;
                public boolean I00ilI0I1;
                public String I00ilO0;
                public final ii0oooi0IO0l I00io1l;
                public long I00ioIO;
                public ii0oooi0IO0l I00l0I0l0lO1;
                public final long I00l0OO0IO;
                public final ii0oooi0IO0l I00li1OI;

                public iII000ol000(iII000ol000 iii000ol000) {
/* 4 */             lII0I0I000I.I000II(iii000ol000);
/* 9 */             this.I00iOIl = iii000ol000.I00iOIl;
/* 13 */            this.I00iiI = iii000ol000.I00iiI;
/* 17 */            this.I00iiO = iii000ol000.I00iiO;
/* 21 */            this.I00iio = iii000ol000.I00iio;
/* 25 */            this.I00ilI0I1 = iii000ol000.I00ilI0I1;
/* 29 */            this.I00ilO0 = iii000ol000.I00ilO0;
/* 33 */            this.I00io1l = iii000ol000.I00io1l;
/* 37 */            this.I00ioIO = iii000ol000.I00ioIO;
/* 41 */            this.I00l0I0l0lO1 = iii000ol000.I00l0I0l0lO1;
/* 45 */            this.I00l0OO0IO = iii000ol000.I00l0OO0IO;
/* 49 */            this.I00li1OI = iii000ol000.I00li1OI;
                }

                @Override
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iI00100l0 = lO0IioIooIl.I00100l0(20293, parcel);
/* 10 */            lO0IioIooIl.I000OiO(parcel, 2, this.I00iOIl);
/* 16 */            lO0IioIooIl.I000OiO(parcel, 3, this.I00iiI);
/* 22 */            lO0IioIooIl.I000OOo1O(parcel, 4, this.I00iiO, i);
/* 25 */            long j = this.I00iio;
/* 30 */            lO0IioIooIl.I000oI1ioi(parcel, 5, 8);
/* 33 */            parcel.writeLong(j);
/* 36 */            boolean z = this.I00ilI0I1;
/* 39 */            lO0IioIooIl.I000oI1ioi(parcel, 6, 4);
/* 42 */            parcel.writeInt(z ? 1 : 0);
/* 48 */            lO0IioIooIl.I000OiO(parcel, 7, this.I00ilO0);
/* 53 */            lO0IioIooIl.I000OOo1O(parcel, 8, this.I00io1l, i);
/* 56 */            long j2 = this.I00ioIO;
/* 60 */            lO0IioIooIl.I000oI1ioi(parcel, 9, 8);
/* 63 */            parcel.writeLong(j2);
/* 70 */            lO0IioIooIl.I000OOo1O(parcel, 10, this.I00l0I0l0lO1, i);
/* 75 */            lO0IioIooIl.I000oI1ioi(parcel, 11, 8);
/* 80 */            parcel.writeLong(this.I00l0OO0IO);
/* 87 */            lO0IioIooIl.I000OOo1O(parcel, 12, this.I00li1OI, i);
/* 90 */            lO0IioIooIl.I00100o1O0lo(iI00100l0, parcel);
                }

/* 51 */        public iII000ol000(String str, String str2, lio0llOI0 lio0lloi0, long j, boolean z, String str3, ii0oooi0IO0l ii0oooi0io0l, long j2, ii0oooi0IO0l ii0oooi0io0l2, long j3, ii0oooi0IO0l ii0oooi0io0l3) {
/* 53 */            this.I00iOIl = str;
                    this.I00iiI = str2;
                    this.I00iiO = lio0lloi0;
                    this.I00iio = j;
                    this.I00ilI0I1 = z;
                    this.I00ilO0 = str3;
                    this.I00io1l = ii0oooi0io0l;
                    this.I00ioIO = j2;
                    this.I00l0I0l0lO1 = ii0oooi0io0l2;
                    this.I00l0OO0IO = j3;
                    this.I00li1OI = ii0oooi0io0l3;
                }
            }
