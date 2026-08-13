            package androidx.work.impl.model;

            import kotlin.Metadata;
            import p000.O0000Ioio00;
            
            @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\rJ$\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Landroidx/work/impl/model/Preference;", "", "key", "", "value", "", "<init>", "(Ljava/lang/String;Ljava/lang/Long;)V", "", "(Ljava/lang/String;Z)V", "getKey", "()Ljava/lang/String;", "getValue", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "component2", "copy", "(Ljava/lang/String;Ljava/lang/Long;)Landroidx/work/impl/model/Preference;", "equals", "other", "hashCode", "", "toString", "work-runtime_release"}, m18k = 1, mv = {2, 1, 0}, xi = 48)
/* 14 */    public final class Preference {
                private final String key;
                private final Long value;

                public Preference(String str, boolean z) {
/* 12 */            this(str, Long.valueOf(z ? 1L : 0L));
                }

                public static Preference copy$default(Preference preference, String str, Long l, int i, Object obj) {
/* 3 */             if ((i & 1) != 0) {
/* 5 */                 str = preference.key;
                    }
/* 9 */             if ((i & 2) != 0) {
/* 11 */                l = preference.value;
                    }
/* 13 */            return preference.copy(str, l);
                }

                public final String getKey() {
/* 1 */             return this.key;
                }

                public final Long getValue() {
/* 1 */             return this.value;
                }

                public final Preference copy(String key, Long value) {
/* 3 */             return new Preference(key, value);
                }

                public boolean equals(Object other) {
/* 2 */             if (this == other) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(other instanceof Preference)) {
/* 7 */                 return false;
                    }
/* 11 */            Preference preference = (Preference) other;
                    return O0000Ioio00.I0000O(this.key, preference.key) && O0000Ioio00.I0000O(this.value, preference.value);
                }

                public final String getKey() {
/* 1 */             return this.key;
                }

                public final Long getValue() {
/* 1 */             return this.value;
                }

                public int hashCode() {
/* 7 */             int iHashCode = this.key.hashCode() * 31;
/* 9 */             Long l = this.value;
/* 19 */            return iHashCode + (l == null ? 0 : l.hashCode());
                }

                public String toString() {
/* 28 */            return "Preference(key=" + this.key + ", value=" + this.value + ')';
                }

/* 15 */        public Preference(String str, Long l) {
/* 17 */            this.key = str;
/* 18 */            this.value = l;
                }
            }
