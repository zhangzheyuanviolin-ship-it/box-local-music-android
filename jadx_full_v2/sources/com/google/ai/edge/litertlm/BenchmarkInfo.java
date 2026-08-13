            package com.google.ai.edge.litertlm;

            import kotlin.Metadata;
            import p000.IIl001iO0Io;
            
            @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003JE\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001e\u001a\u00020\u0006HÖ\u0081\u0004J\n\u0010\u001f\u001a\u00020 HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r¨\u0006!"}, d2 = {"Lcom/google/ai/edge/litertlm/BenchmarkInfo;", "", "initTimeInSecond", "", "timeToFirstTokenInSecond", "lastPrefillTokenCount", "", "lastDecodeTokenCount", "lastPrefillTokensPerSecond", "lastDecodeTokensPerSecond", "<init>", "(DDIIDD)V", "getInitTimeInSecond", "()D", "getTimeToFirstTokenInSecond", "getLastPrefillTokenCount", "()I", "getLastDecodeTokenCount", "getLastPrefillTokensPerSecond", "getLastDecodeTokensPerSecond", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "", "third_party.odml.litert_lm.kotlin.java.com.google.ai.edge.litertlm_litertlm-android"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
            public final class BenchmarkInfo {
                private final double initTimeInSecond;
                private final int lastDecodeTokenCount;
                private final double lastDecodeTokensPerSecond;
                private final int lastPrefillTokenCount;
                private final double lastPrefillTokensPerSecond;
                private final double timeToFirstTokenInSecond;

                public BenchmarkInfo(double d, double d2, int i, int i2, double d3, double d4) {
/* 4 */             this.initTimeInSecond = d;
/* 6 */             this.timeToFirstTokenInSecond = d2;
/* 8 */             this.lastPrefillTokenCount = i;
/* 10 */            this.lastDecodeTokenCount = i2;
/* 12 */            this.lastPrefillTokensPerSecond = d3;
/* 14 */            this.lastDecodeTokensPerSecond = d4;
                }

                public static BenchmarkInfo copy$default(BenchmarkInfo benchmarkInfo, double d, double d2, int i, int i2, double d3, double d4, int i3, Object obj) {
/* 3 */             if ((i3 & 1) != 0) {
/* 5 */                 d = benchmarkInfo.initTimeInSecond;
                    }
/* 7 */             double d5 = d;
/* 10 */            if ((i3 & 2) != 0) {
/* 12 */                d2 = benchmarkInfo.timeToFirstTokenInSecond;
                    }
/* 57 */            return benchmarkInfo.copy(d5, d2, (i3 & 4) != 0 ? benchmarkInfo.lastPrefillTokenCount : i, (i3 & 8) != 0 ? benchmarkInfo.lastDecodeTokenCount : i2, (i3 & 16) != 0 ? benchmarkInfo.lastPrefillTokensPerSecond : d3, (i3 & 32) != 0 ? benchmarkInfo.lastDecodeTokensPerSecond : d4);
                }

                public final double getInitTimeInSecond() {
/* 1 */             return this.initTimeInSecond;
                }

                public final double getTimeToFirstTokenInSecond() {
/* 1 */             return this.timeToFirstTokenInSecond;
                }

                public final int getLastPrefillTokenCount() {
/* 1 */             return this.lastPrefillTokenCount;
                }

                public final int getLastDecodeTokenCount() {
/* 1 */             return this.lastDecodeTokenCount;
                }

                public final double getLastPrefillTokensPerSecond() {
/* 1 */             return this.lastPrefillTokensPerSecond;
                }

                public final double getLastDecodeTokensPerSecond() {
/* 1 */             return this.lastDecodeTokensPerSecond;
                }

                public final BenchmarkInfo copy(double initTimeInSecond, double timeToFirstTokenInSecond, int lastPrefillTokenCount, int lastDecodeTokenCount, double lastPrefillTokensPerSecond, double lastDecodeTokensPerSecond) {
/* 3 */             return new BenchmarkInfo(initTimeInSecond, timeToFirstTokenInSecond, lastPrefillTokenCount, lastDecodeTokenCount, lastPrefillTokensPerSecond, lastDecodeTokensPerSecond);
                }

                public boolean equals(Object other) {
/* 2 */             if (this == other) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(other instanceof BenchmarkInfo)) {
/* 7 */                 return false;
                    }
/* 11 */            BenchmarkInfo benchmarkInfo = (BenchmarkInfo) other;
                    return Double.compare(this.initTimeInSecond, benchmarkInfo.initTimeInSecond) == 0 && Double.compare(this.timeToFirstTokenInSecond, benchmarkInfo.timeToFirstTokenInSecond) == 0 && this.lastPrefillTokenCount == benchmarkInfo.lastPrefillTokenCount && this.lastDecodeTokenCount == benchmarkInfo.lastDecodeTokenCount && Double.compare(this.lastPrefillTokensPerSecond, benchmarkInfo.lastPrefillTokensPerSecond) == 0 && Double.compare(this.lastDecodeTokensPerSecond, benchmarkInfo.lastDecodeTokensPerSecond) == 0;
                }

                public final double getInitTimeInSecond() {
/* 1 */             return this.initTimeInSecond;
                }

                public final int getLastDecodeTokenCount() {
/* 1 */             return this.lastDecodeTokenCount;
                }

                public final double getLastDecodeTokensPerSecond() {
/* 1 */             return this.lastDecodeTokensPerSecond;
                }

                public final int getLastPrefillTokenCount() {
/* 1 */             return this.lastPrefillTokenCount;
                }

                public final double getLastPrefillTokensPerSecond() {
/* 1 */             return this.lastPrefillTokensPerSecond;
                }

                public final double getTimeToFirstTokenInSecond() {
/* 1 */             return this.timeToFirstTokenInSecond;
                }

                public int hashCode() {
/* 44 */            return Double.hashCode(this.lastDecodeTokensPerSecond) + ((Double.hashCode(this.lastPrefillTokensPerSecond) + IIl001iO0Io.I0000O(this.lastDecodeTokenCount, IIl001iO0Io.I0000O(this.lastPrefillTokenCount, (Double.hashCode(this.timeToFirstTokenInSecond) + (Double.hashCode(this.initTimeInSecond) * 31)) * 31, 31), 31)) * 31);
                }

                public String toString() {
/* 68 */            return "BenchmarkInfo(initTimeInSecond=" + this.initTimeInSecond + ", timeToFirstTokenInSecond=" + this.timeToFirstTokenInSecond + ", lastPrefillTokenCount=" + this.lastPrefillTokenCount + ", lastDecodeTokenCount=" + this.lastDecodeTokenCount + ", lastPrefillTokensPerSecond=" + this.lastPrefillTokensPerSecond + ", lastDecodeTokensPerSecond=" + this.lastDecodeTokensPerSecond + ")";
                }
            }
