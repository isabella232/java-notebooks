/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/notebooks/v1beta1/environment.proto

package com.google.cloud.notebooks.v1beta1;

/**
 *
 *
 * <pre>
 * Definition of a container image for starting a notebook instance with the
 * environment installed in a container.
 * </pre>
 *
 * Protobuf type {@code google.cloud.notebooks.v1beta1.ContainerImage}
 */
public final class ContainerImage extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.notebooks.v1beta1.ContainerImage)
    ContainerImageOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ContainerImage.newBuilder() to construct.
  private ContainerImage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ContainerImage() {
    repository_ = "";
    tag_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ContainerImage();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private ContainerImage(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10:
            {
              java.lang.String s = input.readStringRequireUtf8();

              repository_ = s;
              break;
            }
          case 18:
            {
              java.lang.String s = input.readStringRequireUtf8();

              tag_ = s;
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.notebooks.v1beta1.EnvironmentProto
        .internal_static_google_cloud_notebooks_v1beta1_ContainerImage_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.notebooks.v1beta1.EnvironmentProto
        .internal_static_google_cloud_notebooks_v1beta1_ContainerImage_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.notebooks.v1beta1.ContainerImage.class,
            com.google.cloud.notebooks.v1beta1.ContainerImage.Builder.class);
  }

  public static final int REPOSITORY_FIELD_NUMBER = 1;
  private volatile java.lang.Object repository_;
  /**
   *
   *
   * <pre>
   * Required. The path to the container image repository. For example:
   * `gcr.io/{project_id}/{image_name}`
   * </pre>
   *
   * <code>string repository = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The repository.
   */
  @java.lang.Override
  public java.lang.String getRepository() {
    java.lang.Object ref = repository_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      repository_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The path to the container image repository. For example:
   * `gcr.io/{project_id}/{image_name}`
   * </pre>
   *
   * <code>string repository = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for repository.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getRepositoryBytes() {
    java.lang.Object ref = repository_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      repository_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TAG_FIELD_NUMBER = 2;
  private volatile java.lang.Object tag_;
  /**
   *
   *
   * <pre>
   * The tag of the container image. If not specified, this defaults
   * to the latest tag.
   * </pre>
   *
   * <code>string tag = 2;</code>
   *
   * @return The tag.
   */
  @java.lang.Override
  public java.lang.String getTag() {
    java.lang.Object ref = tag_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      tag_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The tag of the container image. If not specified, this defaults
   * to the latest tag.
   * </pre>
   *
   * <code>string tag = 2;</code>
   *
   * @return The bytes for tag.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getTagBytes() {
    java.lang.Object ref = tag_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      tag_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (!getRepositoryBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, repository_);
    }
    if (!getTagBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, tag_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getRepositoryBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, repository_);
    }
    if (!getTagBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, tag_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.cloud.notebooks.v1beta1.ContainerImage)) {
      return super.equals(obj);
    }
    com.google.cloud.notebooks.v1beta1.ContainerImage other =
        (com.google.cloud.notebooks.v1beta1.ContainerImage) obj;

    if (!getRepository().equals(other.getRepository())) return false;
    if (!getTag().equals(other.getTag())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + REPOSITORY_FIELD_NUMBER;
    hash = (53 * hash) + getRepository().hashCode();
    hash = (37 * hash) + TAG_FIELD_NUMBER;
    hash = (53 * hash) + getTag().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.notebooks.v1beta1.ContainerImage parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.notebooks.v1beta1.ContainerImage parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.notebooks.v1beta1.ContainerImage parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.notebooks.v1beta1.ContainerImage parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.notebooks.v1beta1.ContainerImage parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.notebooks.v1beta1.ContainerImage parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.notebooks.v1beta1.ContainerImage parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.notebooks.v1beta1.ContainerImage parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.notebooks.v1beta1.ContainerImage parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.notebooks.v1beta1.ContainerImage parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.notebooks.v1beta1.ContainerImage parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.notebooks.v1beta1.ContainerImage parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.google.cloud.notebooks.v1beta1.ContainerImage prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Definition of a container image for starting a notebook instance with the
   * environment installed in a container.
   * </pre>
   *
   * Protobuf type {@code google.cloud.notebooks.v1beta1.ContainerImage}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.notebooks.v1beta1.ContainerImage)
      com.google.cloud.notebooks.v1beta1.ContainerImageOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.notebooks.v1beta1.EnvironmentProto
          .internal_static_google_cloud_notebooks_v1beta1_ContainerImage_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.notebooks.v1beta1.EnvironmentProto
          .internal_static_google_cloud_notebooks_v1beta1_ContainerImage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.notebooks.v1beta1.ContainerImage.class,
              com.google.cloud.notebooks.v1beta1.ContainerImage.Builder.class);
    }

    // Construct using com.google.cloud.notebooks.v1beta1.ContainerImage.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      repository_ = "";

      tag_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.notebooks.v1beta1.EnvironmentProto
          .internal_static_google_cloud_notebooks_v1beta1_ContainerImage_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.notebooks.v1beta1.ContainerImage getDefaultInstanceForType() {
      return com.google.cloud.notebooks.v1beta1.ContainerImage.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.notebooks.v1beta1.ContainerImage build() {
      com.google.cloud.notebooks.v1beta1.ContainerImage result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.notebooks.v1beta1.ContainerImage buildPartial() {
      com.google.cloud.notebooks.v1beta1.ContainerImage result =
          new com.google.cloud.notebooks.v1beta1.ContainerImage(this);
      result.repository_ = repository_;
      result.tag_ = tag_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.notebooks.v1beta1.ContainerImage) {
        return mergeFrom((com.google.cloud.notebooks.v1beta1.ContainerImage) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.notebooks.v1beta1.ContainerImage other) {
      if (other == com.google.cloud.notebooks.v1beta1.ContainerImage.getDefaultInstance())
        return this;
      if (!other.getRepository().isEmpty()) {
        repository_ = other.repository_;
        onChanged();
      }
      if (!other.getTag().isEmpty()) {
        tag_ = other.tag_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.cloud.notebooks.v1beta1.ContainerImage parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.notebooks.v1beta1.ContainerImage) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object repository_ = "";
    /**
     *
     *
     * <pre>
     * Required. The path to the container image repository. For example:
     * `gcr.io/{project_id}/{image_name}`
     * </pre>
     *
     * <code>string repository = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The repository.
     */
    public java.lang.String getRepository() {
      java.lang.Object ref = repository_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        repository_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The path to the container image repository. For example:
     * `gcr.io/{project_id}/{image_name}`
     * </pre>
     *
     * <code>string repository = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The bytes for repository.
     */
    public com.google.protobuf.ByteString getRepositoryBytes() {
      java.lang.Object ref = repository_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        repository_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The path to the container image repository. For example:
     * `gcr.io/{project_id}/{image_name}`
     * </pre>
     *
     * <code>string repository = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The repository to set.
     * @return This builder for chaining.
     */
    public Builder setRepository(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      repository_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The path to the container image repository. For example:
     * `gcr.io/{project_id}/{image_name}`
     * </pre>
     *
     * <code>string repository = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearRepository() {

      repository_ = getDefaultInstance().getRepository();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The path to the container image repository. For example:
     * `gcr.io/{project_id}/{image_name}`
     * </pre>
     *
     * <code>string repository = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The bytes for repository to set.
     * @return This builder for chaining.
     */
    public Builder setRepositoryBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      repository_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object tag_ = "";
    /**
     *
     *
     * <pre>
     * The tag of the container image. If not specified, this defaults
     * to the latest tag.
     * </pre>
     *
     * <code>string tag = 2;</code>
     *
     * @return The tag.
     */
    public java.lang.String getTag() {
      java.lang.Object ref = tag_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        tag_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The tag of the container image. If not specified, this defaults
     * to the latest tag.
     * </pre>
     *
     * <code>string tag = 2;</code>
     *
     * @return The bytes for tag.
     */
    public com.google.protobuf.ByteString getTagBytes() {
      java.lang.Object ref = tag_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        tag_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The tag of the container image. If not specified, this defaults
     * to the latest tag.
     * </pre>
     *
     * <code>string tag = 2;</code>
     *
     * @param value The tag to set.
     * @return This builder for chaining.
     */
    public Builder setTag(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      tag_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The tag of the container image. If not specified, this defaults
     * to the latest tag.
     * </pre>
     *
     * <code>string tag = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearTag() {

      tag_ = getDefaultInstance().getTag();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The tag of the container image. If not specified, this defaults
     * to the latest tag.
     * </pre>
     *
     * <code>string tag = 2;</code>
     *
     * @param value The bytes for tag to set.
     * @return This builder for chaining.
     */
    public Builder setTagBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      tag_ = value;
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.notebooks.v1beta1.ContainerImage)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.notebooks.v1beta1.ContainerImage)
  private static final com.google.cloud.notebooks.v1beta1.ContainerImage DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.notebooks.v1beta1.ContainerImage();
  }

  public static com.google.cloud.notebooks.v1beta1.ContainerImage getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ContainerImage> PARSER =
      new com.google.protobuf.AbstractParser<ContainerImage>() {
        @java.lang.Override
        public ContainerImage parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new ContainerImage(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<ContainerImage> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ContainerImage> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.notebooks.v1beta1.ContainerImage getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}