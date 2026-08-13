            package com.k2fsa.sherpa.onnx;

            import kotlin.Metadata;
            import p000.Oi010OO0;
            import p000.OooioIOo1;
            
            @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0017"}, d2 = {"Lcom/k2fsa/sherpa/onnx/OfflineSpeakerDiarizationSegment;", "", "start", "", "end", "speaker", "", "(FFI)V", "getEnd", "()F", "getSpeaker", "()I", "getStart", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "sherpa_onnx_release"}, m18k = 1, mv = {1, 7, 1}, xi = 48)
            public final class OfflineSpeakerDiarizationSegment {
                private final float end;
                private final int speaker;
                private final float start;

                public OfflineSpeakerDiarizationSegment(float f, float f2, int i) {
/* 4 */             this.start = f;
/* 6 */             this.end = f2;
/* 8 */             this.speaker = i;
                }

                public static OfflineSpeakerDiarizationSegment copy$default(OfflineSpeakerDiarizationSegment offlineSpeakerDiarizationSegment, float f, float f2, int i, int i2, Object obj) {
/* 3 */             if ((i2 & 1) != 0) {
/* 5 */                 f = offlineSpeakerDiarizationSegment.start;
                    }
/* 9 */             if ((i2 & 2) != 0) {
/* 11 */                f2 = offlineSpeakerDiarizationSegment.end;
                    }
/* 15 */            if ((i2 & 4) != 0) {
/* 17 */                i = offlineSpeakerDiarizationSegment.speaker;
                    }
/* 19 */            return offlineSpeakerDiarizationSegment.copy(f, f2, i);
                }

                public final float getStart() {
/* 1 */             return this.start;
                }

                public final float getEnd() {
/* 1 */             return this.end;
                }

                public final int getSpeaker() {
/* 1 */             return this.speaker;
                }

                public final OfflineSpeakerDiarizationSegment copy(float start, float end, int speaker) {
/* 3 */             return new OfflineSpeakerDiarizationSegment(start, end, speaker);
                }

                public boolean equals(Object other) {
/* 2 */             if (this == other) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(other instanceof OfflineSpeakerDiarizationSegment)) {
/* 7 */                 return false;
                    }
/* 11 */            OfflineSpeakerDiarizationSegment offlineSpeakerDiarizationSegment = (OfflineSpeakerDiarizationSegment) other;
                    return Float.compare(this.start, offlineSpeakerDiarizationSegment.start) == 0 && Float.compare(this.end, offlineSpeakerDiarizationSegment.end) == 0 && this.speaker == offlineSpeakerDiarizationSegment.speaker;
                }

                public final float getEnd() {
/* 1 */             return this.end;
                }

                public final int getSpeaker() {
/* 1 */             return this.speaker;
                }

                public final float getStart() {
/* 1 */             return this.start;
                }

                public int hashCode() {
/* 22 */            return Integer.hashCode(this.speaker) + OooioIOo1.I0000O(Float.hashCode(this.start) * 31, 31, this.end);
                }

                public String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("OfflineSpeakerDiarizationSegment(start=");
/* 10 */            sb.append(this.start);
/* 15 */            sb.append(", end=");
/* 20 */            sb.append(this.end);
/* 25 */            sb.append(", speaker=");
/* 32 */            return Oi010OO0.I001i1lo1io(sb, this.speaker, ')');
                }
            }
