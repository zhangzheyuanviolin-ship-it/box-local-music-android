            package p000;

            import java.util.Collection;
            import java.util.Iterator;
            import java.util.Map;
            import java.util.Objects;
            
            public final class ii0iloI implements Iterator {
                public Iterator I00iOIl;
                public Object I00iiI;
                public Collection I00iiO;
                public Iterator I00iio;
                public iii1IlooII I00ilI0I1;

                @Override
                public final boolean hasNext() {
                    return this.I00iOIl.hasNext() || this.I00iio.hasNext();
                }

                @Override
                public final Object next() {
/* 7 */             if (!this.I00iio.hasNext()) {
/* 15 */                Map.Entry entry = (Map.Entry) this.I00iOIl.next();
/* 21 */                this.I00iiI = entry.getKey();
/* 27 */                Collection collection = (Collection) entry.getValue();
/* 29 */                this.I00iiO = collection;
/* 35 */                this.I00iio = collection.iterator();
                    }
/* 47 */            return new iiolOoolOo(this.I00iiI, this.I00iio.next());
                }

                @Override
                public final void remove() {
/* 3 */             this.I00iio.remove();
/* 6 */             Collection collection = this.I00iiO;
/* 8 */             Objects.requireNonNull(collection);
/* 17 */            if (collection.isEmpty()) {
/* 21 */                this.I00iOIl.remove();
                    }
/* 24 */            iii1IlooII iii1ilooii = this.I00ilI0I1;
                    iii1ilooii.I00ilI0I1--;
                }
            }
