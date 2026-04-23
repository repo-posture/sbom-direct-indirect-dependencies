#!/usr/bin/env python3
"""Main entry point for Bazel SBOM test application."""

from lib import greet

def main():
    """Main function."""
    print(greet("Bazel SBOM Test"))
    print("This is a test application for Bazel dependency tracking")

if __name__ == "__main__":
    main()
