            package io.github.darriousliu.katex.freetype;

            import kotlin.Metadata;
            
            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\f\u001a\u00020\rH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u000e"}, d2 = {"Lio/github/darriousliu/katex/freetype/LibraryVersion;", "", "major", "", "minor", "patch", "<init>", "(III)V", "getMajor", "()I", "getMinor", "getPatch", "toString", "", "katex-core_release"}, m18k = 1, mv = {2, 2, 0}, xi = 48)
            public final class LibraryVersion {
                public static final int $stable = 0;
                private final int major;
                private final int minor;
                private final int patch;

                public LibraryVersion(int i, int i2, int i3) {
/* 4 */             this.major = i;
/* 6 */             this.minor = i2;
/* 8 */             this.patch = i3;
                }

                public final int getMajor() {
/* 1 */             return this.major;
                }

                public final int getMinor() {
/* 1 */             return this.minor;
                }

                public final int getPatch() {
/* 1 */             return this.patch;
                }

                public String toString() {
/* 29 */            return this.major + "." + this.minor + "." + this.patch;
                }
            }
