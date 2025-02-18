/*
 * Licensed to Elasticsearch B.V. under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch B.V. licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

//----------------------------------------------------
// THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------

package co.elastic.clients.elasticsearch._types.aggregations;

import co.elastic.clients.elasticsearch._types.Script;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.aggregations.BucketSelectorAggregation

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.aggregations.BucketSelectorAggregation">API
 *      specification</a>
 */
@JsonpDeserializable
public class BucketSelectorAggregation extends PipelineAggregationBase implements AggregationVariant {
	@Nullable
	private final Script script;

	// ---------------------------------------------------------------------------------------------

	private BucketSelectorAggregation(Builder builder) {
		super(builder);

		this.script = builder.script;

	}

	public static BucketSelectorAggregation of(Function<Builder, ObjectBuilder<BucketSelectorAggregation>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Aggregation variant kind.
	 */
	@Override
	public Aggregation.Kind _aggregationKind() {
		return Aggregation.Kind.BucketSelector;
	}

	/**
	 * The script to run for this aggregation.
	 * <p>
	 * API name: {@code script}
	 */
	@Nullable
	public final Script script() {
		return this.script;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		if (this.script != null) {
			generator.writeKey("script");
			this.script.serialize(generator, mapper);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link BucketSelectorAggregation}.
	 */

	public static class Builder extends PipelineAggregationBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<BucketSelectorAggregation> {
		@Nullable
		private Script script;

		/**
		 * The script to run for this aggregation.
		 * <p>
		 * API name: {@code script}
		 */
		public final Builder script(@Nullable Script value) {
			this.script = value;
			return this;
		}

		/**
		 * The script to run for this aggregation.
		 * <p>
		 * API name: {@code script}
		 */
		public final Builder script(Function<Script.Builder, ObjectBuilder<Script>> fn) {
			return this.script(fn.apply(new Script.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link BucketSelectorAggregation}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public BucketSelectorAggregation build() {
			_checkSingleUse();

			return new BucketSelectorAggregation(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link BucketSelectorAggregation}
	 */
	public static final JsonpDeserializer<BucketSelectorAggregation> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, BucketSelectorAggregation::setupBucketSelectorAggregationDeserializer);

	protected static void setupBucketSelectorAggregationDeserializer(
			ObjectDeserializer<BucketSelectorAggregation.Builder> op) {
		PipelineAggregationBase.setupPipelineAggregationBaseDeserializer(op);
		op.add(Builder::script, Script._DESERIALIZER, "script");

	}

}
