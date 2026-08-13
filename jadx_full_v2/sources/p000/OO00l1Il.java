            package p000;

            import android.os.Parcel;
            import android.os.Parcelable;
            import androidx.work.impl.model.WorkSpec;
            import java.util.ArrayList;
            
            public final class OO00l1Il implements Parcelable {
                public static final Parcelable.Creator<OO00l1Il> CREATOR = new OO00iO(1);
                public i01OOII I00iOIl;

                public OO00l1Il(i01OOII i01ooii) {
/* 4 */             this.I00iOIl = i01ooii;
                }

                @Override
                public final int describeContents() {
/* 1 */             return 0;
                }

                @Override
                public final void writeToParcel(Parcel parcel, int i) {
/* 1 */             i01OOII i01ooii = this.I00iOIl;
/* 9 */             parcel.writeString(i01ooii.I00000oIO.toString());
/* 19 */            parcel.writeStringList(new ArrayList(i01ooii.I0000Il00O));
/* 22 */            WorkSpec workSpec = i01ooii.I00000oOI;
/* 26 */            parcel.writeString(workSpec.workerClassName);
/* 31 */            parcel.writeString(workSpec.inputMergerClassName);
/* 40 */            parcel.writeInt(liIOOIo0.I000iOII(workSpec.state));
/* 43 */            Ii11I1OOII1 ii11I1OOII1 = workSpec.input;
/* 45 */            Ii11I1OOII1 ii11I1OOII12 = Ii11I1OOII1.I00000oOI;
/* 51 */            parcel.writeByteArray(il01ool0o.I0000Il00O(ii11I1OOII1));
/* 60 */            parcel.writeByteArray(il01ool0o.I0000Il00O(workSpec.output));
/* 65 */            parcel.writeLong(workSpec.initialDelay);
/* 70 */            parcel.writeLong(workSpec.intervalDuration);
/* 75 */            parcel.writeLong(workSpec.flexDuration);
/* 80 */            parcel.writeInt(workSpec.runAttemptCount);
/* 90 */            parcel.writeParcelable(new OIolIIO(workSpec.constraints), i);
/* 99 */            parcel.writeInt(liIOOIo0.I00000oIO(workSpec.backoffPolicy));
/* 104 */           parcel.writeLong(workSpec.backoffDelayDuration);
/* 109 */           parcel.writeLong(workSpec.minimumRetentionDuration);
/* 114 */           parcel.writeLong(workSpec.scheduleRequestedAt);
/* 119 */           parcel.writeInt(workSpec.expedited ? 1 : 0);
/* 128 */           parcel.writeInt(liIOOIo0.I000OOo1O(workSpec.outOfQuotaPolicy));
/* 135 */           parcel.writeString(workSpec.getTraceTag());
                }
            }
